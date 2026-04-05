class MusicInstrument
{
	String instrumentType;
	double cost;
	String companyName;
	
	MusicInstrument(String instrumentType,double cost,String companyName)
	{
		this.instrumentType=instrumentType;
		this.cost=cost;
		this.companyName=companyName;
		
		System.out.println("constructor of Type String,double,String is created");
	}
}