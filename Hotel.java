class Hotel{
	static String hotelName = "Mayura Hotel";
	static String foodMenus[] = {"Mutton Masala" , "Mutton curry" , "Mutton chops" , "Mutton Keema Balls" , "Muttoon Dry" , "Mutton Fry" , "Mutton Biriyani" , "Mutton Fried Rice" , "Boti Fry" , "Boti Masala" , "Chilly Chicken" , "Chicken Fry" , "Chicken Dry" , "Chicken Masala" , "Chicken Kurma" , "Chicken Sixty Five" , "Ginger Chicken" , "Chicken Fried Rice" , "Chicken Manchurian" , "Ghee rice" , "Egg Fried Rice" , "White Rice" , "Lemon Rice" , "Zeera Rice" , "Ragi Ball" , "Chapati" , "Raita" , "Naan" , "Butter Naan" , "Kulcha" , "Butter parota"};
	public static void main(String[] items){
		System.out.println("Main Started");
				//System.out.println("Hotel Menu list are :" +foodMenu[0]+ " \n " +foodMenu[1]+ " \n " +foodMenu[2]+ " \n " +foodMenu[3]+ " \n " +foodMenu[4]+ " \n " +foodMenu[5]+ " \n " +foodMenu[6]+ " \n " +foodMenu[7]+ " \n " +foodMenu[8]+ " \n " +foodMenu[9]+ " \n " +foodMenu[10]+ " \n " +foodMenu[11]+ " \n " +foodMenu[12]+ " \n " +foodMenu[13]+ " \n " +foodMenu[14]);
				for(String foodMenu : foodMenus){
					System.out.println(foodMenu);
				}
		System.out.println("Main Ended");
		
	}
}