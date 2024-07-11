class Oven{

	static boolean isDisplayOn = false ;
	static int maxTemp = 5;
	static int minTemp = 0;
	static int currentTemp;
	
	public static boolean onOrOff(){
		
		System.out.println("Start of onOrOff method");
		
		isDisplayOn = (isDisplayOn == false) ? true : false;
		
		System.out.println("End of onOrOff method");
	return isDisplayOn;
	}
	public static void increaseTemp(){
		System.out.println("Start of increase Temp method");
	
			if(isDisplayOn = true){
				if(currentTemp < maxTemp){
					currentTemp = currentTemp + 1;
					System.out.println("Current Temp is "+ currentTemp);
				}else System.out.println("Maximum Temp reached");
			}else System.out.println("Turn on the Oven");

		System.out.println("End of increase Temp method");
	return;
	}
	public static void decreaseTemp(){
		System.out.println("Start of decrease Temp method");
			if(isDisplayOn = true){
				if(currentTemp > minTemp){
					currentTemp = currentTemp - 1;
					System.out.println("Current Temp is "+ currentTemp);
				}else System.out.println("Minimum Temp reached");
			}else System.out.println("Turn on the Oven ");
		System.out.println("End of decrease Temp method");
	return;
	}
}