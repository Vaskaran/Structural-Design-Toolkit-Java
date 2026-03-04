package decorator.addon;

import decorator.common.Home;

public class Gym extends Luxury {
	public Gym(Home home) {
		super(home);
	}

	@Override
	public void create() {
		super.create();
		System.out.println("A gym is ready.");
	}
}
