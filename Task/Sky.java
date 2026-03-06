class Sky {

    String color;
    int visibility;

    Sky(String color, int visibility){
        this.color = color;
        this.visibility = visibility;
    }

    void getInfo(){
        System.out.println("Color: " + this.color + ", Visibility: " + this.visibility);
    }
}