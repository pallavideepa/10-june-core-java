class SpotifyAccountRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			boolean SpotifyAccountCreated = SpotifyAccount.createSpotifyAccount(7349788939L , "Pallavi" , "Premium" , "pallavi@2001" , "partysong");
			
			if(SpotifyAccountCreated == true)
			SpotifyAccount.readUserSpotifyAccountDetails();
		System.out.println("Main Ended");
	}
}