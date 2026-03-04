package bridge.demo1.implementations;

public class OnlinePrice implements PricingScheme {

	@Override
	public double getPrice(double printedPrice) {
		return printedPrice * 0.9; // with 10% discount
	}
}
