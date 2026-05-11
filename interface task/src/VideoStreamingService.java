public interface VideoStreamingService {

    int RESOLUTION = 1080, BUFFER_SIZE = 10, VERSION = 4;

    void playVideo();
    void stopVideo();

    default void subtitles() {
        System.out.println("Subtitles enabled");
    }

    default void qualityAdjust() {
        System.out.println("Quality adjusted");
    }

    static void info() {
        System.out.println("Video Streaming Interface");
    }
}
