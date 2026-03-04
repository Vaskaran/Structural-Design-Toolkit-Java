package decorator.demo2.client;

import decorator.common.Home;
import decorator.common.BasicHome;
import decorator.addon.Gym;
import decorator.addon.SwimmingPoolParameterized;

class DecoratorDemo2 {

	public static void main(String[] args) {
		Home home = new BasicHome();
		home.create();
		System.out.println("=========");

		// Adding a gym
		home = new Gym(home);
		home.create();

		System.out.println("=========");

		// Adding a swimming pool
		home = new SwimmingPoolParameterized(home, "indoor");
		home.create();
		System.out.println("=========");

		// Adding another swimming pool
		home = new SwimmingPoolParameterized(home, "rooftop");
		home.create();
	}

}
