class ChickenRunner {
    public static void main(String[] args) {

        ChickenDish c1 = new ChickenDish();
        System.out.println(c1.type);
        System.out.println(c1.taste);
        System.out.println(c1.cookingStyle);

        ChickenDish c2 = new ChickenDish("Broiler", "Spicy", "Grilled");
        System.out.println(c2.type);
        System.out.println(c2.taste);
        System.out.println(c2.cookingStyle);

        ChickenDish c3 = new ChickenDish("Country");
        System.out.println(c3.type);
        System.out.println(c3.taste);
        System.out.println(c3.cookingStyle);
    }
}