 class PizzaHut {

    
    static void order(String item) {
        System.out.println("Ordered: " + item);
    }

    
    static void order(String item, int quantity) {
        System.out.println("Ordered: " + item + ", Quantity: " + quantity);
    }

    
	static void order(String item, int quantity, String addons) {
        System.out.println("Ordered: " + item +", Quantity: " + quantity +", Addons: " + addons);
    }
}
