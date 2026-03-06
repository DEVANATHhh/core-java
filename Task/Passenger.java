class Passenger {

    String name;
    int age;

    Passenger(String name, int age){
        this.name = name;
        this.age = age;
    }

    void getInfo(){
        System.out.println("Passenger Name: " + this.name + ", Age: " + this.age);
    }
}