class Mobile {

    String brand;
    String model;

    Mobile(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    void getInfo(){
        System.out.println("Brand: " + this.brand + ", Model: " + this.model);
    }
}