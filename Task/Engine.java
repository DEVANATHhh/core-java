class Engine {

    int power;
    String fuel;

    Engine(int power, String fuel){
        this.power = power;
        this.fuel = fuel;
    }

    void getInfo(){
        System.out.println("Power: " + this.power + ", Fuel: " + this.fuel);
    }
}