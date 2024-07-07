class Tap{

	public static void main(String[] waterScienceCLEO){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			String brandName = "waterscience";
			String material = "For Borewell/Tanker Water";
			String finishType = "Polished";
				System.out.println("The Brand Name is " + brandName);
				System.out.println("The Material Name is " + material);
				System.out.println("The Finish Type is " + finishType);
		System.out.println("getFeatures method ended");
		return;
	}
}