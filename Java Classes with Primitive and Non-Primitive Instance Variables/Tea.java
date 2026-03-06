class Tea {

    String brand;
    int quantity;
    double price;
    boolean organic;
    String flavor;

    TeaLeaf teaLeaf;
    Teapot teapot;
    Cup cup;
    Kettle kettle;
    Sugar sugar;

    Tea(String brand, int quantity, double price, boolean organic, String flavor,
        TeaLeaf teaLeaf, Teapot teapot, Cup cup, Kettle kettle, Sugar sugar) {

        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
        this.organic = organic;
        this.flavor = flavor;

        this.teaLeaf = teaLeaf;
        this.teapot = teapot;
        this.cup = cup;
        this.kettle = kettle;
        this.sugar = sugar;
    }

    void getinfo() {

        System.out.println("Brand: " + this.brand);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Price: " + this.price);
        System.out.println("Organic: " + this.organic);
        System.out.println("Flavor: " + this.flavor);

        System.out.println("TeaLeaf: " + this.teaLeaf);
        System.out.println("Teapot: " + this.teapot);
        System.out.println("Cup: " + this.cup);
        System.out.println("Kettle: " + this.kettle);
        System.out.println("Sugar: " + this.sugar);
    }
}