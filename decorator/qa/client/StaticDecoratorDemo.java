package decorator.qa.client;

import decorator.common.Home;
import decorator.common.BasicHome;
import decorator.common.AdvancedHome;

public class StaticDecoratorDemo {
	public static void main(String[] args) {
		Home home = new AdvancedHome(new BasicHome());
		home.create();
	}
}
