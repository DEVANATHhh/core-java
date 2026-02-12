public class Bench {

    static String material(String purpose) {
        System.out.println("The bench material is selected for " + purpose + " use.");
        return "Wood";
    }

    static int seatingCapacity(int extraSeats) {
        System.out.println("Calculating seating capacity including " + extraSeats + " extra seats.");
        return 3 ;
    }

    static double length(double extension) {
        System.out.println("The bench length with extension is " + extension + " meters longer.");
        return 5.5 ;
    }

    static boolean outdoorUse(String weatherCondition) {
        System.out.println("Checking if the bench can be used outdoors in " + weatherCondition + ".");
        return true;
    }

    static String color(String preference) {
        System.out.println("The bench color chosen based on " + preference + " preference.");
        return "Brown";
    }
}
