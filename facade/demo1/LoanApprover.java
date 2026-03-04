package facade.demo1;

public class LoanApprover {
	public String checkLoanEligibility(Person person, double claimAmount) {
		String status = "Approved";
		String reason = "";
		System.out.println("\nChecking the loan approval status of a person...");
		System.out.println(person + " Claims: $" + claimAmount);

		Asset asset = new Asset();
		ExistingLoanStatus existingLoanStatus = new ExistingLoanStatus();

		if (!asset.hasSufficientAssetValue(person, claimAmount)) {
			status = "Not approved.";
			reason += "\nInsufficient balance.";
		}

		if (existingLoanStatus.hasPreviousLoans(person)) {
			status = "Not approved.";
			reason += "\nOld loan exists.";
		}

		String result = status;
		if (!status.equals("Approved")) {
			// Collecting the remarks (if any).
			result = status + " Reason(s):" + reason;
		}
		return result;
	}
}
