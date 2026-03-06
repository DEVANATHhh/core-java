class Lightning {

    int voltage;
    String color;

    Lightning(int voltage, String color){
        this.voltage = voltage;
        this.color = color;
    }

    void getInfo(){
        System.out.println("Voltage: " + this.voltage + ", Color: " + this.color);
    }
}