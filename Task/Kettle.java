class Kettle {

    int capacity;
    String material;

    Kettle(int capacity, String material){
        this.capacity = capacity;
        this.material = material;
    }

    void getInfo(){
        System.out.println("Capacity: " + this.capacity + ", Material: " + this.material);
    }
}