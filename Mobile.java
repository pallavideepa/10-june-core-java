class Mobile{

	public static void main(String[] redmi){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			String brand = "Redmi";
			String operatingSystem = "Android 13.0";
			int ramMemory = 4;
			String cpuModel = "Snapdragon";
			int memoryStorageCapacity = 128;
				System.out.println("The Brand Name is " + brand);
				System.out.println("Operating System is " + operatingSystem);
				System.out.println("Availability of RAM Memory is " + ramMemory);
				System.out.println("CPU Model is " + cpuModel);
				System.out.println("Memory Storage in GB is " + memoryStorageCapacity);
		System.out.println("getFeatures method ended");
		return;
	}
}