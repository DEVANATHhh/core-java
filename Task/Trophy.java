class Trophy {

    String material;
    int weight;

    Trophy(String material, int weight){
        this.material = material;
        this.weight = weight;
    }

    void getInfo(){
        System.out.println("Material: " + this.material + ", Weight: " + this.weight);
    }
}