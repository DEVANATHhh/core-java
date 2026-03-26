class TollGate {

    String name;
    String location;
    double tollAmount;
    String vehicleType;
    int numberOfLanes;
    String tollType;

    TollGate(String name, String location, double tollAmount, String vehicleType, int numberOfLanes, String tollType) {
        this.name = name;
        this.location = location;
        this.tollAmount = tollAmount;
        this.vehicleType = vehicleType;
        this.numberOfLanes = numberOfLanes;
        this.tollType = tollType;
    }
}