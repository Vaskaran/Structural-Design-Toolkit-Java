package bridge.demo1.implementations;

public interface PricingScheme {
	double getPrice(double printedPrice);	
	// Added for the Q&A sessions
	default void conveyThanks()	{
		System.out.println(" Thank you for your interest in the product.");
	}	
}
