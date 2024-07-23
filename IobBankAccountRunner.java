class IobBankAccountRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			boolean IobBankAccountCreated = IobBankAccount.createIobBankAccount(7349788939L , "pallavi" , "Premium" , "pallavi@2001" , "pallavi@2001");
			
			if(IobBankAccountCreated == true)
			IobBankAccount.readUserIobBankAccountDetails();
		System.out.println("Main Ended");
	}
}