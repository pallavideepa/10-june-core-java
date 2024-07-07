class Mouses{

	public static void main(String[] zebronics){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			String connectorType = "USB";
			String brandName = "ZEBRONICS";
			String color = "White";
			int batteryCapacity = 10000;
			String specialFeature = "Wireless Charging";
				System.out.println("The Connector Type is " + connectorType);
				System.out.println("The Brand Name is " + brandName);
				System.out.println("The Color " + color);
				System.out.println("The Special Feature is " + specialFeature);
				System.out.println("The Battery Capacity is " + batteryCapacity);
		System.out.println("getFeatures method ended");
		return;
	}
}