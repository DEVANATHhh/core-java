class Book {

    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    void getInfo(){
        System.out.println("Title: " + this.title + ", Author: " + this.author);
    }
}