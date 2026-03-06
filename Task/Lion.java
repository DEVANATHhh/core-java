class Lion {

    String name;
    int age;
    double weight;
    boolean wild;
    String color;

    Samosa samosa;
    Mobile mobile;
    Car car;
    Laptop laptop;
    Book book;

    Lion(String name, int age, double weight, boolean wild, String color,
         Samosa samosa, Mobile mobile, Car car, Book book, Laptop laptop){

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.wild = wild;
        this.color = color;

        this.samosa = samosa;
        this.mobile = mobile;
        this.car = car;
        this.book = book;
        this.laptop = laptop;
    }

    void getInfo() {

        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Weight: " + this.weight);
        System.out.println("Wild: " + this.wild);
        System.out.println("Color: " + this.color);

        if(samosa != null){
            samosa.getInfo();
        }

        if(mobile != null){
            mobile.getInfo();
        }

        if(car != null){
            car.getInfo();
        }

        if(laptop != null){
            laptop.getInfo();
        }

        if(book != null){
            book.getInfo();
        }
    }
}