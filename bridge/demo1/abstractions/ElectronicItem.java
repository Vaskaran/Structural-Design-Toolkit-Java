package bridge.demo1.abstractions;

import bridge.demo1.implementations.PricingScheme;

public	abstract class ElectronicItem {	

		// Composition - implementor
		protected PricingScheme price;
		protected ElectronicItem(PricingScheme price) {
			this.price=price;
		}
//		protected abstract String getProduct();
	    protected abstract double getPrintedPrice();
	    
	    public double getFinalPrice(){
	    	// Added for the Q&A Session
//	    	price.conveyThanks();
	    	return price.getPrice(getPrintedPrice());
	    }
	}



