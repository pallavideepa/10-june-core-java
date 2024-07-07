class Television{

	public static void main(String[] xiaomiMi){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			String screenSize = "43 Inches";
			String brand = "MI";
			String displayTechnology = "LED";
			String resolution = "4K";
			String refreshRate = "60Hz";
			//String specialfeature = "4KDolbyVision");
			String connectivityTechnology = "Wi-Fi, USB, Ethernet";
				System.out.println("Screen size is " + screenSize);
				System.out.println("The Brand Name is " + brand);
				System.out.println("Display Technology used is " + displayTechnology);
				System.out.println("The Resolution is " + resolution);
				System.out.println("The Refresh Rate is " + refreshRate);
				//System.out.println("The Special Feartures is " + specialfeature);
				System.out.println("The Connectivity Technology used is " + connectivityTechnology);
		System.out.println("getFeatures method ended");
		return;
	}
}