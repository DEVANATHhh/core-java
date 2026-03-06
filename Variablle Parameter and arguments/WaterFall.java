class WaterFall {

    static void info(String name, String location, double height, boolean touristSpot) {
        System.out.println("WaterFall Name: " + name +"  Location: " + location +"  Height: " + height +"  Tourist Spot: " + touristSpot);
		
		if(name==null){
			System.out.println("The name is invalid");
			return;
		}
		if(location>null){
			System.out.println("The location info is invalid");
			return;
		}
		
		
		if(height>10000){
			System.out.println("The height is invalid");
			return;
		}
		
		
					System.out.println("The data is valid");
    }

    static void stateOwningInfo(String state, String country, String river, int yearFormed, boolean protectedArea) {
        System.out.println("State: " + state +"  Country: " + country +"  River: " + river +"  Year Formed: " + yearFormed +"  Protected: " + protectedArea);
		if(state==null){
			System.out.println("The state name is invalid");
			return;
		}
		if(country==null){
			System.out.println("The ccountry name is invalid");
			return;
		}
		
		
		if(river==null){
			System.out.println("The river name is invalid");
			return;
		}
		
		if(yearFormed>1900){
			System.out.println("The year formed date is invalid");
			return;
		}
		
		
		System.out.println("The datas are valid");
    }
}
