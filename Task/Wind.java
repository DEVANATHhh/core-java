class Wind {

    int speed;
    String direction;

    Wind(int speed, String direction){
        this.speed = speed;
        this.direction = direction;
    }

    void getInfo(){
        System.out.println("Speed: " + this.speed + ", Direction: " + this.direction);
    }
}