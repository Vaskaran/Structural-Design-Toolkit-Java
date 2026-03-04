package decorator.addon;

import decorator.common.Home;

public class SwimmingPoolParameterized extends Luxury {
	private final String poolType;

	public SwimmingPoolParameterized(Home home, String poolType) {
		super(home);
		this.poolType = poolType;
	}

	@Override
	public void create() {		
		super.create();
		performAdditionalCheck();
		System.out.println(" One " + poolType + " swimming pool is now made.");
	}
	private void performAdditionalCheck()
	{
		System.out.println("Checking whether a swimming pool can be added...");
	}
}
