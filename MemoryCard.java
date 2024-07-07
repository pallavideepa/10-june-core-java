class MemoryCard{

	public static void main(String[] samsung){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			String digitalStorageCapacity = "2 TB";
			String hardDiskInterface = "USB 2.0/3.0";
			String brand = "Samsung";
			String color = "Blue";
			int hardDiskSize = 2;
				System.out.println("The Digital Storage Capacity is " + digitalStorageCapacity);
				System.out.println("The Hard Disk Interface is " + hardDiskInterface);
				System.out.println("The Brand Name is " + brand);
				System.out.println("The Color is " + color);
				System.out.println("The Hard Disk Size in TB " + hardDiskInterface);
		System.out.println("getFeatures method ended");
		return;
	}
}