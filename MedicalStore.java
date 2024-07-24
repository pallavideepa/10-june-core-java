class MedicalStore{
static String  medicineNames[] = {null,null,null,null,null,null,null,null,null,null};
	static int start;
		public static boolean addmedicineNames(String medicineName){
			boolean ismedicineNameAdded = false;
			if(start < medicineNames.length){
				if(medicineName!=null){
					medicineNames[start] = medicineName;
					start++;
				ismedicineNameAdded = true;
				}
				else
				System.out.println("medicine Name is invalid");
			}else
				System.out.println("Sorry medicine name is full");
		return ismedicineNameAdded;
		}
		public static void readmedicineNames(){
			System.out.println("medicine Names available are");
			for(String medicineName : medicineNames){
				System.out.println(medicineName);
			}
		}