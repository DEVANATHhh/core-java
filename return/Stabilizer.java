public class Stabilizer {

    static int capacity(int extraDevices) {
        System.out.println("Calculating stabilizer capacity including " + extraDevices + " extra devices.");
        return 5 ;
    }

    static String brand(String owner) {
        System.out.println(owner + " checked the stabilizer brand.");
        return "V-Guard";
    }

    static double price(String currency) {
        System.out.println("The stabilizer price is displayed in " + currency + ".");
        return 3500;
    }

    static boolean automatic(String featureCheck) {
        System.out.println("Checking if the stabilizer is automatic for " + featureCheck + ".");
        return true;
    }

    static double voltageRange(double fluctuation) {
        System.out.println("Calculating voltage range including fluctuation of " + fluctuation + " volts.");
        return 220;
    }
}
