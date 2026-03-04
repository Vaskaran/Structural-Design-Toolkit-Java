package bridge.demo1.client;

import bridge.demo1.abstractions.ElectronicItem;
import bridge.demo1.abstractions.Mobile;
import bridge.demo1.abstractions.Television;
import bridge.demo1.implementations.OnlinePrice;
import bridge.demo1.implementations.ShowroomPrice;

 class BridgeDemo1 {

	public static void main(String[] args) {
		System.out.println("***Bridge Pattern Demo.***");

//		System.out.println("Verifying the market price of a television that has a printed price $2000.");
//        ElectronicItem tvOnline =  new Television(new OnlinePrice(), 2000);
//        ElectronicItem tvShowroom = new Television(new ShowroomPrice(), 2000);	        
//        System.out.println("The TV's online price: $" + tvOnline.getFinalPrice());
//        System.out.println("The TV's showroom price: $" + tvShowroom.getFinalPrice());
		
		System.out.println("Verifying the market price of a television that has a printed price of $2000.");
        ElectronicItem tvOnline =  new Television(new OnlinePrice(), 2000);
        ElectronicItem tvShowroom = new Television(new ShowroomPrice(), 2000);	        
        System.out.println("The TV's online price: $" + tvOnline.getFinalPrice());
        System.out.println("The TV's showroom price: $" + tvShowroom.getFinalPrice());

    	System.out.println("\nVerifying the market price of a mobile phone that has a printed price of $5000.");
        ElectronicItem mobileOnline =  new Mobile(new OnlinePrice(), 5000);
        ElectronicItem mobileShowroom = new Mobile(new ShowroomPrice(), 5000);
        System.out.println("The mobile's online price: $" + mobileOnline.getFinalPrice());
        System.out.println("The mobile's showroom price: $" + mobileShowroom.getFinalPrice());        
     
	}

}
