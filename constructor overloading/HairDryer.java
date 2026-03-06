class HairDryer {

    String brand;
    int power;
    String color;
    boolean isOn;
    double price;

    HairDryer() { }

    HairDryer(String brand, int power, String color, boolean isOn, double price) {
        this.brand = brand;
        this.power = power;
        this.color = color;
        this.isOn = isOn;
        this.price = price;
    }

    HairDryer(String brand, int power, String color, boolean isOn) {
        this.brand = brand;
        this.power = power;
        this.color = color;
        this.isOn = isOn;
    }

    HairDryer(String brand, int power, String color) {
        this.brand = brand;
        this.power = power;
        this.color = color;
    }

    HairDryer(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    HairDryer(String brand) {
        this.brand = brand;
    }
}