public class Suitcase {

    static String brand(String owner) {
        System.out.println(owner + " checked the brand of the suitcase.");
        return "Skybags";
    }

    static int capacity(int extraLuggage) {
        System.out.println("The suitcase capacity is increased by " + extraLuggage);
        return 30 ;
    }

    static boolean hasWheels(String location) {
        System.out.println("Checking if the suitcase has wheels for " + location + " travel.");
        return true;
    }

    static double price(String currency) {
        System.out.println("The suitcase price in " + currency );
        return 2999.99;
    }

    static String color(String preference) {
        System.out.println("The suitcase color  " + preference );
        return "Black";
    }
}
