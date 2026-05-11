public interface MusicStreamingService {
    int SONG_LIMIT = 1000, PLAYLIST_LIMIT = 100, VERSION = 8;

    void playSong();
    void pauseSong();

    default void addToPlaylist() {
        System.out.println("Added to playlist");
    }

    default void shuffle() {
        System.out.println("Shuffle mode enabled");
    }

    static void info() {
        System.out.println("Music Streaming Interface");
    }
}
