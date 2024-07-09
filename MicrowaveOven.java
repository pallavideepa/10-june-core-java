class MicrowaveOven {
		static boolean isConnected = false ;
		public static void switchOn(){
			System.out.println("start of switchOn");
			if(isConnected == false){
				isConnected = true;
				System.out.println("the MicrowaveOven is switched on..");
			}
			System.out.println("end of switchOn");
			return;
		}
		public static void switchOff(){
			System.out.println("start of switchOff");
			if(isConnected == true){
				isConnected = false;
				System.out.println("the MicrowaveOven is switched off..");
			}
			System.out.println("end of switchOff");
			return;
}