import java.util.*;
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
		public static boolean updateJuiceName(String newJuiceName , String oldJuiceName){
			System.out.println("Update method is Started");
			boolean isUpdateJuiceName = false;
			for(int ref=0; ref<juiceNames.length;ref++){
				if(juiceNames[ref] == oldJuiceName){
					juiceNames[ref] = newJuiceName;
					isUpdateJuiceName = true;
				}
			}
			if(isUpdateJuiceName==false)
				System.out.println(oldJuiceName + "not found");
			System.out.println("Update method is Ended");
		return isUpdateJuiceName;
		}
		public static boolean deleteJuiceName(String juiceName){
			boolean isDeleteJuiceName = false;
			int ref , newRef;
			for(ref=0 , newRef=0; ref<juiceNames.length; ref++){
				if(juiceNames[ref] != juiceName){
					juiceNames[newRef] = juiceNames[ref];
					newRef++;
				}
				else
					isDeleteJuiceName = true;
			}
			int newlength = newRef;
			juiceNames = Arrays.copyOf(juiceNames,newlength);
		
			if(isDeleteJuiceName == false){
				System.out.println(juiceNames + "not found");
			}
		return isDeleteJuiceName;
		}
}