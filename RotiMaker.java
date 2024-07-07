class RotiMaker{

	public static void main(String[] libra){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			String brandName = "Libra";
			String color = "Stainless Steel";
			int wattage = 950;
			int voltage = 230;
			float itemWeight = 2.74f;
				System.out.println("The Brand Name is " + brandName);
				System.out.println("The Color is " + color);
				System.out.println("The Wattage is " + wattage);
				System.out.println("The Voltage is " + voltage);
				System.out.println("The Item Weight is " + itemWeight);
		System.out.println("getFeatures method ended");
		return;
	}
}