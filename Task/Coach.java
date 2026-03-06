class Coach {

    String company;
    int seats;
    double price;
    boolean ac;
    String route;

    Passenger passenger;
    Driver driver;
    Ticket ticket;
    BusStop busStop;
    Luggage luggage;

    Coach(String company, int seats, double price, boolean ac, String route,
          Passenger passenger, Driver driver, Ticket ticket, BusStop busStop, Luggage luggage) {

        this.company = company;
        this.seats = seats;
        this.price = price;
        this.ac = ac;
        this.route = route;

        this.passenger = passenger;
        this.driver = driver;
        this.ticket = ticket;
        this.busStop = busStop;
        this.luggage = luggage;
    }

    void getInfo() {

        System.out.println("Company: " + this.company);
        System.out.println("Seats: " + this.seats);
        System.out.println("Price: " + this.price);
        System.out.println("AC: " + this.ac);
        System.out.println("Route: " + this.route);

        if(passenger != null){
            passenger.getInfo();
        }

        if(driver != null){
            driver.getInfo();
        }

        if(ticket != null){
            ticket.getInfo();
        }

        if(busStop != null){
            busStop.getInfo();
        }

        if(luggage != null){
            luggage.getInfo();
        }
    }
}