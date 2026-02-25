class Umbrella {

    String color;
    double radius;
    String material;
    boolean isOpen;
    double weight;

    Umbrella() { }

    Umbrella(String color, double radius, String material, boolean isOpen, double weight) {
        this.color = color;
        this.radius = radius;
        this.material = material;
        this.isOpen = isOpen;
        this.weight = weight;
    }

    Umbrella(String color, double radius, String material, boolean isOpen) {
        this.color = color;
        this.radius = radius;
        this.material = material;
        this.isOpen = isOpen;
    }

    Umbrella(String color, double radius, String material) {
        this.color = color;
        this.radius = radius;
        this.material = material;
    }

    Umbrella(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    Umbrella(String color) {
        this.color = color;
    }
}