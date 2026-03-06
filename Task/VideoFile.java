class VideoFile {

    String quality;
    int length;

    VideoFile(String quality, int length){
        this.quality = quality;
        this.length = length;
    }

    void getInfo(){
        System.out.println("The quality of the video is : " + this.quality + " The length is : " + this.length);
    }
}