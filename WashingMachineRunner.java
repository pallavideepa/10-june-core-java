class WashingMachineRunner{

	public static void main(String[] args){
		System.out.println("main started");
		boolean connect = WashingMachine.onOrOff();
		System.out.println("is washing machine connected:" + connect);
		connect = WashingMachine.onOrOff();
		System.out.println("is washing machine connected:" + connect);
		System.out.println("main ended");
	}
}