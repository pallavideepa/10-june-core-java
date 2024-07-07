class Sunglasses{

	public static void main(String[] rayBan){
		System.out.println("Main Started");
			//invoke a method 
			//callmethod
			getFeatures();
		System.out.println("Main Ended");
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
			//local variable
			String materialComposition = "Uv protected";
			String countryOfOrigin = "India";
				System.out.println("The Material Composition is " + materialComposition);
				System.out.println("The Country Of Origin is " + countryOfOrigin);
		System.out.println("getFeatures method ended");
		return;
	}
}