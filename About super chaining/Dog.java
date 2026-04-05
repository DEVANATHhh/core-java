class Dog extends GermanShepherd {

    Dog() {
        super("Working", "Black & Tan", "Security");
        System.out.println("---------------------------------");
        System.out.println("implicit values");
    }

    Dog(String breedType, String color, String purpose) {
        super(breedType, color, purpose);
        System.out.println("---------------------------------");
        System.out.println("explicit values");
    }

    Dog(String breedType) {
        super("Police", "Brown", "Tracking");
        System.out.println("---------------------------------");
        System.out.println("explicit + implicit values");
    }
}