class WaterPlant {

    String name;
    int height;

    WaterPlant(String name, int height){
        this.name = name;
        this.height = height;
    }

    void getInfo(){
        System.out.println("Plant Name: " + this.name + ", Height: " + this.height);
    }
}