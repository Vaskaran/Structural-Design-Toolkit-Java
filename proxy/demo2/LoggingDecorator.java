package proxy.demo2;

import proxy.common.AccessDeniedException;
import proxy.common.Service;

public class LoggingDecorator implements Service {

	private final Service service;

	public LoggingDecorator(Service service) {
		this.service = service;
	}

	@Override
	public void connect(String url) throws AccessDeniedException {
		System.out.println("[LOG] Attempting to access: " + url);
		service.connect(url);
		System.out.println("[LOG] Completed request for: " + url);
	}
}
