class Samosa {

    String shape;
    String filling;

    Samosa(String shape, String filling){
        this.shape = shape;
        this.filling = filling;
    }

    void getInfo(){
        System.out.println("Shape: " + this.shape + ", Filling: " + this.filling);
    }
}