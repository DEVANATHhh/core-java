class Laptop {

    String name;
    String processor;

    Laptop(String name, String processor){
        this.name = name;
        this.processor = processor;
    }

    void getInfo(){
        System.out.println("Laptop Name: " + this.name + ", Processor: " + this.processor);
    }
}