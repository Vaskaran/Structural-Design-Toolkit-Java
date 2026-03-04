package proxy.demo1.client;

import proxy.common.AccessDeniedException;
import proxy.common.NetworkType;
//import proxy.common.NetworkService;
import proxy.common.Service;
import proxy.demo1.ServiceProxy;

class ProxyDemo1 {

	public static void main(String[] args) {
//		Service service= new NetworkService(NetworkType.CORPORATE); //Error
		Service service = new ServiceProxy(NetworkType.CORPORATE);
		try {
			// Should trigger the initialization
			service.connect("https://google.com");
			// Should reuse the existing object
			service.connect("https://yahoo.com");
			// Should block the connection
			service.connect("https://www.facebook.com");
		} catch (AccessDeniedException e) {
			e.printStackTrace();
		}
	}

}
