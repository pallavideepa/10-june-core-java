class SmartWatchRunner{

	public static void main(String[] args){
		System.out.println("main started");
		boolean connect = SmartWatch.onOrOff();
		System.out.println("is smart watch connected:" + connect);
		
		connect = SmartWatch.onOrOff();
		System.out.println("is smart watch connected:" + connect);
		System.out.println("main ended");
	}
}