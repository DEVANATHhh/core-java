class Motor {

    String brand;
    int power;
    double price;
    boolean electric;
    String type;

    Engine engine;
    Generator generator;
    Pump pump;
    FanMotor fanMotor;
    Compressor compressor;

    Motor(String brand, int power, double price, boolean electric, String type,
          Engine engine, Generator generator, Pump pump, FanMotor fanMotor, Compressor compressor) {

        this.brand = brand;
        this.power = power;
        this.price = price;
        this.electric = electric;
        this.type = type;

        this.engine = engine;
        this.generator = generator;
        this.pump = pump;
        this.fanMotor = fanMotor;
        this.compressor = compressor;
    }

    void getinfo() {

        System.out.println("Brand: " + this.brand);
        System.out.println("Power: " + this.power);
        System.out.println("Price: " + this.price);
        System.out.println("Electric: " + this.electric);
        System.out.println("Type: " + this.type);

        System.out.println("Engine: " + this.engine);
        System.out.println("Generator: " + this.generator);
        System.out.println("Pump: " + this.pump);
        System.out.println("FanMotor: " + this.fanMotor);
        System.out.println("Compressor: " + this.compressor);
    }
}