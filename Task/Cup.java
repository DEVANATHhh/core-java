class Cup {

    String color;
    int volume;

    Cup(String color, int volume){
        this.color = color;
        this.volume = volume;
    }

    void getInfo(){
        System.out.println("Color: " + this.color + ", Volume: " + this.volume);
    }
}