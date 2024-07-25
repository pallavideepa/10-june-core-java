class MRPStoreRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean alcoholNamesAdded = MRPStore.addalcoholNames("Budweizer");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		alcoholNamesAdded = MRPStore.addalcoholNames("KingFisher");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		alcoholNamesAdded = MRPStore.addalcoholNames("MagicMoments");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		alcoholNamesAdded = MRPStore.addalcoholNames("ImperialBlue");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		alcoholNamesAdded = MRPStore.addalcoholNames("TeachersChoice");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		alcoholNamesAdded = MRPStore.addalcoholNames("OldMonk");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		alcoholNamesAdded = MRPStore.addalcoholNames("Bacardi");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		alcoholNamesAdded = MRPStore.addalcoholNames("Breezer");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		alcoholNamesAdded = MRPStore.addalcoholNames("Smirnoff");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		alcoholNamesAdded = MRPStore.addalcoholNames("RedLabel");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		MRPStore.readalcoholNames();
		
		boolean alcoholNamesUpdate = MRPStore.updatealcoholNames("OldMonk" , "Jagermeister");
		System.out.println("Alcohol Name is updated" + alcoholNamesUpdate);
		
		MRPStore.readalcoholNames();
		
		boolean alcoholNamesDelete = MRPStore.deletealcoholNames("Campari");
		System.out.println("Alcohol Name is Deleted" +alcoholNamesDelete);
		
		MRPStore.readalcoholNames();
		System.out.println("Main Ended");
	}
}