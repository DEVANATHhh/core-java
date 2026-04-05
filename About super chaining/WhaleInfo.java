class WhaleInfo extends BlueWhale {

    WhaleInfo() {
        super("Ocean", "Huge", "Krill");
        System.out.println("---------------------------------");
        System.out.println("implicit values");
    }

    WhaleInfo(String habitat, String size, String diet) {
        super(habitat, size, diet);
        System.out.println("---------------------------------");
        System.out.println("explicit values");
    }

    WhaleInfo(String habitat) {
        super("Deep Ocean", "Very Large", "Small Fish");
        System.out.println("---------------------------------");
        System.out.println("explicit + implicit values");
    }
}