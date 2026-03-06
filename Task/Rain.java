class Rain {

    int intensity;
    String type;

    Rain(int intensity, String type){
        this.intensity = intensity;
        this.type = type;
    }

    void getInfo(){
        System.out.println("Intensity: " + this.intensity + ", Type: " + this.type);
    }
}