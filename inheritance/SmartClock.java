class SmartClock extends Clock {
    boolean alarm;
    boolean bluetooth;
    String color;
    int battery;
    String display;

    void displayDetails() {
        System.out.println(alarm+" "+bluetooth+" "+color+" "+battery+" "+display);
    }
}