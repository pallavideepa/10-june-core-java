class RedBus{
    static String headQuarters = "Bengaluru" ;
	static int dateFounded = 2006 ;
	static String busNames[] = {"Airavatha","RajaHamsa","Volvo","Srs","VRL","KSRTC","Gajanana","SeaBird","Suguma"};
 
 
    public static void main(String[] bus){
	System.out.println("Main Started");
	System.out.println("About RedBus ");
	System.out.println("Date Founded :" +dateFounded);
	System.out.println("It is located @ :"+ headQuarters);
	System.out.println("No of Buses Available in RedBus :" + busNames.length);
	System.out.println("List of Buses Available for the Transport are:");
    //System.out.println("The Available buses are :" + busNames[0] + "," + busNames[1] + ","+ busNames[2] + "," + busNames[3] + "," +busNames[4] + "," + busNames[5]);
    //System.out.println(busNames);
	/*for(String busName : busNames){
       System.out.println(busName);
	}*/
	

 
    for(int ref = 0 ; ref < busNames.length ; ref++){
		String value = busNames[ref];
		System.out.println(value);
	}
		System.out.println("Main Ended");
	}
	}