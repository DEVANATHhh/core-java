public class UsingConstructor {

    String accountHolder;
    double balance;

    public UsingConstructor() {
        accountHolder = "Amit";
        balance = 5000.0;
    }

    public void display() {
        System.out.println("Account -> " + accountHolder + ", Balance: " + balance);
    }
}