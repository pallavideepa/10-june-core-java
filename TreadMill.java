class TreadMill{

	public static void main(String[] cockatoo){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures mathod started");
			//local variable
			String brand = "Cockatoo";
			String color = "Black";
			String productDimensions = "54D x 27W x 48H Centimeters";
			int itemWeight = 47;
			String material = "Stainless Steel";
				System.out.println("The Brand Name is " + brand);
				System.out.println("The Color is " + color);
				System.out.println("The Product Dimensions is " +productDimensions );
				System.out.println("The Item Weight is " + itemWeight);
				System.out.println("The Material used is " + material);
		System.out.println("getFeatures method ended");
		return;
	}
}