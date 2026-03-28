class AgencyRunner
{
	public static void main(String...numbers)
	{
		System.out.println("-------------------------------SAVING METHOD-----------------------------");
		int[] cylinderNumbers=new int[8];
		Agency agency=new Agency(cylinderNumbers);
		
		agency.getCylinderNumber(0);
		agency.getCylinderNumber(11);
		agency.getCylinderNumber(12);
		agency.getCylinderNumber(13);
		agency.getCylinderNumber(14);
		agency.getCylinderNumber(15);
		agency.getCylinderNumber(16);
		agency.getCylinderNumber(17);
		agency.getCylinderNumber(18);
		agency.getCylinderNumber(19);
		
		System.out.println("-------------------------------SEARCHING METHOD-----------------------------");

		agency.getSearchNumber(0);
		agency.getSearchNumber(11);
		agency.getSearchNumber(12);
		agency.getSearchNumber(13);
		agency.getSearchNumber(14);
		agency.getSearchNumber(15);
		agency.getSearchNumber(16);
		agency.getSearchNumber(17);
		agency.getSearchNumber(18);
		agency.getSearchNumber(11);

		System.out.println("------------------------------------UPDATING----------------------------------");

		agency.updateByIndex(0,11);
		agency.updateByIndex(0,21);
		agency.updateByIndex(0,0);
		agency.updateByIndex(1,22);

		agency.getSearchNumber(21);
		agency.getSearchNumber(22);

		System.out.println("------------------------------------DELETING----------------------------------");

		agency.deleteCylinderNumberByIndex(0);
		agency.deleteCylinderNumberByIndex(1);

		agency.getSearchNumber(21);
		agency.getSearchNumber(22);
	}
}