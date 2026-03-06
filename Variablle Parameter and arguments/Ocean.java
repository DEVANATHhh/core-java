class Ocean {

   static void oceanInfo(String name, double area, double depth, boolean salty, int marineSpecies) {
        System.out.println("Ocean Name: " + name+"  Area: " + area+"  Depth: " + depth+" Salty: " + salty+"Marine Species: " + marineSpecies);
		
		if(name==null){
			System.out.println("The name is invalid");
			return;
		}
		if(area>500000){
			System.out.println("The area is invalid");
			return;
		}
		
		
		if(marineSpecies>1000){
			System.out.println("The number of marine species  is invalid");
			return;
		}
		
					System.out.println("The data is valid");

    }
}
