class MobilePhoneRunner{

	public static void main(String[] args){
		System.out.println("main started");
		boolean connect = MobilePhone.onOrOff();
		System.out.println("is mobile phone connected:" + connect);
		connect = MobilePhone.onOrOff();
		System.out.println("is mobile phone connected:" + connect);
		System.out.println("main ended");
	}
}