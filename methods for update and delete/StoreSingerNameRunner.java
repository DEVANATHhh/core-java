class StoreSingerNameRunner
{
	public static void main(String[] values)
	{
		System.out.println("-------------------------------SAVING METHOD-----------------------------");

		String[] names=new String[20];
		StoreSingerName storeSingerName=new StoreSingerName(names);
		
		storeSingerName.getSingerName("SPB");
		storeSingerName.getSingerName("AR rahman");
		storeSingerName.getSingerName("keeravani");
		storeSingerName.getSingerName("chitra");
		storeSingerName.getSingerName("anirudh");
		storeSingerName.getSingerName("thaman");
		storeSingerName.getSingerName("dsp");
		storeSingerName.getSingerName("ajneesh");
		storeSingerName.getSingerName("ravi basrur");
		storeSingerName.getSingerName("vijay prakash");
		storeSingerName.getSingerName("sanjith");
		storeSingerName.getSingerName("karthik");
		storeSingerName.getSingerName("Anurag kulkarni");
		storeSingerName.getSingerName("vishal mishra");
		storeSingerName.getSingerName(null);
		storeSingerName.getSingerName("shreya goshal");
		storeSingerName.getSingerName("sunitha");
		storeSingerName.getSingerName("rahul sipligunj");
		storeSingerName.getSingerName("chinmay sripadha");
		storeSingerName.getSingerName("arijith singh");
		storeSingerName.getSingerName("sid sriram");

		System.out.println("-------------------------------SEARCHING METHOD-----------------------------");

		storeSingerName.getSearchSinger("SPB");
		storeSingerName.getSearchSinger("AR rahman");
		storeSingerName.getSearchSinger("keeravani");
		storeSingerName.getSearchSinger("chitra");
		storeSingerName.getSearchSinger("anirudh");
		storeSingerName.getSearchSinger("thaman");
		storeSingerName.getSearchSinger("dsp");
		storeSingerName.getSearchSinger("ajneesh");
		storeSingerName.getSearchSinger("ravi basrur");
		storeSingerName.getSearchSinger("vijay prakash");
		storeSingerName.getSearchSinger("sanjith");
		storeSingerName.getSearchSinger("karthik");
		storeSingerName.getSearchSinger("Anurag kulkarni");
		storeSingerName.getSearchSinger("vishal mishra");
		storeSingerName.getSearchSinger("shreya goshal");
		storeSingerName.getSearchSinger("sunitha");
		storeSingerName.getSearchSinger("rahul sipligunj");
		storeSingerName.getSearchSinger("chinmay sripadha");
		storeSingerName.getSearchSinger("arijith singh");
		storeSingerName.getSearchSinger("sid sriram");
		storeSingerName.getSearchSinger("SPB");

		System.out.println("-------------------------------UPDATING METHOD-----------------------------");

		storeSingerName.updateSingerByIndex(0,"SP Balasubramanyam");
		storeSingerName.updateSingerByIndex(1,"A R Rahman");

		storeSingerName.getSearchSinger("SP Balasubramanyam");
		storeSingerName.getSearchSinger("A R Rahman");

		System.out.println("-------------------------------DELETING METHOD-----------------------------");

		storeSingerName.deleteSingerByIndex(0);
		storeSingerName.deleteSingerByIndex(1);

		storeSingerName.getSearchSinger("SP Balasubramanyam");
		storeSingerName.getSearchSinger("A R Rahman");
	}
}