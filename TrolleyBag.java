class TrolleyBag{

	public static void main(String[] safari){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			String storageVolume = "123 liters";
			String lockType = "Combination Lock";
			String outerMaterial = "Polypropylene";
			int itemWeight = 9950;
			String careInstructions = "Wipe with dry Cloth";
			int numberOfWheels = 4;
			String countryOfOrigin = "India";
				System.out.println("The Storage Capacity of trolleybag is " + storageVolume);
				System.out.println("The Lock Type of trolleybag is " + lockType);
				System.out.println("The Outer Material of trolleybag is " + outerMaterial);
				System.out.println("The Weight of trolleybag in Grams is " + itemWeight);
				System.out.println("The Care Instructions of trolleybag is " + careInstructions);
		System.out.println("getFeatures method ended");
		return;
	}
}