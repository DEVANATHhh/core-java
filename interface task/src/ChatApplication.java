public interface ChatApplication {

    int MESSAGE_LIMIT = 1000, GROUP_SIZE = 50, VERSION = 5;

    void sendMessage();
    void receiveMessage();

    default void deleteMessage() {
        System.out.println("Message deleted");
    }

    default void muteChat() {
        System.out.println("Chat muted");
    }

    static void info() {
        System.out.println("Chat Application Interface");
    }
}
