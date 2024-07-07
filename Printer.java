class Printer{

	public static void main(String[] hpSmartPrinter){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			String brand = "HP";
			String connectivityTechnology = "Bluetooth, Wi-Fi, USB, Ethernet";
			String printingTechnology = "InkTank";
			String specialFeature = "Usb";
			String modelName = "HP Smart Tank 589 All-in-One";
			int itemWeight = 5030;
				System.out.println("The Brand Name is " + brand);
				System.out.println("The Connectivity Technology used is " + connectivityTechnology);
				System.out.println("The Printing Technology Type is " + printingTechnology);
				System.out.println("This Printer has Special Feature used is " + specialFeature);
				System.out.println("The Model Name is " + modelName);
				System.out.println("The Item Weight in grams " + itemWeight);
		System.out.println("getFeatures method ended");
		return;
	}
}