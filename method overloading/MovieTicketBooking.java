class MovieTicketBooking {

   
    static void bookTicket(String movieName) {
        System.out.println("Ticket booked for movie: " + movieName);
    }

    
    static void bookTicket(String movieName, int seats) {
        System.out.println("Booked " + seats +" seat's for movie: " + movieName);
    }

    
    static void bookTicket(String movieName, int seats, String seatType) {
        System.out.println("Booked " + seats +" " + seatType +" seat(s) for movie: " + movieName);
    }
}
