 class  Payment{

    
   static void pay(String paymentMethod) {
        System.out.println("payment method is "+paymentMethod);
    }

    
   static void pay(String paymentMethod, int amount) {
        System.out.println("payment method is "+paymentMethod+" amount is "+amount);
    }

    
    static void pay(int amount, String paymentMode) {
        System.out.println("amount paid is:" + amount + " using " + paymentMode);
    }
}
