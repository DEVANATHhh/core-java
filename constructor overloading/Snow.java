class Snow {

    double thickness;
    String color;
    double temperature;
    boolean isMelting;
    String region;

    Snow() { }

    Snow(double thickness, String color, double temperature, boolean isMelting, String region) {
        this.thickness = thickness;
        this.color = color;
        this.temperature = temperature;
        this.isMelting = isMelting;
        this.region = region;
    }

    Snow(double thickness, String color, double temperature, boolean isMelting) {
        this.thickness = thickness;
        this.color = color;
        this.temperature = temperature;
        this.isMelting = isMelting;
    }

    Snow(double thickness, String color, double temperature) {
        this.thickness = thickness;
        this.color = color;
        this.temperature = temperature;
    }

    Snow(double thickness, String color) {
        this.thickness = thickness;
        this.color = color;
    }

    Snow(double thickness) {
        this.thickness = thickness;
    }
}