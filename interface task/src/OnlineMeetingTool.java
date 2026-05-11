public interface OnlineMeetingTool {
    int MAX_USERS = 100, TIME_LIMIT = 60, VERSION = 1;

    void startMeeting();

    void endMeeting();

    default void screenShare() {
        System.out.println("Screen sharing enabled");
    }

    default void chat() {
        System.out.println("Chat feature enabled");
    }

    static void info() {
        System.out.println("Online Meeting Tool Interface");
    }
}