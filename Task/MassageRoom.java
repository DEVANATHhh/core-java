class MassageRoom {

    int beds;
    boolean available;

    MassageRoom(int beds, boolean available){
        this.beds = beds;
        this.available = available;
    }

    void getInfo(){
        System.out.println("Beds: " + this.beds + ", Available: " + this.available);
    }
}