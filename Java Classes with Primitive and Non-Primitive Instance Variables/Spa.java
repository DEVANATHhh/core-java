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

    void getinfo() {

        System.out.println("Name: " + this.name);
        System.out.println("Rooms: " + this.rooms);
        System.out.println("Price: " + this.price);
        System.out.println("Massage Available: " + this.massageAvailable);
        System.out.println("Location: " + this.location);

        System.out.println("Therapist: " + this.therapist);
        System.out.println("MassageRoom: " + this.massageRoom);
        System.out.println("Sauna: " + this.sauna);
        System.out.println("FacialTreatment: " + this.facialTreatment);
        System.out.println("Reception: " + this.reception);
    }
}