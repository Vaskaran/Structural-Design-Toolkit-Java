package decorator.demo1.client;

import decorator.common.BasicHome;
import decorator.common.Home;
import decorator.addon.Gym;
import decorator.addon.SwimmingPool;

class DecoratorDemo1 {	
		public static void main(String[] args) {
			Home home = new BasicHome();
			home.create();
			System.out.println("=========");

			// Adding a gym
			home = new Gym(home);
			home.create();
			System.out.println("=========");

			// Adding a swimming pool
			home = new SwimmingPool(home);
			home.create();
			System.out.println("=========");
			
//			// Used for Q&A
//			// Removing the swimming pool (if any) from a home
//			if (home instanceof SwimmingPool) {
//	            // Unwrap to get the inner home
//	            home = ((SwimmingPool) home).getInnerHome();
//	        }
//	        home.create();
	}

}
