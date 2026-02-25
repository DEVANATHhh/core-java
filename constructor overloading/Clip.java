class Clip {

    String material;
    String color;
    double length;
    boolean isMetal;
    double price;

    Clip() { }

    Clip(String material, String color, double length, boolean isMetal, double price) {
        this.material = material;
        this.color = color;
        this.length = length;
        this.isMetal = isMetal;
        this.price = price;
    }

    Clip(String material, String color, double length, boolean isMetal) {
        this.material = material;
        this.color = color;
        this.length = length;
        this.isMetal = isMetal;
    }

    Clip(String material, String color, double length) {
        this.material = material;
        this.color = color;
        this.length = length;
    }

    Clip(String material, String color) {
        this.material = material;
        this.color = color;
    }

    Clip(String material) {
        this.material = material;
    }
}