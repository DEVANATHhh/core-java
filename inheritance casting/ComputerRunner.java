class ComputerRunner{
	public static void main(String[] args){
		Browser browser = new Browser();
		
		ChromBrowser chromBrowser = new ChromBrowser();
		
		MobileChromBrowser mobile = new MobileChromBrowser();
		
		Computer computer = new Computer();
		computer.install(browser);
		System.out.println();
		computer.install(chromBrowser);
		System.out.println();
		computer.install(mobile);
	}
}