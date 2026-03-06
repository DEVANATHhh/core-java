class Stadium {

    String name;
    int capacity;

    Stadium(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }

    void getInfo(){
        System.out.println("Stadium Name: " + this.name + ", Capacity: " + this.capacity);
    }
}