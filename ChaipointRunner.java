class ChaipointRunner{
	public static void main (String[] args){
		System.out.println("main started");
		
		boolean teaAdded = Chaipoint.addTeaName("Green Tea");
		System.out.println("Tea Names Added" + teaAdded);
		
		teaAdded = Chaipoint.addTeaName("Black Tea");
		System.out.println("Tea Names Added" + teaAdded);
		
		teaAdded = Chaipoint.addTeaName("Ginger Tea");
		System.out.println("Tea Names Added" + teaAdded);
		
		teaAdded = Chaipoint.addTeaName("Masala Tea");
		System.out.println("Tea Names Added" + teaAdded);
		
		teaAdded = Chaipoint.addTeaName("Lemon Tea");
		System.out.println("Tea Names Added" + teaAdded);
		
		teaAdded = Chaipoint.addTeaName("Nilgiri Tea");
		System.out.println("Tea Names Added" + teaAdded);
		
	
		Chaipoint.showTeaDetails();
		
		boolean teaNameupdated=Chaipoint.updateTeaName("Ajwain Tea","Lemon Tea");
		System.out.println("Tea Names added"+teaNameupdated);
		
		Chaipoint.showTeaDetails();
		
		boolean teadelete = Chaipoint.deleteTeaName("Ginger Tea");
		System.out.println("tea name deleted "+teadelete);
		
		Chaipoint.showTeaDetails();
		
		System.out.println("main ended");
		
		
	}
}