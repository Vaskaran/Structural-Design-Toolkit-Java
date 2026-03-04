package decorator.addon;

import decorator.common.Home;

public class SwimmingPool extends Luxury {
	public SwimmingPool(Home home) {
		super(home);
	}

	@Override
	public void create() {
		super.create();
		System.out.println("One swimming pool is made.");
	}
}
