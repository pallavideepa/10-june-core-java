class TouristCompanyRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean touristPlaceNameAdded = TouristCompany.addtouristPlaceNames("Chikmagalur");
		System.out.println("Product names added " +touristPlaceNameAdded);
		
		touristPlaceNameAdded = TouristCompany.addtouristPlaceNames("Bijapur");
		System.out.println("Product names added " +touristPlaceNameAdded);
		
		touristPlaceNameAdded = TouristCompany.addtouristPlaceNames("Mysuru");
		System.out.println("Product names added " +touristPlaceNameAdded);
		
		touristPlaceNameAdded = TouristCompany.addtouristPlaceNames("Hampi");
		System.out.println("Product names added " +touristPlaceNameAdded);
		
		touristPlaceNameAdded = TouristCompany.addtouristPlaceNames(" Gokarna");
		System.out.println("Product names added " +touristPlaceNameAdded);
		
		touristPlaceNameAdded = TouristCompany.addtouristPlaceNames("Udupi");
		System.out.println("Product names added " +touristPlaceNameAdded);
		
		touristPlaceNameAdded = TouristCompany.addtouristPlaceNames(" mangalore");
		System.out.println("Product names added " +touristPlaceNameAdded);
		
		touristPlaceNameAdded = TouristCompany.addtouristPlaceNames("Jog Falls");
		System.out.println("Product names added " +touristPlaceNameAdded);
		
		touristPlaceNameAdded = TouristCompany.addtouristPlaceNames("Murudeshwar");
		System.out.println("Product names added " +touristPlaceNameAdded);
		
		touristPlaceNameAdded = TouristCompany.addtouristPlaceNames("Bangalore");
		System.out.println("Product names added " +touristPlaceNameAdded);
		
		touristPlaceNameAdded = TouristCompany.addtouristPlaceNames("Mandya");
		System.out.println("Product names added " +touristPlaceNameAdded);
		
		TouristCompany.readtouristPlaceNames();
		System.out.println("Main Ended");
	}
}