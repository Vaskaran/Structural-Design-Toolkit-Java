package proxy.common;

public interface Service {
	public void connect(String url) throws AccessDeniedException;
}
