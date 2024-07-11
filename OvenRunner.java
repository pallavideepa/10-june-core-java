class OvenRunner{
	public static void main(String[] args){
	System.out.println("main method started");
	boolean display = Oven.onOrOff();
	System.out.println("the oven is displayed:" + display);
	Oven.increaseTemp();
	Oven.increaseTemp();
	Oven.increaseTemp();
	Oven.increaseTemp();
	Oven.increaseTemp();
	Oven.increaseTemp();
	
	Oven.decreaseTemp();
	Oven.decreaseTemp();
	Oven.decreaseTemp();
	Oven.decreaseTemp();
	Oven.decreaseTemp();
	Oven.decreaseTemp();
	display = Oven.onOrOff();
	System.out.println("the oven is displayed:" + display);
	
	System.out.println("main method ended");
}
}