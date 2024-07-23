class AmazonAccount{
	static String firstName;
	static String lastName;
	static String delivaryAddress;
	static String paymentMethod;
	static long contactNumber;
	static String securePwd;
	public static boolean createAmazonAccount(String givenName , String surName , String contactAddress , String payMethod , long phoneNumber , String pwd){
		boolean isAccountCreated = false;
		boolean isFirstNameValid = false;
		boolean isLastNameValid = false;
		boolean isDelivaryAddressValid = false;
		boolean isPaymentMethodValid = false;
		boolean isContactNumberValid = false;
		boolean isSecurePwdValid = false;
		
		if(givenName != null){
			firstName = givenName;
			isFirstNameValid =  true;
		}
		else 
			System.out.println("The First Name is Invalid");
		
		if(surName != null){
			lastName = surName;
			isLastNameValid = true;
		}
		else 
			System.out.println("The Last Name is Invalid");
		
		if(contactAddress != null){
			delivaryAddress = contactAddress;
			isDelivaryAddressValid =  true;
		}
		else 
			System.out.println("The Delivary Address is Invalid");
		
		if(payMethod != null){
			paymentMethod = payMethod;
			isPaymentMethodValid = true;
		}
		else
			System.out.println("The Payment method is Invalid");
		
		if(phoneNumber != 0.0){
			contactNumber = phoneNumber;
			isContactNumberValid = true;
		}
		else 
			System.out.println("The Contact Number is Invalid");
		
		if(pwd != null){
			securePwd = pwd;
			isSecurePwdValid =  true;
		}
		else
			System.out.println("The Password is Invalid");
		
		if(isFirstNameValid == true && isLastNameValid == true && isDelivaryAddressValid == true && isPaymentMethodValid == true && isContactNumberValid == true && isSecurePwdValid == true)
			isAccountCreated = true;
		firstName = givenName;
		lastName = surName;
		delivaryAddress = contactAddress;
		paymentMethod = payMethod;
		contactNumber = phoneNumber;
		securePwd = pwd;
	return isAccountCreated;
	}
	public static void readUserAmazonDetails(){
		System.out.println("The user first Name is " +firstName);
		System.out.println("The user last Name is " +lastName);
		System.out.println("The user Delivary Address is " +delivaryAddress);
		System.out.println("The user Payment Method is " +paymentMethod);
		System.out.println("The user Phone Number is " +contactNumber);
		System.out.println("The user Password is " +securePwd);
	}
}