class Swiggy{
	static String hotelName = "RajBhojan";
	static String nonVegStarters[] = {"Egg Munchuria" , "Egg Spring Rolls" , "Chilly Chicken" , "Chicken65" , "Lemon Chicken" , "Ginger Fish" , "Chicken555" , "Chicken Majestic" , "Peper Chicken" , "Soya Chicken"};
	static String vegStarters[] = {"Crispy Corn" , "Veg Shangrila" , "Dragon Vegtables" , "Veg Manchuria" , "Crispy Veg" , "Veg Spring Roll" , "Chilly Gobi" , "Mushroom PeperDry" , "Panner 65" , "Chilly Panner" , "Gobi Munchiria"};
	static String nonVegMainCourses[] = {"Chicken Stir Fried Veg" , "Chicken Chow Mushroom" , "Chicken Biriyani" , "Chicken Chow Cashew Nutes" , "Chicken Sweet and Saur" , "Chicken Chow Baby Corn" , "Chicken Curry" , "Chicken Masala" , "Mutton Curry" , "Mutton Masala"};
	static String vegMainCourses[] = {"PaneerTikka Butter Masala" , "Paneer Butter Masala" , "Mushroom Masala" , "Mushroom Karahi" , "Palak Paneer" , "Chana Masala" , "Dal Tadka" , "Dal Handi" , "Dum Aloo" , "MixVege"};
	public static void main(String[] itemstodelivery){
		System.out.println("Main Started");
			for(String nonVegMainCourse : nonVegMainCourses){
				System.out.println(nonVegMainCourse);
			}
			for(String vegMainCourse : vegMainCourses){
				System.out.println(vegMainCourse);
			}
			for(String nonVegStarter : nonVegStarters){
				System.out.println(nonVegStarter);
			}
			for(String vegStarter : vegStarters){
				System.out.println(vegStarter);
			}
				
		System.out.println("Main Ended");
	}
}