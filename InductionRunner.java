class InductionRunner{
	public static void main(String[] args){
	System.out.println("Main started");
	boolean display = Induction.onOrOff();
	System.out.println("the Induction is displayed:" + display);
	Induction.increaseTemp();
	Induction.increaseTemp();
	Induction.increaseTemp();
	Induction.increaseTemp();
	Induction.increaseTemp();
	Induction.increaseTemp();
	Induction.decreaseTemp();
	Induction.decreaseTemp();
	Induction.decreaseTemp();
	Induction.decreaseTemp();
	Induction.decreaseTemp();
	Induction.decreaseTemp();
	display = Induction.onOrOff();
	System.out.println("the Induction displayed:" + display);
	System.out.println("Main ended");
	}
}