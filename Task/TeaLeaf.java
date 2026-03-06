class TeaLeaf {

    String origin;
    int quantity;

    TeaLeaf(String origin, int quantity){
        this.origin = origin;
        this.quantity = quantity;
    }

    void getInfo(){
        System.out.println("Origin: " + this.origin + ", Quantity: " + this.quantity);
    }
}