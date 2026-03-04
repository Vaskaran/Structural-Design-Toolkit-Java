package bridge.demo1.abstractions;

import bridge.demo1.implementations.PricingScheme;

public class Mobile extends ElectronicItem {

	private double printedPrice;

	public Mobile(PricingScheme scheme, double printedPrice) {
		super(scheme);
		this.printedPrice = printedPrice;
	}

	@Override
	protected double getPrintedPrice() {
		return printedPrice;
	}

	// Added for Demo-2
	// Specific method for the Mobile class to get a special promotional discount
	public double getFestiveTimePrice(double promotionalDiscountPercent) {
		double priceBeforePromotionalDiscount = getFinalPrice();
		return priceBeforePromotionalDiscount*(1-promotionalDiscountPercent/100);
	}
}