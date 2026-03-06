class TextFile {

    String language;
    int lines;

    TextFile(String language, int lines){
        this.language = language;
        this.lines = lines;
    }

    void getInfo(){
        System.out.println("The language of the text file is : " + this.language + " The number of lines : " + this.lines);
    }
}