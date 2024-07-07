class Watch{

	public static void main(String[] fossilDeckerBrownWatch){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			int caseDiameter = 44;
			String brandcolor = "Brown";
			String bandMaterialType = "Leather";
			int itemWeight = 150;
			String countryOfOrigin = "India";
				System.out.println("The Case Diameter is " + caseDiameter);
				System.out.println("The Brand Color is " + brandcolor);
				System.out.println("The Band Material Type is " + bandMaterialType);
				System.out.println("The Item Weight is " + itemWeight);
				System.out.println("The Country Of Origin is " + countryOfOrigin);
		System.out.println("getFeatures method ended");
		return;
	}
}