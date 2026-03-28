class SteelRunner
{
	public static void main(String...names)
	{
		System.out.println("-------------------------------SAVING METHOD-----------------------------");
		String[] steelNames=new String[8];
		Steel steel=new Steel(steelNames);
		
		steel.getSteelName(null);
		steel.getSteelName("Alloy");
		steel.getSteelName("Carbon");
		steel.getSteelName("Stainless");
		steel.getSteelName("Tool");
		steel.getSteelName("Spring");
		steel.getSteelName("Mild");
		steel.getSteelName("Galvanized");
		steel.getSteelName("Duplex");
		steel.getSteelName("Cast");
		
		System.out.println("-------------------------------SEARCHING METHOD-----------------------------");

		steel.getSearchName("Alloy");
		steel.getSearchName("Carbon");
		steel.getSearchName("Stainless");
		steel.getSearchName("Tool");
		steel.getSearchName("Spring");
		steel.getSearchName("Mild");
		steel.getSearchName("Galvanized");
		steel.getSearchName("Duplex");
		steel.getSearchName("Alloy");

		System.out.println("------------------------------------UPDATING----------------------------------");

		steel.updateByIndex(0,"Alloy");
		steel.updateByIndex(0,"Alloy Steel");
		steel.updateByIndex(0,null);
		steel.updateByIndex(1,"Carbon Steel");

		steel.getSearchName("Alloy Steel");
		steel.getSearchName("Carbon Steel");

		System.out.println("------------------------------------DELETING----------------------------------");

		steel.deleteSteelNameByIndex(0);
		steel.deleteSteelNameByIndex(1);

		steel.getSearchName("Alloy Steel");
		steel.getSearchName("Carbon Steel");
	}
}