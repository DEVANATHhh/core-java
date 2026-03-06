class Pawn {

    String color;
    String material;
    double height;
    double weight;
    boolean isCaptured;

    Pawn() { }

    Pawn(String color, String material, double height, double weight, boolean isCaptured) {
        this.color = color;
        this.material = material;
        this.height = height;
        this.weight = weight;
        this.isCaptured = isCaptured;
    }

    Pawn(String color, String material, double height, double weight) {
        this.color = color;
        this.material = material;
        this.height = height;
        this.weight = weight;
    }

    Pawn(String color, String material, double height) {
        this.color = color;
        this.material = material;
        this.height = height;
    }

    Pawn(String color, String material) {
        this.color = color;
        this.material = material;
    }

    Pawn(String color) {
        this.color = color;
    }
}