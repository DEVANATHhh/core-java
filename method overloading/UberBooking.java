class UberBooking {

   static void bookRide(String pickup) {
        System.out.println("Ride booked from " + pickup);
		 
	
	if(pickup==null){
		        System.out.println("The data is invalid ! " );
				return;
	}
   }

   
    static void bookRide(String pickup, String drop) {
        System.out.println("Ride booked from " + pickup + " to " + drop);
		
			if(pickup==null){
		        System.out.println("The data is invalid ! " );
				return;
	}
	
	
	if(drop==null){
		        System.out.println("The data is invalid ! " );
				return;
	}

    }
	
   
   static void bookRide(String pickup, String drop, int charge) {
        System.out.println("Ride booked from " + pickup + " to " + drop +" and charge is  " + charge );
		
			if(pickup==null){
		        System.out.println("The data is invalid ! " );
				return;
	}
	
	
	if(drop==null){
		        System.out.println("The data is invalid ! " );
				return;
	}

		if(charge<=10){
		        System.out.println("The data is invalid ! " );
				return;
				
					
	}
		System.out.println("The datas are valid");

    }
	
}

