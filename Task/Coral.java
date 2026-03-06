class Coral {

    String type;
    int size;

    Coral(String type, int size){
        this.type = type;
        this.size = size;
    }

    void getInfo(){
        System.out.println("Type: " + this.type + ", Size: " + this.size);
    }
}