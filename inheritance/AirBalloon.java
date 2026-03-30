class AirBalloon extends Balloon {
    String gas;
    int height;
    boolean decorated;
    String shape;
    String owner;

    void displayDetails() {
        System.out.println(gas+" "+height+" "+decorated+" "+shape+" "+owner);
    }
}