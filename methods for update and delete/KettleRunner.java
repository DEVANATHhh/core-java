class KettleRunner
{
	public static void main(String...names)
	{
		System.out.println("-------------------------------SAVING METHOD-----------------------------");
		String[] kettleNames=new String[8];
		Kettle kettle=new Kettle(kettleNames);
		
		kettle.getKettleName(null);
		kettle.getKettleName("Prestige");
		kettle.getKettleName("Philips");
		kettle.getKettleName("Havells");
		kettle.getKettleName("Butterfly");
		kettle.getKettleName("Pigeon");
		kettle.getKettleName("Bajaj");
		kettle.getKettleName("Orpat");
		kettle.getKettleName("Milton");
		kettle.getKettleName("Cello");
		
		System.out.println("-------------------------------SEARCHING METHOD-----------------------------");

		kettle.getSearchName("Prestige");
		kettle.getSearchName("Philips");
		kettle.getSearchName("Havells");
		kettle.getSearchName("Butterfly");
		kettle.getSearchName("Pigeon");
		kettle.getSearchName("Bajaj");
		kettle.getSearchName("Orpat");
		kettle.getSearchName("Milton");
		kettle.getSearchName("Prestige");

		System.out.println("------------------------------------UPDATING----------------------------------");

		kettle.updateByIndex(0,"Prestige");
		kettle.updateByIndex(0,"Prestige Plus");
		kettle.updateByIndex(0,null);
		kettle.updateByIndex(1,"Philips Advanced");

		kettle.getSearchName("Prestige Plus");
		kettle.getSearchName("Philips Advanced");

		System.out.println("------------------------------------DELETING----------------------------------");

		kettle.deleteKettleNameByIndex(0);
		kettle.deleteKettleNameByIndex(1);

		kettle.getSearchName("Prestige Plus");
		kettle.getSearchName("Philips Advanced");
	}
}