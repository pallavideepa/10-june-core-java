class Fan{

	public static void main(String[] crompton){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures mathod started");
			//local variable
			String brandName = "Crompton";
			String colorName = "Lustre Brown";
			int wattage = 51;
			String finishType = "Powder Coated";
				System.out.println("The Brand Name is " + brandName);
				System.out.println("The Color Name is " + colorName);
				System.out.println("The Wattage is " + wattage);
				System.out.println("The Finish Type is "+ finishType);
		System.out.println("getFeatures method ended");
		return;
	}
}