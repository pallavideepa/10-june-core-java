class SuperMarket{
	String name = "smartPoint";
	static String groceries[] ={"Wheat" , "Rice" , "GramFlour" , "RagiFlour" , "Sugar" , "Salt" , "SunPureOil" , "Butter" , "Cashew" , "DhaniaPwoder" , "GramMasala" , "Jagery" , "ChatMasala"};
	static	String vegitables[] ={"Carrot" , "Beans" , "Onion" , "Pottato" , "Beetroot" , "Drumstick" , "Ginger" , "Garlic" , "Capcicum" , "Lemon" , "CaliFlower" , "Cabage" , "Brinjal" , "Cucumber"};
	static	String snacks[] ={"Lays" , "Bingo" , "Pringals" , "Doritos" , "Kurkure" , "MognDal" , "BananaChips" , "Pasta" , "SoyaSticks" , "LemorFoods"};
	static	String fruits[] = {"Apple" , "Banana" , "Charry" , "DraygunFruit" , "Orange" , "Mango" , "Coconut" , "Pineapple" , "Watermelon" , "Peach" , "Avocado" , "Pomegranate" , "Pear" , "Graps" , "Plum" , "Kiwi"};
	static	String cosmetics[] = {"LOréal Paris" , "Lakme" , "Revlon" , "Clinique" , "Beiersdorf" , "Procter & Gamble" , "Dove" , "Lotus Herbals" , "MAC" , "Maybelline" , "Avon" , "Unilever" , "Clinique" , "SUGAR Cosmetics" , "NIVEA"};
	static	String chocolates[] = {"Milk Chocolate" , "Dark Chocolate" , "White Chocolate" , "Ghirardelli Intense Dark" , "Godiva Chocolatier" , "Ferrero Rocher" , "Hersheys Milk Chocolate" , "Toblerone" , "Nestle Crunch" , "Kit Kat" , "Ruby Chocolate" , "Bittersweet Chocolate" , "Semisweet Chocolate" , "Couverture Chocolate" , "Cadbury Dairy Milk"};
	static	String icecreams[] = {"Chocolate" , "Gelato" , "Kulfi" , "Sherbet" , "Sorbet" , "FrozenYogurt" , "Philadelphia" , "SoftServe" , "Rolled" , "SnowCream" , "Mochi" , "ItalianIce" , "Dondurma" , "Venila" , "ButterPecan"};
	static	String biscuits[] = {"JimJam" , "Tiger" , "Oreo" , "Bounce" , "Darkfantesy" , "Magix" , "BourBon" , "Treat" , "20-20" , "Unibic" , "50-50" , "Monaco" , "ParleG" , "Karckjack" , "HappyHappy"};
	static	String perfumes[] = {"WildStone" , "Denver" , "Fogg" , "Bellavita" , "Signature" , "Black" , "Villain" , "ModestMimosa" , "Chanel" , "CEO" , "London" , "ParkAvenue" , "Filoor" , "DE Blue" , "Paris" , "Twilly"};
	static	String coolDrinks[] = {"Coca-Cola" , "Pepsi" , "Sprite" , "Thums Up" , "Fanta" , "Limca" , "7Up" , "Mountain Dew" , "String" , "Acti-Vti" , "Appletiser" , "Belvoir" , "Bos" , "Charitea" , "Dash Water"};
	static	String alcohols[] = {"Bacardi" , "Captai Morgan" , "Smirnoff" , "Jack Daniel" , "Glenfiddich" , "Baileys Irish Cream" , "Kingfisher" , "Benedictine" , "Kahlua" , "Rum" , "Amarula" , "Royal Stag" , "Hennessy" , "Malibu" , "Boilo"};
	static	String homeAppliances[] = {"Vacuum Cleaner" , "Hair Dryer" , "Iron" ,"Fan" , "DishWasher" , "AirConditioner" , "Blender" , "Juicer" , "Sandwich maker" , "Oven" , "Refrigerator" , "Toast Machine" , "Kettle" , "VacuumCleaner" , "Lamp" , "Microwave" , "CoffeMachine" , "Television" , "Pressure Cooker" , "Sofa"};
	static	String milkProducts[] = {"Butter" , "Cheese" , "Yogurt" , "IceCream" , "Whipped Cream" , "Heta" , "Ghee" , "Soft Cheese" , "Custard" , "Kefir" , "SourCream" , "Roquefort" , "Camembert" , "Swiss Cheese" , "Brie"};
		public static void main(String[] dMart){
			System.out.println("Main Started");
				for(String grocery : groceries){
				System.out.println(grocery);
				}
							System.out.println("vegetsables Started=============");

				for(String vegitable : vegitables){
				System.out.println(vegitable);
				}
											System.out.println("snacks Started=============");

				for(String snack : snacks){
				System.out.println(snack);
				}
				             System.out.println(" fruits Started=============");
				for(String fruit : fruits){
				System.out.println(fruit);
				}
							System.out.println(" cosmetics Started=============");
				for(String cosmetic : cosmetics){
				System.out.println(cosmetic);
				}
							System.out.println("  chocolates Started=============");
				for(String chocolate : chocolates){
				System.out.println(chocolate);
				}
							System.out.println("  icecreams Started=============");
				for(String icecream : icecreams){
				System.out.println(icecream);
				}
							System.out.println("  biscuits Started=============");
				for(String biscuit : biscuits){
				System.out.println(biscuit);
				}
						System.out.println("  perfumes Started=============");	
				for(String perfume : perfumes){
				System.out.println(perfume);
				}
						System.out.println("  coolDrinks Started=============");
				for(String coolDrink : coolDrinks){
				System.out.println(coolDrink);
				}
				System.out.println("  alcohols Started=============");
				for(String alcohol : alcohols){
				System.out.println(alcohol);
				}
				System.out.println("  homeAppliances Started=============");
				for(String homeAppliance : homeAppliances){
				System.out.println(homeAppliance);
				}
				System.out.println("  milkProducts Started=============");
				for(String milkProduct : milkProducts){
				System.out.println(milkProduct);
				}
			System.out.println("Main Ended");
	}
}