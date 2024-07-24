class Amazon{
	static String  produtNames[] = {null,null,null,null,null,null,null,null,null,null};
	static int start;
		public static boolean addProdutNames(String produtName){
			boolean isProdutNameAdded = false;
			if(start < produtNames.length){
				if(produtName!=null){
					produtNames[start] = produtName;
					start++;
				isProdutNameAdded = true;
				}
				else
				System.out.println("Product Name is invalid");
			}else
				System.out.println("Sorry product name is full");
		return isProdutNameAdded;
		}
		public static void readProdutName(){
			System.out.println("Product Name available are");
			for(String produtName : produtNames){
				System.out.println(produtName);
			}
		}
}