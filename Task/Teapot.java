class Teapot {

    String material;
    int capacity;

    Teapot(String material, int capacity){
        this.material = material;
        this.capacity = capacity;
    }

    void getInfo(){
        System.out.println("Material: " + this.material + ", Capacity: " + this.capacity);
    }
}