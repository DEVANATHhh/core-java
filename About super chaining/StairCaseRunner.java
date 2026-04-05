class StairCaseRunner
{
	public static void main(String... values)
	{
		WoodenStairCase woodenStairCase1=new WoodenStairCase();
		System.out.println(woodenStairCase1.location);
		System.out.println(woodenStairCase1.stepCount);
		System.out.println(woodenStairCase1.isSteel);
		
		WoodenStairCase woodenStairCase2=new WoodenStairCase("inside",80,true);
		System.out.println(woodenStairCase2.location);
		System.out.println(woodenStairCase2.stepCount);
		System.out.println(woodenStairCase2.isSteel);
		
		WoodenStairCase woodenStairCase3=new WoodenStairCase(50,false);
		System.out.println(woodenStairCase3.location);
		System.out.println(woodenStairCase3.stepCount);
		System.out.println(woodenStairCase3.isSteel);
	}
}