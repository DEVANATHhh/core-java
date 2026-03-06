class FanMotor {

    int speed;
    String type;

    FanMotor(int speed, String type){
        this.speed = speed;
        this.type = type;
    }

    void getInfo(){
        System.out.println("Speed: " + this.speed + ", Type: " + this.type);
    }
}