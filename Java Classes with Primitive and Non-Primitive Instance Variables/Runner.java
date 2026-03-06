class Runner {

    public static void main(String[] args) {

    
        Samosa samosa = new Samosa();
        Mobile mobile = new Mobile();
        Car car = new Car();
        Laptop laptop = new Laptop();
        Book book = new Book();

        Lion lion = new Lion("Simba", 5, 190.5, true, "Golden", samosa, mobile, car, book, laptop);
		lion.getinfo();


        
        Engine engine = new Engine();
        Generator generator = new Generator();
        Pump pump = new Pump();
        FanMotor fanMotor = new FanMotor();
        Compressor compressor = new Compressor();

        Motor motor = new Motor("Bosch", 500, 15000.50, true, "AC",engine, generator, pump, fanMotor, compressor);
        motor.getinfo();


       
        Passenger passenger = new Passenger();
        Driver driver = new Driver();
        Ticket ticket = new Ticket();
        BusStop busStop = new BusStop();
        Luggage luggage = new Luggage();

        Coach coach = new Coach("Volvo", 40, 1200000.75, true, "Bangalore-Mysore",passenger, driver, ticket, busStop, luggage);
        coach.getinfo();


        Team team = new Team();
        Player player = new Player();
        Stadium stadium = new Stadium();
        Umpire umpire = new Umpire();
        Trophy trophy = new Trophy();

        Ipl ipl = new Ipl("TATA", 10, 20000000.0, true, "2025",team, player, stadium, umpire, trophy);
        ipl.getinfo();


       
        Therapist therapist = new Therapist();
        MassageRoom massageRoom = new MassageRoom();
        Sauna sauna = new Sauna();
        FacialTreatment facialTreatment = new FacialTreatment();
        Reception reception = new Reception();

        Spa spa = new Spa("Relax Spa", 8, 2500.75, true, "Bangalore",therapist, massageRoom, sauna, facialTreatment, reception);
        spa.getinfo();


      
        TeaLeaf teaLeaf = new TeaLeaf();
        Teapot teapot = new Teapot();
        Cup cup = new Cup();
        Kettle kettle = new Kettle();
        Sugar sugar = new Sugar();

        Tea tea = new Tea("Taj Mahal", 2, 250.50, true, "Masala",teaLeaf, teapot, cup, kettle, sugar);
        tea.getinfo();


      
        Tower tower = new Tower();
        Rope rope = new Rope();
        Hammer hammer = new Hammer();
        Clock clock = new Clock();
        Alarm alarm = new Alarm();

        Bell bell = new Bell("Steel", 5, 300.25, false, "Silver",tower, rope, hammer, clock, alarm);
        bell.getinfo();


     
        Sky sky = new Sky();
        Rain rain = new Rain();
        Wind wind = new Wind();
        Lightning lightning = new Lightning();
        Thunder thunder = new Thunder();

        Cloud cloud = new Cloud("AWS", 100, 5000.50, true, "Asia",sky, rain, wind, lightning, thunder);
        cloud.getinfo();


       
        Goldfish goldfish = new Goldfish();
        Coral coral = new Coral();
        Filter filter = new Filter();
        Gravel gravel = new Gravel();
        WaterPlant waterPlant = new WaterPlant();

        Aquarium aquarium = new Aquarium("Glass", 20, 4000.75, true, "Round",goldfish, coral, filter, gravel, waterPlant);
        aquarium.getinfo();
    }
}