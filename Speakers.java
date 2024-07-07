class Speakers{

	public static void main(String[] sony){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			String brandName = "sony";
			int speakerOutputPower = 600;
			String connectivityTechnology = "Bluetooth, USB, Optical, HDMI";
			String audioOutputMode = "Surround";
				System.out.println("The Brand Name is " + brandName);
				System.out.println("The Speakers Output Power is " + speakerOutputPower);
				System.out.println("The Connectivity Technology used is " +connectivityTechnology);
				System.out.println("The Audio Output Mode is " + audioOutputMode);
		System.out.println("getFeatures method ended");
		return;
	}
}