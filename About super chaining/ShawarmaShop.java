class ShawarmaShop extends Shawarma {

    ShawarmaShop() {
        super("Chicken", "Regular", "Mayo");
        System.out.println("---------------------------------");
        System.out.println("implicit values");
    }

    ShawarmaShop(String type, String size, String sauce) {
        super(type, size, sauce);
        System.out.println("---------------------------------");
        System.out.println("explicit values");
    }

    ShawarmaShop(String type) {
        super("Veg", "Large", "Garlic");
        System.out.println("---------------------------------");
        System.out.println("explicit + implicit values");
    }
}