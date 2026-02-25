class Strawberry {

    String color;
    double weight;
    boolean isRipe;
    String taste;
    String origin;

    Strawberry() {
		}

    Strawberry(String color, double weight, boolean isRipe, String taste, String origin) {
        this.color = color;
        this.weight = weight;
        this.isRipe = isRipe;
        this.taste = taste;
        this.origin = origin;
    }

    Strawberry(String color, double weight, boolean isRipe, String taste) {
        this.color = color;
        this.weight = weight;
        this.isRipe = isRipe;
        this.taste = taste;
    }

    Strawberry(String color, double weight, boolean isRipe) {
        this.color = color;
        this.weight = weight;
        this.isRipe = isRipe;
    }

    Strawberry(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    Strawberry(String color) {
        this.color = color;
    }
}