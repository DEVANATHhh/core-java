public interface CloudStorage {
    int SPACE = 1000, FILE_LIMIT = 500, VERSION = 3;

    void uploadFile();
    void downloadFile();

    default void sync() {
        System.out.println("Files synced");
    }

    default void backup() {
        System.out.println("Backup completed");
    }

    static void info() {
        System.out.println("Cloud Storage Interface");
    }
}
