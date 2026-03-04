package proxy.common;

public class AccessDeniedException extends Exception{
	
	// Exception extends Throwable which implements Serializable
	// So, the following line is added to avoid the warning:
	// The serializable class AccessDeniedException does not declare 
	// a static final serialVersionUID field of type long
	private static final long serialVersionUID = 1L; 

	public AccessDeniedException(String message) {
        super(message);
    }
}
