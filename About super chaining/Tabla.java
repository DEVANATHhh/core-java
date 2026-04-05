class Tabla extends MusicInstrument
{
	Tabla()
	{
		super("percusion",149999.99,"JBL");
		System.out.println("---------------------------------");
		System.out.println("implicit values(default values)");
	}
	
	Tabla(String instrumentType, double cost, String companyName)
	{
		super(instrumentType,cost,companyName);
		System.out.println("---------------------------------");
		System.out.println("explicit values(changable at runtime)");
	}
	
	Tabla(String instrumentType)
	{
		super("String",100000.90,"Dolby");
		System.out.println("---------------------------------");
		System.out.println("explicit + implicit values");
	}
}