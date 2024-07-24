class JuiceShop{
	static String juiceNames[] = {null,null,null,null,null,null};
	static int start;
		public static boolean addJuiceName(String juiceName){
			boolean isJuiceNameAdded = false;
			if(start < juiceNames.length){
				if(juiceName!=null){
					juiceNames[start] = juiceName;
					start++;
				isJuiceNameAdded = true;
				}
				else
				System.out.println("Juice Name is invalid");
			}else
				System.out.println("Sorry juice name is full");
		return isJuiceNameAdded;
		}
		public static void readJuiceName(){
			System.out.println("Juice Name available are");
			for(String juiceName : juiceNames){
				System.out.println(juiceName);
			}
		}
}