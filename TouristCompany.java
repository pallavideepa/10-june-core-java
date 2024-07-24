class TouristCompany{
	static String  touristPlaceNames[] = {null,null,null,null,null,null,null,null,null,null};
	static int start;
		public static boolean addtouristPlaceNames(String touristPlaceName){
			boolean istouristPlaceNameAdded = false;
			if(start < touristPlaceNames.length){
				if(touristPlaceName!=null){
					touristPlaceNames[start] = touristPlaceName;
					start++;
				istouristPlaceNameAdded = true;
				}
				else
				System.out.println("touristPlace Name is invalid");
			}else
				System.out.println("Sorry touristPlaceNames name is full");
		return istouristPlaceNameAdded;
		}
		public static void readtouristPlaceNames(){
			System.out.println("touristPlace Names available are");
			for(String touristPlaceName : touristPlaceNames){
				System.out.println(touristPlaceName);
			}
		}
}