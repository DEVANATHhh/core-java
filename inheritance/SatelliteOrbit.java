class SatelliteOrbit extends Orbit {
    String satellite;
    int altitude;
    boolean active;
    String purpose;
    int duration;

    void displayDetails() {
        System.out.println(satellite+" "+altitude+" "+active+" "+purpose+" "+duration);
    }
}