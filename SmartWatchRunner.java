class SmartWatchRunner{
	public static void main(String[] args){
	System.out.println("Main started");
	boolean display = SmartWatch.onOrOff();
	System.out.println("the SmartWatch is displayed:" + display);
	SmartWatch.increaseVolume();
	SmartWatch.increaseVolume();
	SmartWatch.increaseVolume();
	SmartWatch.increaseVolume();
	SmartWatch.increaseVolume();
	SmartWatch.increaseVolume();
	SmartWatch.decreaseVolume();
	SmartWatch.decreaseVolume();
	SmartWatch.decreaseVolume();
	SmartWatch.decreaseVolume();
	SmartWatch.decreaseVolume();
	SmartWatch.decreaseVolume();
	display = SmartWatch.onOrOff();
	System.out.println("the SmartWatch displayed:" + display);
	System.out.println("Main ended");
	}
}