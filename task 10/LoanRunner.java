class LoanRunner{

public static void main(String[] loan) {

        boolean applicationCreated = LoanApplication.createLoanApplication("Kiran", "kiranmyl2002@gmail.com", "9876543212", 70000.0, "Personal", "123456789123456");
        System.out.println("Loan Application Created: " + applicationCreated);
        if (applicationCreated) {
            LoanApplication.getLoanApplicationDetails();
        }else{
		System.out.println("Application not created,Create an loan Application");
		}
    }
}