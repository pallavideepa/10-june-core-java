class SmartWatch {
		static boolean isConnected = false ;
		public static boolean onOrOff(){
			System.out.println("start of onOrOff");
			if(isConnected == false){
				isConnected = true;
				} 
				else if(isConnected == true){
				isConnected = false;
				}
			System.out.println("end of turnOn");
			return isConnected;
		
		}	
}