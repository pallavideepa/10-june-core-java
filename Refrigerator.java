class Refrigerator{

	public static void main(String[] samsung653){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures mathod started");
			//local variable
			String productDimensions = "71.6D x 91.2W x 178H Centimeters";
			String brand = "Samsung";
			String capacity = "653 litres";
			String configuration = "Full-Sized Side-by-Side";
			String energyStar = "3Star";
				System.out.println("The Product Dimensions is " + productDimensions);
				System.out.println("The Brand Name is " + brand);
				System.out.println("The Capacity of Refrigerator is " + capacity);
				System.out.println("The Configuration of Refrigerator is " + configuration);
				System.out.println("The Star of Refrigerator is " + energyStar);
		System.out.println("getFeatures method ended");
		return;
	}
	}