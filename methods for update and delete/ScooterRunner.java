class ScooterRunner
{
	public static void main(String...names)
	{
		System.out.println("-------------------------------SAVING METHOD-----------------------------");
		String[] scooterNames=new String[8];
		Scooter scooter=new Scooter(scooterNames);
		
		scooter.getScooterName(null);
		scooter.getScooterName("Activa");
		scooter.getScooterName("Jupiter");
		scooter.getScooterName("Access");
		scooter.getScooterName("Fascino");
		scooter.getScooterName("Pleasure");
		scooter.getScooterName("Ntorq");
		scooter.getScooterName("Burgman");
		scooter.getScooterName("Dio");
		scooter.getScooterName("RayZR");
		
		System.out.println("-------------------------------SEARCHING METHOD-----------------------------");

		scooter.getSearchName("Activa");
		scooter.getSearchName("Jupiter");
		scooter.getSearchName("Access");
		scooter.getSearchName("Fascino");
		scooter.getSearchName("Pleasure");
		scooter.getSearchName("Ntorq");
		scooter.getSearchName("Burgman");
		scooter.getSearchName("Dio");
		scooter.getSearchName("Activa");

		System.out.println("------------------------------------UPDATING----------------------------------");

		scooter.updateByIndex(0,"Activa");
		scooter.updateByIndex(0,"Activa 6G");
		scooter.updateByIndex(0,null);
		scooter.updateByIndex(1,"Jupiter ZX");

		scooter.getSearchName("Activa 6G");
		scooter.getSearchName("Jupiter ZX");

		System.out.println("------------------------------------DELETING----------------------------------");

		scooter.deleteScooterNameByIndex(0);
		scooter.deleteScooterNameByIndex(1);

		scooter.getSearchName("Activa 6G");
		scooter.getSearchName("Jupiter ZX");
	}
}