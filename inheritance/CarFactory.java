class CarFactory extends Factory {
    String carBrand;
    int carsPerDay;
    boolean automation;
    String manager;
    String shift;

    void displayDetails() {
        System.out.println(carBrand+" "+carsPerDay+" "+automation+" "+manager+" "+shift);
    }
}