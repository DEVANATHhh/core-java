class SmartPowerBank extends PowerBank {
    int ports;
    boolean fastCharge;
    String color;
    int weight;
    String type;

    void displayDetails() {
        System.out.println(ports+" "+fastCharge+" "+color+" "+weight+" "+type);
    }
}