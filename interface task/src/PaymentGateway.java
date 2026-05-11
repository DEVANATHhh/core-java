public interface PaymentGateway {
    int LIMIT = 10000, TAX = 18, VERSION = 6;

    void pay();
    void refund();

    default void transactionHistory() {
        System.out.println("Showing transaction history");
    }

    default void verifyPayment() {
        System.out.println("Payment verified");
    }

    static void info() {
        System.out.println("Payment Gateway Interface");
    }
}
