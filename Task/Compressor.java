class Compressor {

    int pressure;
    int power;

    Compressor(int pressure, int power){
        this.pressure = pressure;
        this.power = power;
    }

    void getInfo(){
        System.out.println("Pressure: " + this.pressure + ", Power: " + this.power);
    }
}