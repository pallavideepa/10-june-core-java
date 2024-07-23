class SpotifyAccount{
	static long contactNumber;
	static String fullName;
	static String typeOfAccount;
	static String securePwd;
	static String typeOfSong;
		public static boolean createSpotifyAccount(long phoneNumber , String yourName , String accountType , String pwd , String songType){
			boolean isSpotifyAccountCreated = false;
			boolean isContactNumberValid = false;
			boolean isFullNameValid = false;
			boolean isTypeOfAccountValid = false;
			boolean isSecurePwdValid = false;
			boolean isTypeOfSongValid = false;
			
			if(phoneNumber != 0.0){
				contactNumber = phoneNumber;
				isContactNumberValid = true;
			}
			else
				System.out.println("The contact number is invalid");
			
			if(yourName != null){
				fullName = yourName;
				isFullNameValid = true;
			}
			else
				System.out.println("The User name is invalid");
			
			if(accountType != null){
				typeOfAccount = accountType;
				isTypeOfAccountValid = true;
			}
			else
				System.out.println("The user account type is invalid");
			
			if(pwd != null){
				securePwd = pwd;
				isSecurePwdValid =true;
			}
			else
				System.out.println("The user password is invalid");
			
			if(songType != null){
				typeOfSong = songType;
				isTypeOfSongValid = true;
			}
			else
				System.out.println("Type of the song is invalid");
			
			if(isContactNumberValid == true && isFullNameValid==true && isTypeOfAccountValid==true && isSecurePwdValid==true && isTypeOfSongValid==true)
				isSpotifyAccountCreated = true;
			
				contactNumber = phoneNumber;
				fullName = yourName;
				typeOfAccount = accountType;
				securePwd = pwd;
				typeOfSong = songType;
		return isSpotifyAccountCreated;
		}
		public static void readUserSpotifyAccountDetails(){
			System.out.println("The user Phone Number is " +contactNumber);
			System.out.println("The user Name is " +fullName);
			System.out.println("The user Account Type is " +typeOfAccount);
			System.out.println("The user Password is " +securePwd);
			System.out.println("The user song type is " +typeOfSong);
		}
}