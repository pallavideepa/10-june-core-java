class WashingMachineRunner{
	public static void main(String[] args){
	System.out.println("Main started");
	boolean display = WashingMachine.onOrOff();
	System.out.println("the WashingMachine is displayed:" + display);
	WashingMachine.increaseSpeed();
	WashingMachine.increaseSpeed();
	WashingMachine.increaseSpeed();
	WashingMachine.increaseSpeed();
	WashingMachine.increaseSpeed();
	WashingMachine.increaseSpeed();
	WashingMachine.decreaseSpeed();
	WashingMachine.decreaseSpeed();
	WashingMachine.decreaseSpeed();
	WashingMachine.decreaseSpeed();
	WashingMachine.decreaseSpeed();
	WashingMachine.decreaseSpeed();
	display = WashingMachine.onOrOff();
	System.out.println("the WashingMachine displayed:" + display);
	System.out.println("Main ended");
	}	
}