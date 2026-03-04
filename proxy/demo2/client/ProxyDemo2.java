package proxy.demo2.client;

import proxy.common.AccessDeniedException;
import proxy.common.NetworkType;
import proxy.common.Service;
import proxy.demo1.ServiceProxy;
import proxy.demo2.LoggingDecorator;

class ProxyDemo2 {
	public static void main(String[] args) {

		// Trying to create a proxy
		Service service = new ServiceProxy(NetworkType.CORPORATE);
		// Decorating the proxy
		Service decoratedProxy = new LoggingDecorator(service);
		try {
			// Should trigger the initialization
			decoratedProxy.connect("https://google.com");
			// Should reuse the existing object
			decoratedProxy.connect("https://yahoo.com");
			// Should block the connection
			decoratedProxy.connect("https://www.facebook.com");
		} catch (AccessDeniedException e) {
			e.printStackTrace();
		}
	}
}
