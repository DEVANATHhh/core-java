class Mountain {

   static void mountainInfo(String name, double height, String location) {
        System.out.println("Mountain Name: " + name +"  Height: " + height +"  Location: " + location);
		
		if(name==null){
			System.out.println("The data is invalid");
			return;
		}
		if(height>10000){
			System.out.println("The data is invalid");
			return;
		}
		
		
		if(location==null){
			System.out.println("The data is invalid");
			return;
		}
		
		System.out.println("The data is valid ");
    }

  static  void trekkingInfo(String difficulty, int days, boolean guideRequired) {
        System.out.println("Difficulty: " + difficulty +"  Days: " + days +"  Guide Required: " + guideRequired);
		
		if(difficulty==null){
			System.out.println("The data is invalid");
			return;
		}
		if(days>=1){
			System.out.println("The data is invalid");
			return;
		}
		
				System.out.println("The data is valid ");

		}
    }
    

