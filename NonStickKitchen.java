class NonStickKitchen{

	public static void main(String[] prestige){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			String material = "Stainless Steel";
			String color = "black/Silver";
			String brandName = "Prestige";
			int size = 3;
				System.out.println("The Material Type is " + material);
				System.out.println("The Color of the material is " + color);
				System.out.println("The Brand Name is " + brandName);
				System.out.println("The Size of Material is " + size);
		System.out.println("getFeatures method ended");
		return;
	}
}