package bridge.demo1.abstractions;

import bridge.demo1.implementations.PricingScheme;

public class Television extends ElectronicItem {

	private double printedPrice;
	public Television(PricingScheme scheme, double printedPrice) {
		super(scheme);
		this.printedPrice=printedPrice;		
	}

//	@Override
//	protected String getProduct() {
////		return "television";
//		return this.getClass().getSimpleName();
//	}

	@Override
	protected double getPrintedPrice() {
		return printedPrice;
	}

}
