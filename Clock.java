class Clock{

	public static void main(String[] titan){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			String brandName = "Titan";
			String color = "Grey";
			String dispalyType = "Analog";
			String shape = "Round";
				System.out.println("The Brand Name is " + brandName);
				System.out.println("The color is " + color);
				System.out.println("The Display Type is " + dispalyType);
				System.out.println("The Shape of Clock is " + shape);
		System.out.println("getFeatures method ended");
		return;
	}
}