class Clock {

    String brand;
    int diameter;

    Clock(String brand, int diameter){
        this.brand = brand;
        this.diameter = diameter;
    }

    void getInfo(){
        System.out.println("Brand: " + this.brand + ", Diameter: " + this.diameter);
    }
}