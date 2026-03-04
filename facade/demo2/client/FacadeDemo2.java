package facade.demo2.client;

import facade.demo2.Platform;
import facade.demo2.SocialMediaFacade;

class FacadeDemo2 {

	public static void main(String[] args) {

		SocialMediaFacade facade = new SocialMediaFacade();
		// Posting on Facebook
		facade.post("Hello, friends...", Platform.FACEBOOK);
		System.out.println("--------");

		// Posting on Facebook and LinkedIn
		facade.post("Learning the Facade pattern.", Platform.FACEBOOK, Platform.LINKEDIN);
		System.out.println("--------");

		// Posting on Instagram, LinkedIn, and Facebook
		facade.post("Hello Everyone...", Platform.INSTAGRAM, Platform.LINKEDIN, Platform.FACEBOOK);
		System.out.println("--------");
	}
}
