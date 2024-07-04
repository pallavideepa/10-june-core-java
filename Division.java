class Division {
	public static void main(String []dividing) {
		System.out.println("main started");
		div(42,2);
		div(78 ,3);
		System.out.println("main ended");
		
	}
	public static void div(int num1 , int num2){
		System.out.println("div method started");
		System.out.println(num1/num2);
		System.out.println("div method ended");
	return;
	}
}