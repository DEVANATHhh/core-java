class FacialTreatment {

    String type;
    int duration;

    FacialTreatment(String type, int duration){
        this.type = type;
        this.duration = duration;
    }

    void getInfo(){
        System.out.println("Type: " + this.type + ", Duration: " + this.duration);
    }
}