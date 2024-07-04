class Maggi {
	static String name = "Maggi";
	static int price = 14;
	static int quantityInGrams = 70;
	static String ingredients[] = {"Dehydrated vegetables","Green french beans","Mixed spices","Refined wheat flour","Iodised salt","Palm oil","Dehydrated onion","Toasted onion flakes","Flavour enhancer","Dried garlic"};
		public static void main(String[] noodles){
			System.out.println("Main Started");
				System.out.println("The Name of the product is :" +name);
				System.out.println("The Price of the product is :" +price);
				System.out.println("The QuantityInGrams is :" +quantityInGrams);
				System.out.println("The Ingredients are :" +ingredients.length);
				//*System.out.println("List of maggi ingredient are :" +ingredients)
				/*for(String ingredient : ingredients) {
					System.out.println(ingredient);
				}*/
			for(int index = 0; index<ingredients.length; index = index + 1){
				String value = ingredients[index];
			System.out.println(value);	
			}
			System.out.println("Main Ended");
		
	}
}