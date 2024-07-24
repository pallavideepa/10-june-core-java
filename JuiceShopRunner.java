class JuiceShopRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean juiceAdded = JuiceShop.addJuiceName("orange juice");
		System.out.println("Juice names added " +juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("watermelon juice");
		System.out.println("Juice names added " +juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("mosambi juice");
		System.out.println("Juice names added " +juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("grape juice");
		System.out.println("Juice names added " +juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("pineapple juice");
		System.out.println("Juice names added " +juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("muskmelon juice");
		System.out.println("Juice names added " +juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("apple juice");
		System.out.println("Juice names added " +juiceAdded);
		
		JuiceShop.readJuiceName();
		System.out.println("Main Ended");
	}
}