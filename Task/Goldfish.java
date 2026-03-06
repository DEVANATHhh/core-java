class Goldfish {

    int age;
    String color;

    Goldfish(int age, String color){
        this.age = age;
        this.color = color;
    }

    void getInfo(){
        System.out.println("Age: " + this.age + ", Color: " + this.color);
    }
}