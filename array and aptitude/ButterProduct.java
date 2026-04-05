class ButterProduct extends Butter {

    ButterProduct() {
        super("Amul", "Salted", "500g");
        System.out.println("---------------------------------");
        System.out.println("implicit values");
    }

    ButterProduct(String brand, String type, String quantity) {
        super(brand, type, quantity);
        System.out.println("---------------------------------");
        System.out.println("explicit values");
    }

    ButterProduct(String brand) {
        super("Nandini", "Unsalted", "1kg");
        System.out.println("---------------------------------");
        System.out.println("explicit + implicit values");
    }
}