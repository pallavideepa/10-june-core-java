class MRPStore{
static String  alcoholNames[] = {null,null,null,null,null,null,null,null,null,null};
	static int start;
		public static boolean addalcoholNames(String alcoholName){
			boolean isalcoholNameAdded = false;
			if(start < alcoholNames.length){
				if(alcoholName!=null){
					alcoholNames[start] = alcoholName;
					start++;
				isalcoholNameAdded = true;
				}
				else
				System.out.println("alcohol Names is invalid");
			}else
				System.out.println("Sorry alcohol Names is full");
		return isalcoholNameAdded;
		}
		public static void readalcoholNames(){
			System.out.println("alcohol Names available are");
			for(String alcoholName : alcoholNames){
				System.out.println(alcoholName);
			}
		}
}