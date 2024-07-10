class LaptopRunner{

	public static void main(String[] args){
		System.out.println("main started");
		boolean connect = Laptop.onOrOff();
		System.out.println("is laptop connected:" + connect);
		connect = Laptop.onOrOff();
		System.out.println("is laptop connected:" + connect);
		System.out.println("main ended");
	}
}