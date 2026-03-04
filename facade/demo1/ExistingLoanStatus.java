package facade.demo1;

class ExistingLoanStatus {
	public boolean hasPreviousLoans(Person person) {
		System.out.println("Verifying " + person.getName() + "'s previous loan(s) status.");
		return person.isPreviousLoanExist();
	}
}


