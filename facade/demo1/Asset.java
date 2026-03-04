package facade.demo1;

class Asset {
	public boolean hasSufficientAssetValue(Person person, double claimAmount) {
		System.out.println("Verifying " + person.getName() + "'s asset value.");
		return person.getAssetValue() >= claimAmount;
	}
}
