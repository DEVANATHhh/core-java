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

    void getInfo() {

        System.out.println("Material: " + this.material);
        System.out.println("Size: " + this.size);
        System.out.println("Price: " + this.price);
        System.out.println("Electric: " + this.electric);
        System.out.println("Color: " + this.color);

        if(tower != null){
            tower.getInfo();
        }

        if(rope != null){
            rope.getInfo();
        }

        if(hammer != null){
            hammer.getInfo();
        }

        if(clock != null){
            clock.getInfo();
        }

        if(alarm != null){
            alarm.getInfo();
        }
    }
}