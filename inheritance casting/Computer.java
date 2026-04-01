class Computer{
	void install(Browser inst){
		System.out.println("The chrom browser is instaling.....");
		inst.open();
		
		if(inst instanceof ChromBrowser){
			ChromBrowser chrom = (ChromBrowser)inst;
			chrom.fastOpen();
		}
		
		
		if(inst instanceof MobileChromBrowser){
			MobileChromBrowser mobilChrom = (MobileChromBrowser)inst;
			mobilChrom.offline();
		}
	}
}