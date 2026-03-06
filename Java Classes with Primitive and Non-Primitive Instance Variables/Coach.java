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

    void getinfo() {

        System.out.println("Company: " + this.company);
        System.out.println("Seats: " + this.seats);
        System.out.println("Price: " + this.price);
        System.out.println("AC: " + this.ac);
        System.out.println("Route: " + this.route);

        System.out.println("Passenger: " + this.passenger);
        System.out.println("Driver: " + this.driver);
        System.out.println("Ticket: " + this.ticket);
        System.out.println("BusStop: " + this.busStop);
        System.out.println("Luggage: " + this.luggage);
    }
}