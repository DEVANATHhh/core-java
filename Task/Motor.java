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

    void getInfo() {

        System.out.println("Brand: " + this.brand);
        System.out.println("Power: " + this.power);
        System.out.println("Price: " + this.price);
        System.out.println("Electric: " + this.electric);
        System.out.println("Type: " + this.type);

        if(engine != null){
            engine.getInfo();
        }

        if(generator != null){
            generator.getInfo();
        }

        if(pump != null){
            pump.getInfo();
        }

        if(fanMotor != null){
            fanMotor.getInfo();
        }

        if(compressor != null){
            compressor.getInfo();
        }
    }
}