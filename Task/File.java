class File {

    String name;
    int size;
    double version;
    boolean hidden;
    String type;

    DocumentFile documentFile;
    ImageFile imageFile;
    AudioFile audioFile;
    VideoFile videoFile;
    TextFile textFile;

    File(String name, int size, double version, boolean hidden, String type,
         DocumentFile documentFile, ImageFile imageFile, AudioFile audioFile,
         VideoFile videoFile, TextFile textFile) {

        this.name = name;
        this.size = size;
        this.version = version;
        this.hidden = hidden;
        this.type = type;

        this.documentFile = documentFile;
        this.imageFile = imageFile;
        this.audioFile = audioFile;
        this.videoFile = videoFile;
        this.textFile = textFile;
    }

    void getInfo() {

        System.out.println("Name: " + this.name);
        System.out.println("Size: " + this.size);
        System.out.println("Version: " + this.version);
        System.out.println("Hidden: " + this.hidden);
        System.out.println("Type: " + this.type);

        if(documentFile != null){
            documentFile.getInfo();
        }

        if(imageFile != null){
            imageFile.getInfo();
        }

        if(audioFile != null){
            audioFile.getInfo();
        }

        if(videoFile != null){
            videoFile.getInfo();
        }

        if(textFile != null){
            textFile.getInfo();
        }
    }
}