public interface SocialMediaPlatform {
    int POST_LIMIT = 20, FOLLOW_LIMIT = 5000, VERSION = 7;

    void createPost();
    void deletePost();

    default void likePost() {
        System.out.println("Post liked");
    }

    default void comment() {
        System.out.println("Comment added");
    }

    static void info() {
        System.out.println("Social Media Interface");
    }
}
