class Kingdom {

  
    static void save(boolean king, String name, String kingdomName, String queenName, String princessName,int populationOfKingdom, String territory, int yearOfBirth, int yearOfDeath, int armySize, int yearsRuled) {
        System.out.println("Is he the King: " + king + "  Name of the king is: " + name + "  Name of the Kingdom: " + kingdomName +"  Queen name: " + queenName + "  Princess name: " + princessName + "  Population: " + populationOfKingdom +"  Territory: " + territory + "  Birth Year: " + yearOfBirth + "  Death Year: " + yearOfDeath +"  Army Size: " + armySize + "  Years Ruled: " + yearsRuled);

        if (king == false) {
            System.out.println(" Data is invalid");
            return;
        }
		
		 if (name == null) {
            System.out.println(" Data is invalid");
            return;
        }
		
		 if (kingdomName == null) {
            System.out.println(" Data is invalid");
            return;
        }
		
		 if (queenName == null) {
            System.out.println(" Data is invalid");
            return;
        }
		
		 if (princessName == null) {
            System.out.println(" Data is invalid");
            return;
        }
		
		 if (populationOfKingdom >= 1000) {
            System.out.println(" Data is invalid");
            return;
        }
		
		 if (yearOfBirth >1920) {
            System.out.println(" Data is invalid");
            return;
        }
		
		 if (yearOfDeath <2005) {
            System.out.println(" Data is invalid");
            return;
        }
		
		if (armySize >1000) {
            System.out.println(" Data is invalid");
            return;
        }
        System.out.println("Kingdom Data is valid");
        
    }

    
    static void saveArmy(int noOfSoldiers, int noOfElephants, int noOfHorses, String type, int noOfWeapons,String commanderName, boolean commanderMarried, String commanderWifeName, boolean commanderIsFather,String commanderChildName, int commanderExperience) {
        System.out.println("Soldiers: " + noOfSoldiers + "  Elephants: " + noOfElephants + "  Horses: " + noOfHorses +"  Army Type: " + type + "  Weapons: " + noOfWeapons + "  Commander: " + commanderName + "  Married: " + commanderMarried + "  Wife Name: " + commanderWifeName +"  Is Father: " + commanderIsFather + "  Child Name: " + commanderChildName +"  Experience: " + commanderExperience + " years");

        if (noOfSoldiers <=1000) {
            System.out.println(" Data is invalid");
            return;
			
			
			 if (noOfElephants>500) {
            System.out.println(" Data is invalid");
            return;
        }
		
		 if (noOfHorses >500) {
            System.out.println(" Data is invalid");
            return;
        }
		
		 if (type == null) {
            System.out.println(" Data is invalid");
            return;
        }
		
		 if (noOfWeapons > 1000) {
            System.out.println(" Data is invalid");
            return;
        }
		
		 if (commanderName == null) {
            System.out.println(" Data is invalid");
            return;
        }
		
		 if (commanderMarried == false) {
            System.out.println(" Data is invalid");
            return;
        }
		
		 if (commanderWifeName == null) {
            System.out.println(" Data is invalid");
            return;
        }
		
		 if (commanderIsFather == false) {
            System.out.println(" Data is invalid");
            return;
        }
		
		if (commanderChildName == null) {
            System.out.println(" Data is invalid");
            return;
        }
		
		if (commanderExperience >35) {
            System.out.println(" Data is invalid");
            return;
        }
		
		
        System.out.println("Army Data is valid");
 String commanderWifeName, boolean commanderIsFather,String commanderChildName, int commanderExperience)
    }
}
