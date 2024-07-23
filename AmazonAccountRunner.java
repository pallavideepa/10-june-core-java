class AmazonAccountRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			boolean AccountCreated = AmazonAccount.createAmazonAccount("Pallavi" , "jagadeesh" , "tarikere chikmagalur" , "Cash On Delivary" ,  7349788939L , "pallavi@2001");
			
			if(AccountCreated == true)
			AmazonAccount.readUserAmazonDetails();
		System.out.println("Main Ended");
	}
}