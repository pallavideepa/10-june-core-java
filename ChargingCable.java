class ChargingCable{

	public static void main(String[] kratosUnbreakable){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			String brand = "Kratos";
			String connectorType = "USB Type C, Micro USB, Lightning";
			String cableType = "USB";
			String specialFeature = "Braided";
				System.out.println("The Brand Name is " + brand);
				System.out.println("The Connector Type is " + connectorType);
				System.out.println("The Cable Type is " + cableType);
				System.out.println("The Special Feature is " + specialFeature);
		System.out.println("getFeatures method ended");
		return;
	}
}