class Therapist {

    String name;
    int experience;

    Therapist(String name, int experience){
        this.name = name;
        this.experience = experience;
    }

    void getInfo(){
        System.out.println("Therapist Name: " + this.name + ", Experience: " + this.experience);
    }
}