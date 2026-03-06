class Runner {

    public static void main(String[] args) {

        
        Samosa samosa = new Samosa("Triangle", "Potato");
        Mobile mobile = new Mobile("Samsung", "S23");
        Car car = new Car("BMW", 220);
        Laptop laptop = new Laptop("Dell", "i7");
        Book book = new Book("Java Basics", "James Gosling");

        Lion lion = new Lion("Simba", 5, 190.5, true, "Golden",samosa, mobile, car, book, laptop);
        lion.getInfo();


        Engine engine = new Engine(500, "Petrol");
        Generator generator = new Generator(220, 1000);
        Pump pump = new Pump(50, 300);
        FanMotor fanMotor = new FanMotor(1500, "Ceiling");
        Compressor compressor = new Compressor(120, 500);

        Motor motor = new Motor("Bosch", 500, 15000.50, true, "AC",engine, generator, pump, fanMotor, compressor);
        motor.getInfo();


       
        Passenger passenger = new Passenger("Rahul", 25);
        Driver driver = new Driver("Ramesh", 10);
        Ticket ticket = new Ticket(12, 500);
        BusStop busStop = new BusStop("Majestic", 30);
        Luggage luggage = new Luggage(2, 15);

        Coach coach = new Coach("Volvo", 40, 1200000.75, true, "Bangalore-Mysore",passenger, driver, ticket, busStop, luggage);
        coach.getInfo();


        Team team = new Team("RCB", 11);
        Player player = new Player("Virat", 120);
        Stadium stadium = new Stadium("Chinnaswamy", 40000);
        Umpire umpire = new Umpire("Kumar", 150);
        Trophy trophy = new Trophy("Gold", 10);

        Ipl ipl = new Ipl("TATA", 10, 20000000.0, true, "2025",team, player, stadium, umpire, trophy);
        ipl.getInfo();


        Therapist therapist = new Therapist("Anita", 8);
        MassageRoom massageRoom = new MassageRoom(4, true);
        Sauna sauna = new Sauna(80, 6);
        FacialTreatment facialTreatment = new FacialTreatment("Herbal", 45);
        Reception reception = new Reception(3, "White");

        Spa spa = new Spa("Relax Spa", 8, 2500.75, true, "Bangalore",therapist, massageRoom, sauna, facialTreatment, reception);
        spa.getInfo();


        TeaLeaf teaLeaf = new TeaLeaf("Assam", 200);
        Teapot teapot = new Teapot("Clay", 2);
        Cup cup = new Cup("White", 250);
        Kettle kettle = new Kettle(2, "Steel");
        Sugar sugar = new Sugar(2, "Brown");

        Tea tea = new Tea("Taj Mahal", 2, 250.50, true, "Masala",teaLeaf, teapot, cup, kettle, sugar);
        tea.getInfo();


        Tower tower = new Tower(100, "Stone");
        Rope rope = new Rope(10, "Fiber");
        Hammer hammer = new Hammer(5, "Iron");
        Clock clock = new Clock("Titan", 30);
        Alarm alarm = new Alarm("Beep", 10);

        Bell bell = new Bell("Steel", 5, 300.25, false, "Silver",tower, rope, hammer, clock, alarm);
        bell.getInfo();


        Sky sky = new Sky("Blue", 10);
        Rain rain = new Rain(5, "Heavy");
        Wind wind = new Wind(40, "East");
        Lightning lightning = new Lightning(200, "White");
        Thunder thunder = new Thunder(80, 5);

        Cloud cloud = new Cloud("AWS", 100, 5000.50, true, "Asia",sky, rain, wind, lightning, thunder);
        cloud.getInfo();


        Goldfish goldfish = new Goldfish(1, "Orange");
        Coral coral = new Coral("Soft", 5);
        Filter filter = new Filter("AquaTech", 200);
        Gravel gravel = new Gravel("Black", 10);
        WaterPlant waterPlant = new WaterPlant("Hydrilla", 15);

        Aquarium aquarium = new Aquarium("Glass", 20, 4000.75, true, "Round",goldfish, coral, filter, gravel, waterPlant);
        aquarium.getInfo();
    }
}