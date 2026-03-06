class MovieTicketBooking {

   
    static void bookTicket(String movieName) {
        System.out.println("Ticket booked for movie: " + movieName);
		
		
		if(movieName==null){
		        System.out.println("The data is invalid ! " );
				return;
	}
    }

    
    static void bookTicket(String movieName, int seats) {
        System.out.println("Booked " + seats +" seat's for movie: " + movieName);
		
		if(movieName==null){
		        System.out.println("The data is invalid ! " );
				return;
	}
	
	if(seats<1){
		        System.out.println("The data is invalid ! " );
				return;
	}
		
		
    }

    
    static void bookTicket(String movieName, int seats, String seatType) {
        System.out.println("Booked " + seats +" " + seatType +" seat(s) for movie: " + seatType);
		
		if(movieName==null){
		        System.out.println("The data is invalid ! " );
				return;
	}
	
	if(seats<1){
		        System.out.println("The data is invalid ! " );
				return;
	}
	
	if(seatType==null){
		        System.out.println("The data is invalid ! " );
				return;
	}
			System.out.println("The data is calid");

    }
}
