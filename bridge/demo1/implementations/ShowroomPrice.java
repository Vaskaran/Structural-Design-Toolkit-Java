package bridge.demo1.implementations;

public class ShowroomPrice implements PricingScheme {
	@Override
	public double getPrice(double printedPrice) {
		return printedPrice; // no discount
	}
}
