class Bell {

    String material;
    int size;
    double price;
    boolean electric;
    String color;

    Tower tower;
    Rope rope;
    Hammer hammer;
    Clock clock;
    Alarm alarm;

    Bell(String material, int size, double price, boolean electric, String color,
         Tower tower, Rope rope, Hammer hammer, Clock clock, Alarm alarm) {

        this.material = material;
        this.size = size;
        this.price = price;
        this.electric = electric;
        this.color = color;

        this.tower = tower;
        this.rope = rope;
        this.hammer = hammer;
        this.clock = clock;
        this.alarm = alarm;
    }

    void getinfo() {

        System.out.println("Material: " + this.material);
        System.out.println("Size: " + this.size);
        System.out.println("Price: " + this.price);
        System.out.println("Electric: " + this.electric);
        System.out.println("Color: " + this.color);

        System.out.println("Tower: " + this.tower);
        System.out.println("Rope: " + this.rope);
        System.out.println("Hammer: " + this.hammer);
        System.out.println("Clock: " + this.clock);
        System.out.println("Alarm: " + this.alarm);
    }
}