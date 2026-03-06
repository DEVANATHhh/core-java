class BusStop {

    String location;
    int passengersWaiting;

    BusStop(String location, int passengersWaiting){
        this.location = location;
        this.passengersWaiting = passengersWaiting;
    }

    void getInfo(){
        System.out.println("Location: " + this.location + ", Passengers Waiting: " + this.passengersWaiting);
    }
}