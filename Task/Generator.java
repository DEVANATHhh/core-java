class Generator {

    int voltage;
    int capacity;

    Generator(int voltage, int capacity){
        this.voltage = voltage;
        this.capacity = capacity;
    }

    void getInfo(){
        System.out.println("Voltage: " + this.voltage + ", Capacity: " + this.capacity);
    }
}