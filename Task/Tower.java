class Tower {

    int height;
    String material;

    Tower(int height, String material){
        this.height = height;
        this.material = material;
    }

    void getInfo(){
        System.out.println("Height: " + this.height + ", Material: " + this.material);
    }
}