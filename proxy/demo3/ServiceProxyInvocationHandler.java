package proxy.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import proxy.common.AccessDeniedException;
import proxy.common.NetworkService;
import proxy.common.NetworkType;
import proxy.common.Service;

public class ServiceProxyInvocationHandler implements InvocationHandler {

	private Service service;
	private NetworkType networkType;

	public ServiceProxyInvocationHandler(NetworkType networkType) {
		this.networkType = networkType;
		// We'll NOT create the actual network service unless it is required
	}

	// Restricted URLs (Consistent style with Demo 1)
	static List<String> restrictedUrls = new ArrayList<String>();
	static {
		restrictedUrls.add("facebook.com");
		restrictedUrls.add("tiktok.com");
		// Add other URLs, if needed
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		// Dynamic proxy check: only apply our logic to the 'connect' method.
		if (method.getName().equals("connect") && args.length == 1 && args[0] instanceof String) {

			// Extract the URL argument
			String url = (String) args[0];

			// The logic for the protection proxy (Identical to Demo 1)
			if(	networkType == NetworkType.CORPORATE) {
				String urlLowerCase = url.toLowerCase();
				for (String restricted : restrictedUrls) {
					if (urlLowerCase.contains(restricted)) {
						throw new AccessDeniedException("You cannot connect to " + url + " as per company policy");
					}
				}
			}

			// Lazy initialization: the virtual proxy is in action (Identical to Demo 1)
			if (service == null) {
				System.out.println("Initializing the real service now (via Dynamic Proxy).");
				service = new NetworkService(networkType);
			}

//			// Forward the call to the real object
//			service.connect(url);
//			return null; // 'void' methods return null in InvocationHandler
			
			 // Delegate using reflection (also works)
            return method.invoke(service, args);
		}

		// Handle all other methods on the Service interface (if any)
		if (service != null) {
			return method.invoke(service, args);
		}
		// If the service is null and the method is not 'connect', return null
		// (or appropriate default value) without performing any action.
		return null;
	}
}