class ImageFile {

    String format;
    int resolution;

    ImageFile(String format, int resolution){
        this.format = format;
        this.resolution = resolution;
    }

    void getInfo(){
        System.out.println("The format of the image is : " + this.format + " The resolution is : " + this.resolution);
    }
}