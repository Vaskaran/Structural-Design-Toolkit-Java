package proxy.demo1;

import java.util.ArrayList;
import java.util.List;

import proxy.common.AccessDeniedException;
import proxy.common.NetworkService;
import proxy.common.NetworkType;
import proxy.common.Service;

public class ServiceProxy implements Service {
	
	private Service service;
	private NetworkType networkType;

	public ServiceProxy(NetworkType networkType) {
		this.networkType = networkType;
		// We'll NOT create the actual network service unless it is required
	}

	static List<String> restrictedUrls = new ArrayList<String>();
	static {

		restrictedUrls.add("facebook.com");
		restrictedUrls.add("tiktok.com");
		// Add other URLs, if needed
	}

	@Override
	public void connect(String url) throws AccessDeniedException {
		// For a multithreaded environment
		// public synchronized void connect(String url) throws AccessDeniedException {
		// The logic for the protection proxy
		if (this.networkType == NetworkType.CORPORATE) {
			String urlLowerCase = url.toLowerCase();
			for (String restricted : restrictedUrls) {
				if (urlLowerCase.contains(restricted)) {
					throw new AccessDeniedException("You cannot connect to " + url + " as per company policy");
				}
			}
		}

		// Lazy initialization: the virtual proxy is in action
		if (service == null) {
			System.out.println("Initializing the real service now... ");
			service = new NetworkService(networkType);
		}

		service.connect(url);

		// Looks like a decorator. But it is not correct. The following line  also breaks SRP.
		// System.out.println("Connection successful...");
	}

}
