class BluetoothRunner{
	public static void main(String[] args){
	System.out.println("Main started");
	boolean display = Bluetooth.onOrOff();
	System.out.println("the Bluetooth is displayed:" + display);
	Bluetooth.increaseVolume();
	Bluetooth.increaseVolume();
	Bluetooth.increaseVolume();
	Bluetooth.increaseVolume();
	Bluetooth.increaseVolume();
	Bluetooth.increaseVolume();
	Bluetooth.decreaseVolume();
	Bluetooth.decreaseVolume();
	Bluetooth.decreaseVolume();
	Bluetooth.decreaseVolume();
	Bluetooth.decreaseVolume();
	Bluetooth.decreaseVolume();
	display = Bluetooth.onOrOff();
	System.out.println("the Bluetooth displayed:" + display);
	System.out.println("Main ended");
	}
}