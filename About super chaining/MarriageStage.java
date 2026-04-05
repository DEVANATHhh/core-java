class MarriageStage extends Stage
{
	MarriageStage()
	{
		super("batchelors party","small","cloths");
		System.out.println("---------------------------------");
		System.out.println("implicit values(default values)");
	}
	
	MarriageStage(String type,String size,String design)
	{
		super(type,size,design);
		System.out.println("---------------------------------");
		System.out.println("explicit values(changable at runtime)");
	}
	
	MarriageStage(String type)
	{
		super("kitty party","large","flowers");
		System.out.println("---------------------------------");
		System.out.println("explicit + implicit values");
	}
}