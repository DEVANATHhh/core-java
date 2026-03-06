class Gravel {

    String color;
    int weight;

    Gravel(String color, int weight){
        this.color = color;
        this.weight = weight;
    }

    void getInfo(){
        System.out.println("Color: " + this.color + ", Weight: " + this.weight);
    }
}