public interface EmailService {
    int STORAGE = 15, ATTACHMENT_LIMIT = 25, VERSION = 2;

    void sendEmail();
    void receiveEmail();

    default void archive() {
        System.out.println("Email archived");
    }

    default void spamFilter() {
        System.out.println("Spam filtering active");
    }

    static void info() {
        System.out.println("Email Service Interface");
    }
}
