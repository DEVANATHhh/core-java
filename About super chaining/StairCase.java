class StairCase
{
	String location;
	int stepCount;
	boolean isSteel;
	
	StairCase(String location,int stepCount,boolean isSteel)
	{
		this.location=location;
		this.stepCount=stepCount;
		this.isSteel=isSteel;
		
		System.out.println("constructor of Type String,int,boolean is created");
	}
}