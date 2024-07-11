class Bluetooth{

	static boolean isDisplayOn = false ;
	static int maxVolume = 5;
	static int minVolume = 0;
	static int currentVolume;
	
	public static boolean onOrOff(){
		
		System.out.println("Start of onOrOff method");
		
		isDisplayOn = (isDisplayOn == false) ? true : false;
		
		System.out.println("End of onOrOff method");
	return isDisplayOn;
	}
	public static void increaseVolume(){
		System.out.println("Start of increase Volume method");
	
			if(isDisplayOn == true){
				if(currentVolume < maxVolume){
					currentVolume = currentVolume + 1;
					System.out.println("Current volume is "+ currentVolume);
				}else System.out.println("Maximum Volume reached");
			}else System.out.println("Turn on the Bluetooth");

		System.out.println("End of increase Volume method");
	return;
	}
	public static void decreaseVolume(){
		System.out.println("Start of decrease Volume method");
			if(isDisplayOn == true){
				if(currentVolume > minVolume){
					currentVolume = currentVolume - 1;
					System.out.println("Current volume is "+ currentVolume);
				}else System.out.println("Minimum volume reached");
			}else System.out.println("Turn on the Bluetooth ");
		System.out.println("End of decrease volume method");
	return;
	}
}