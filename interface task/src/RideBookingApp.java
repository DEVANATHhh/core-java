public interface RideBookingApp {
    int MAX_DISTANCE = 100, SURGE_LIMIT = 5, VERSION = 10;

    void bookRide();
    void cancelRide();

    default void trackRide() {
        System.out.println("Ride is being tracked");
    }

    default void estimateFare() {
        System.out.println("Fare estimated");
    }

    static void info() {
        System.out.println("Ride Booking Interface");
    }
}
