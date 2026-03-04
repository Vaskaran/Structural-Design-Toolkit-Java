package proxy.demo3.client;

import proxy.common.AccessDeniedException;
import proxy.common.NetworkType;
import proxy.common.Service;
import proxy.demo3.ServiceProxyInvocationHandler;

import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler; 

class ProxyDemo3 {
	 
    public static void main(String[] args) {
   
        NetworkType networkType=NetworkType.CORPORATE;
 
        // 1. Create the InvocationHandler instance    
        InvocationHandler handler = new ServiceProxyInvocationHandler(networkType);
//        ServiceProxyInvocationHandler handler = new ServiceProxyInvocationHandler(networkType);
 
        // 2. Dynamically create a proxy object that implements the Service interface
        Service service = (Service) Proxy.newProxyInstance( 
            Service.class.getClassLoader(),  
            new Class[] {Service.class},  
            handler                          
        );
        
     // Identical try-catch block (similar to Demo1)
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