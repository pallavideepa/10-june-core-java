class InductionRunner{

	public static void main(String[] args){
		System.out.println("main started");
		boolean connect = Induction.onOrOff();
		System.out.println("the induction is connected:" + connect);
		connect = Induction.onOrOff();
		System.out.println("the induction is connected:" + connect);
		System.out.println("main ended");
	}
}