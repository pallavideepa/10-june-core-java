class XworkzRegistrationRunner{

    public static void main(String[] args){
	
	    System.out.println("Main Started");
	    boolean xWorkzRegistered = XworkzRegistration.createXworkzRegistration("Pallavi", 7349788939L, "pallavilj.xworkz@gmail.com", "4AI20IS034", 2024, "AIT", "Information Science and Engineering", "BE");
		
		if(xWorkzRegistered  == true)
		XworkzRegistration.readXworkzRegistrationDetails();
		System.out.println("Main Ended");
	
	}
}