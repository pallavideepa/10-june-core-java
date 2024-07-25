import java.util.*;
class Chaipoint{
	static String teaNames[]={null,null,null,null,null,null};
	static int start;
	public static boolean addTeaName(String teaName){
		boolean isTeaNameadded = false;
		if(start<teaNames.length){
		if(teaName!=null){
			teaNames[start++]=teaName;
			isTeaNameadded=true;
		}
		else
			System.out.println("Tea Name is Invalid");
	}
	else
		System.out.println("sorry.....Tea Nmaes are Full....");
		return isTeaNameadded;
	}
	
	public static void showTeaDetails(){
		System.out.println("The available Tea Names are : ");
		for(String teaName:teaNames){
			System.out.println(teaName);
		}
	}
	public static boolean updateTeaName(String newTeaName,String oldTeaName){
		System.out.println("update method on tea is started");
		boolean isTeaNameupdated = false;
		for(int position = 0;position<teaNames.length;position++){
			if (teaNames[position]==oldTeaName){
				teaNames[position]=newTeaName;
				isTeaNameupdated = true;
			}
		}
		if(isTeaNameupdated==false){
			System.out.println(oldTeaName+"not found");
		}
		System.out.println("update method on tea is ended");
		return isTeaNameupdated;
	}
	public static boolean deleteTeaName (String teaName){
		boolean isTeaNamedeleted = false;
		int position , newposition;
		for(position=0,newposition=0;position<teaNames.length;position++){
			if(teaNames[position]!=teaName){
				teaNames[newposition]=teaNames[position];
				newposition++;
			}
			else
				isTeaNamedeleted=true;
		}
		int newLength = newposition;
		teaNames = Arrays.copyOf(teaNames,newLength);
		if(isTeaNamedeleted==false){
			System.out.println("not found" +teaName);
		}
		return isTeaNamedeleted;
	}
}