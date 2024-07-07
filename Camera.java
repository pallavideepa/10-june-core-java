class Camera{

	public static void main(String[] cpPlus){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			String brand = "CP PLUS";
			String modelName = "CP";
			String connectivityTechnology = "Wireless";
				System.out.println("The Brand Name is " + brand);
				System.out.println("The Model Name is " + modelName);
				System.out.println("The Connectivity Technology is used " + connectivityTechnology);
		System.out.println("getFeatures method ended");
		return;
	}
}