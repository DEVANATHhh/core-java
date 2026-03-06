class AudioFile {

    String artist;
    int duration;

    AudioFile(String artist, int duration){
        this.artist = artist;
        this.duration = duration;
    }

    void getInfo(){
        System.out.println("The artist of the audio is : " + this.artist + " The duration is : " + this.duration);
    }
}