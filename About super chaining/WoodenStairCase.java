class WoodenStairCase extends StairCase
{
	WoodenStairCase()
	{
		super("outside",100,false);
		System.out.println("---------------------------------");
		System.out.println("implicit values(default values)");
	}
	
	WoodenStairCase(String location,int stepCount,boolean isSteel)
	{
		super(location,stepCount,isSteel);
		System.out.println("---------------------------------");
		System.out.println("explicit values(changable at runtime)");
	}
	
	WoodenStairCase(int stepCount,boolean isSteel)
	{
		super("backside",50,true);
		System.out.println("---------------------------------");
		System.out.println("explicit + implicit values");
	}
} 