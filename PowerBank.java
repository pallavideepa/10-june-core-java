class PowerBank{

	public static void main(String[] ambrane){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			String connectorType = "USB Type C";
			String brand = "Ambrane";
			int batteryCapacity = 20000;
			String color = "Green";
				System.out.println("The Connector Type is " + connectorType);
				System.out.println("The Brand is " + brand);
				System.out.println("The Battery Capacity is " + batteryCapacity);
				System.out.println("The Color is " + color);
		System.out.println("getFeatures method ended");
		return;
	}
}