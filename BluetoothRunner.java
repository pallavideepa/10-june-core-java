class BluetoothRunner{

	public static void main(String[] args){
		System.out.println("main started");
		boolean connect = Bluetooth.onOrOff();
		System.out.println("is Bluetooth connected:" + connect);
		connect = Bluetooth.onOrOff();
		System.out.println("is Bluetooth connected:" + connect);
		System.out.println("main ended");
	}
}