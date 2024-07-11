class WashingMachine{

	static boolean isDisplayOn = false ;
	static int maxSpeed = 5;
	static int minSpeed = 0;
	static int currentSpeed;
	
	public static boolean onOrOff(){
		
		System.out.println("Start of onOrOff method");
		
		isDisplayOn = (isDisplayOn == false) ? true : false;
		
		
		System.out.println("End of onOrOff method");
	return isDisplayOn;
	}
	public static void increaseSpeed(){
		System.out.println("Start of increase Speed method");
	
			if(isDisplayOn == true){
				if(currentSpeed < maxSpeed){
					currentSpeed = currentSpeed + 1;
					System.out.println("Current Speed is "+ currentSpeed);
				}else System.out.println("Maximum Speed reached");
			}else System.out.println("Turn on the WashingMachine");

		System.out.println("End of increase Speed method");
	return;
	}
	public static void decreaseSpeed(){
		System.out.println("Start of decrease Speed method");
			if(isDisplayOn == true){
				if(currentSpeed > minSpeed
				){
					currentSpeed = currentSpeed - 1;
					System.out.println("Current Speed is "+ currentSpeed);
				}else System.out.println("Minimum Speed reached");
			}else System.out.println("Turn on the WashingMachine ");
		System.out.println("End of decrease Speed method");
	return;
	}
}