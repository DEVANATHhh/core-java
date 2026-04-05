class MusicInstrumentRunner
{
	public static void main(String... values)
	{
		Tabla tabla1=new Tabla();
		System.out.println(tabla1.instrumentType);
		System.out.println(tabla1.cost);
		System.out.println(tabla1.companyName);
		
		
		Tabla tabla2=new Tabla("wind",60000.99,"Sony");
		System.out.println(tabla2.instrumentType);
		System.out.println(tabla2.cost);
		System.out.println(tabla2.companyName);
		
		Tabla tabla3=new Tabla("String");
		System.out.println(tabla3.instrumentType);
		System.out.println(tabla3.cost);
		System.out.println(tabla3.companyName);
	}
}