class Scooter{

	public static void main(String[] lifelongKickScooter){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			String brand = "Lifelong";
			String color = "Pink & Blue";
			int ageRange = 12;
			String specialFeature = "Foldable";
			int weightLimit = 50;
				System.out.println("The Brand Name is " + brand);
				System.out.println("The Color Of the Brand is " + color);
				System.out.println("The Age Range is " + ageRange);
				System.out.println("The Special Feature is " + specialFeature);
				System.out.println("The Weight Limit is " + weightLimit);
		System.out.println("getFeatures method ended");
		return;
	}
}