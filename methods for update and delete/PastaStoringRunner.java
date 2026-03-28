class PastaStoringRunner
{
	public static void main(String...values)
	{
		System.out.println("-------------------------------SAVING METHOD-----------------------------");
		String[] flavours=new String[8];
		PastaStoring pastaStoring =new PastaStoring(flavours);
		
		pastaStoring.getPastaFlavours("mionise");
		pastaStoring.getPastaFlavours("green souse");
		pastaStoring.getPastaFlavours("white souse");
		pastaStoring.getPastaFlavours("chilli souse");
		pastaStoring.getPastaFlavours("hot rider");
		pastaStoring.getPastaFlavours("lime pasta");
		pastaStoring.getPastaFlavours("masala pasta");
		pastaStoring.getPastaFlavours("pasta special");
		pastaStoring.getPastaFlavours(null);
		pastaStoring.getPastaFlavours("desi pasta");
		
		System.out.println("-------------------------------SEARCHING METHOD-----------------------------");
		
		pastaStoring.searchFlavour("mionise");
		pastaStoring.searchFlavour("desi pasta");
		pastaStoring.searchFlavour("chilli souse");
		pastaStoring.searchFlavour("pasta special");
		pastaStoring.searchFlavour("masala pasta");
		pastaStoring.searchFlavour("hot rider");
		pastaStoring.searchFlavour("lime pasta");
		pastaStoring.searchFlavour("white souse");
		pastaStoring.searchFlavour(null);
		pastaStoring.searchFlavour("makhani souse");
		
		System.out.println("------------------------------------UPDATING----------------------------------");
		pastaStoring.updateByIndex(0,"mionise");
		pastaStoring.updateByIndex(0,"mixed mionise");
		pastaStoring.updateByIndex(0,null);
		pastaStoring.updateByIndex(1,"potato mixed");
		
		pastaStoring.searchFlavour("mixed mionise");
		pastaStoring.searchFlavour("potato mixed");
	
		System.out.println("------------------------------------DELETING----------------------------------");
		pastaStoring.deleteFlavourByIndex(0);
		pastaStoring.deleteFlavourByIndex(1);
	
		pastaStoring.searchFlavour("mionise");
		pastaStoring.searchFlavour("green souse");
	}
}
