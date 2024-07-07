class FingerRing{

	public static void main(String[] zaveriPearls){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			String ringSize = "Adjustable";
			String materialType = "Brass";
			String metalType = "Rose Gold";
			String countryOfOrigin = "India";
				System.out.println("The Ring Size is " + ringSize);
				System.out.println("The Material Type is " + materialType);
				System.out.println("The Metal Type is " + metalType);
				System.out.println("The Couuntry Of Origin " + countryOfOrigin);
		System.out.println("getFeatures method ended");
		return;
	}
}