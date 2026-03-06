class Alarm {

    String sound;
    int duration;

    Alarm(String sound, int duration){
        this.sound = sound;
        this.duration = duration;
    }

    void getInfo(){
        System.out.println("Sound: " + this.sound + ", Duration: " + this.duration);
    }
}