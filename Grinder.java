class Grinder{

	public static void main(String[] bajajRex){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			String brand = "Bajaj";
			String color = "White";
			String productDimensions = "11.2D x 16.6W x 5.5H Centimeters";
			int capacity = 1250;
			int itemWeight = 3000;
			String modelName = "Bajaj Rex";
				System.out.println("The Brand Name is " + brand);
				System.out.println("The Color Name is " + color);
				System.out.println("The Product Dimensions is " + productDimensions);
				System.out.println("The Capacity of Grinder is " + capacity);
				System.out.println("The Weight of the Item is " + itemWeight);
				System.out.println("The Model Name is " + modelName);
		System.out.println("getFeatures method ended");
		return;
	}
}