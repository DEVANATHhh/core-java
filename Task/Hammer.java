class Hammer {

    int weight;
    String material;

    Hammer(int weight, String material){
        this.weight = weight;
        this.material = material;
    }

    void getInfo(){
        System.out.println("Weight: " + this.weight + ", Material: " + this.material);
    }
}