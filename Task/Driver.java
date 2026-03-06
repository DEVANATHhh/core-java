class Driver {

    String name;
    int experience;

    Driver(String name, int experience){
        this.name = name;
        this.experience = experience;
    }

    void getInfo(){
        System.out.println("Driver Name: " + this.name + ", Experience: " + this.experience);
    }
}