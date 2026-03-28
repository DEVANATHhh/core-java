class StorePetroliumCompanyRunner
{
	public static void main(String... values)
	{
		System.out.println("-------------------------------SAVING METHOD-----------------------------");
		String[] companyName=new String[5];
		StorePetroliumCompany storePetroliumCompany=new StorePetroliumCompany(companyName);
		
		storePetroliumCompany.getCompanyName("Indian oil");
		storePetroliumCompany.getCompanyName("Bharath petrolium");
		storePetroliumCompany.getCompanyName("shell");
		storePetroliumCompany.getCompanyName("Hindusthan petrolium");
		storePetroliumCompany.getCompanyName(null);
		storePetroliumCompany.getCompanyName("nayara");
		storePetroliumCompany.getCompanyName("nayara");

		System.out.println("-------------------------------SEARCHING METHOD-----------------------------");

		storePetroliumCompany.searchCompany("Indian oil");
		storePetroliumCompany.searchCompany("shell");
		storePetroliumCompany.searchCompany("nayara");

		System.out.println("------------------------------------UPDATING----------------------------------");

		storePetroliumCompany.updateByIndex(0,"Indian oil");
		storePetroliumCompany.updateByIndex(0,"Indian Oil Corporation");
		storePetroliumCompany.updateByIndex(1,"Bharath Petroleum Ltd");

		storePetroliumCompany.searchCompany("Indian Oil Corporation");

		System.out.println("------------------------------------DELETING----------------------------------");

		storePetroliumCompany.deleteCompanyByIndex(0);
		storePetroliumCompany.deleteCompanyByIndex(1);

		storePetroliumCompany.searchCompany("Indian Oil Corporation");
	}
}