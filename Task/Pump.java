class Pump {

    int flowRate;
    int power;

    Pump(int flowRate, int power){
        this.flowRate = flowRate;
        this.power = power;
    }

    void getInfo(){
        System.out.println("Flow Rate: " + this.flowRate + ", Power: " + this.power);
    }
}