class Car {

    String name;
    double speed;

    Car(String name, double speed){
        this.name = name;
        this.speed = speed;
    }

    void getInfo(){
        System.out.println("Car Name: " + this.name + ", Speed: " + this.speed);
    }
}