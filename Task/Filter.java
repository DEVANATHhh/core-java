class Filter {

    String brand;
    int power;

    Filter(String brand, int power){
        this.brand = brand;
        this.power = power;
    }

    void getInfo(){
        System.out.println("Brand: " + this.brand + ", Power: " + this.power);
    }
}