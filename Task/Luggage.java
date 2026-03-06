class Luggage {

    int bags;
    int weight;

    Luggage(int bags, int weight){
        this.bags = bags;
        this.weight = weight;
    }

    void getInfo(){
        System.out.println("Bags: " + this.bags + ", Weight: " + this.weight);
    }
}