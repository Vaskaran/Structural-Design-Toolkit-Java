package decorator.addon;

import decorator.common.Home;

abstract class Luxury implements Home {

	protected Home home;

	public Luxury(Home home) {
		this.home = home;
	}

	@Override
	public void create() {
		home.create();
	}
	
	// Added for Q&A
	public Home getInnerHome() {  
        return home;
    }
}
