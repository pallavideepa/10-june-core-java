class OvenRunner{

	public static void main(String[] args){
		System.out.println("main started");
		boolean connect = Oven.onOrOff();
		System.out.println("is oven connected:" + connect);
		 connect = Oven.onOrOff();
		 System.out.println("is oven connected:" + connect);
		System.out.println("main ended");
	}
}
