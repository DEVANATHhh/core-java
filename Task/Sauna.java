class Sauna {

    int temperature;
    int capacity;

    Sauna(int temperature, int capacity){
        this.temperature = temperature;
        this.capacity = capacity;
    }

    void getInfo(){
        System.out.println("Temperature: " + this.temperature + ", Capacity: " + this.capacity);
    }
}