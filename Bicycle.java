class Bicycle{

	public static void main(String[] urbanTerrainGalaxy){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			String bikeType = "Mountain Bike";
			String ageRange = "Adult";
			String brand = "Urban Terrain";
			int numberOfSpeeds = 1;
			String color = "White, Black";
			System.out.println("The Bike Type is " + bikeType);
			System.out.println("The Age Range is " + ageRange);
			System.out.println("The Brand Name is " + brand);
			System.out.println("The Number Of Speed is " + numberOfSpeeds);
			System.out.println("The Color of Cycle " + color);
		System.out.println("getFeatures method ended");
		return;
	}
}