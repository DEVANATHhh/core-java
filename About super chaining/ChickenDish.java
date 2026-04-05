class ChickenDish extends Chicken {

    ChickenDish() {
        super("Broiler", "Spicy", "Fried");
        System.out.println("---------------------------------");
        System.out.println("implicit values");
    }

    ChickenDish(String type, String taste, String cookingStyle) {
        super(type, taste, cookingStyle);
        System.out.println("---------------------------------");
        System.out.println("explicit values");
    }

    ChickenDish(String type) {
        super("Country", "Medium", "Grilled");
        System.out.println("---------------------------------");
        System.out.println("explicit + implicit values");
    }
}