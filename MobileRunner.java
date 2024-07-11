class MobileRunner{
	public static void main(String[] args){
	System.out.println("Main started");
	boolean display = Mobile.onOrOff();
	System.out.println("the Mobile is displayed:" + display);
	Mobile.increaseZoom();
	Mobile.increaseZoom();
	Mobile.increaseZoom();
	Mobile.increaseZoom();
	Mobile.increaseZoom();
	Mobile.increaseZoom();
	Mobile.decreaseZoom();
	Mobile.decreaseZoom();
	Mobile.decreaseZoom();
	Mobile.decreaseZoom();
	Mobile.decreaseZoom();
	Mobile.decreaseZoom();
	display = Mobile.onOrOff();
	System.out.println("the Mobile displayed:" + display);
	System.out.println("Main ended");
	}
}