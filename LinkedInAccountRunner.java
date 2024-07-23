class LinkedInAccountRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			boolean LinkedInAccountCreated = LinkedInAccount.createLinkedInAccount("Pallavi" , "jagadeesh" , "Tarikere chikmagalur" , "rajajinagar Bangalore" , 7349788939L , "pallavilj.xworkz@gmail.com" , "10-dec-2001" , "BE" , "VTU" , "volleyball" , "pallavi@2001" , "pallavi@2001");
			
			if(LinkedInAccountCreated ==true)
			LinkedInAccount.readUserLinkedInAccountDetails();
		System.out.println("Main Ended");
	}
}