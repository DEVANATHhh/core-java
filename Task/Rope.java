class Rope {

    int length;
    String material;

    Rope(int length, String material){
        this.length = length;
        this.material = material;
    }

    void getInfo(){
        System.out.println("Length: " + this.length + ", Material: " + this.material);
    }
}