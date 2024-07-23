class LoanApplicationCreatedRunner{

    public static void main(String[] loan){
	
	    System.out.println("Main Started");
		boolean loanApplicationCreated = LoanApplicationCreated.createLoanApplication(750, "Personal Loan", "pallavi", "Iob Bank", 25, 4);
	    
		    if(loanApplicationCreated == true)
		     LoanApplicationCreated.readLoanApplicantsDetails();
		 
		System.out.println("Main Ended");
		
	}
}