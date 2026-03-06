class Thunder {

    int soundLevel;
    int duration;

    Thunder(int soundLevel, int duration){
        this.soundLevel = soundLevel;
        this.duration = duration;
    }

    void getInfo(){
        System.out.println("Sound Level: " + this.soundLevel + ", Duration: " + this.duration);
    }
}