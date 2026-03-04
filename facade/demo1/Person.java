package facade.demo1;

public class Person {
	private String name;
	private double assetValue;
	private boolean previousLoanExist;

	public Person(String name, double assetValue, boolean previousLoanExist) {
		//super();
		this.name = name;
		this.assetValue = assetValue;
		this.previousLoanExist = previousLoanExist;
	}

	public String getName() {
		return name;
	}

	public double getAssetValue() {
		return assetValue;
	}

	public boolean isPreviousLoanExist() {
		return previousLoanExist;
	}
	
	@Override
	public String toString() {
		return "[Name=" + name + ", current asset: $" + assetValue + ", existing loan? " + previousLoanExist+"]";
	}
}