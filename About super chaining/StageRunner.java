class StageRunner
{
	public static void main(String...val)
	{
		MarriageStage marriageStage1=new MarriageStage();
		System.out.println(marriageStage1.type);
		System.out.println(marriageStage1.size);
		System.out.println(marriageStage1.design);
		
		MarriageStage marriageStage2=new MarriageStage("halditype","medium","lighting");
		System.out.println(marriageStage2.type);
		System.out.println(marriageStage2.size);
		System.out.println(marriageStage2.design);
		
		MarriageStage marriageStage3=new MarriageStage("kitty");
		System.out.println(marriageStage3.type);
		System.out.println(marriageStage3.size);
		System.out.println(marriageStage3.design);
	}
}