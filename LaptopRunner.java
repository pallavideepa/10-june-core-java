class LaptopRunner{
	public static void main(String[] args){
	System.out.println("Main started");
	boolean display = Laptop.onOrOff();
	System.out.println("the Laptop is displayed:" + display);
	Laptop.increaseZoom();
	Laptop.increaseZoom();
	Laptop.increaseZoom();
	Laptop.increaseZoom();
	Laptop.increaseZoom();
	Laptop.increaseZoom();
	Laptop.decreaseZoom();
	Laptop.decreaseZoom();
	Laptop.decreaseZoom();
	Laptop.decreaseZoom();
	Laptop.decreaseZoom();
	Laptop.decreaseZoom();
	display = Laptop.onOrOff();
	System.out.println("the Laptop displayed:" + display);
	System.out.println("Main ended");
	}
}