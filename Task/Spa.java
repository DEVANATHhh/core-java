class Spa {

    String name;
    int rooms;
    double price;
    boolean massageAvailable;
    String location;

    Therapist therapist;
    MassageRoom massageRoom;
    Sauna sauna;
    FacialTreatment facialTreatment;
    Reception reception;

    Spa(String name, int rooms, double price, boolean massageAvailable, String location,
        Therapist therapist, MassageRoom massageRoom, Sauna sauna,
        FacialTreatment facialTreatment, Reception reception) {

        this.name = name;
        this.rooms = rooms;
        this.price = price;
        this.massageAvailable = massageAvailable;
        this.location = location;

        this.therapist = therapist;
        this.massageRoom = massageRoom;
        this.sauna = sauna;
        this.facialTreatment = facialTreatment;
        this.reception = reception;
    }

    void getInfo() {

        System.out.println("Name: " + this.name);
        System.out.println("Rooms: " + this.rooms);
        System.out.println("Price: " + this.price);
        System.out.println("Massage Available: " + this.massageAvailable);
        System.out.println("Location: " + this.location);

        if(therapist != null){
            therapist.getInfo();
        }

        if(massageRoom != null){
            massageRoom.getInfo();
        }

        if(sauna != null){
            sauna.getInfo();
        }

        if(facialTreatment != null){
            facialTreatment.getInfo();
        }

        if(reception != null){
            reception.getInfo();
        }
    }
}