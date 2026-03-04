package facade.demo2.external;

public class FacebookApi {

	public void postOnFacebook(String message) {
		if (message == null || message.isBlank()) {
			throw new IllegalArgumentException("Message cannot be empty");
		}
		System.out.println("[Facebook]: " + message);
	}
}
