package facade.demo2;

import facade.demo2.external.FacebookApi;
import facade.demo2.external.InstagramApi;
import facade.demo2.external.LinkedInApi;

public class SocialMediaFacade {
	private final FacebookApi facebookApi;
	private final LinkedInApi linkedinApi;
	private final InstagramApi instagramApi;

	// Architecture Note: This demo uses tight coupling for readability.
	// In enterprise apps, Dependency Injection is typically used to manage these
	// external service instances. For example, in a production environment, you
	// can opt for constructor injection to ensure loose coupling and easier
	// testing.
	public SocialMediaFacade() {
		this.facebookApi = new FacebookApi();
		this.linkedinApi = new LinkedInApi();
		this.instagramApi = new InstagramApi();
	}

	public void post(String message, Platform... platforms) {
		if (platforms == null || platforms.length == 0) {
			throw new IllegalArgumentException("Select at least one platform to publish the message.");
		}

		for (Platform platform : platforms) {
			try {
				switch (platform) {
				case FACEBOOK -> facebookApi.postOnFacebook(message);
				case LINKEDIN -> linkedinApi.publishOnLinkedIn(message);
				case INSTAGRAM -> instagramApi.postOnInstagram(message);
				default -> throw new IllegalArgumentException("Unexpected value: " + platform);
				}
			} catch (Exception e) {
				System.out.println("Failed posting on " + platform + ": " + e.getMessage());
			}
		} // end for
	}
}
