public class Grenade {

    static String type(String usage) {
        System.out.println("Checking grenade type for " + usage + " use.");
        return "Fragmentation";
    }

    static double weight(double addedWeight) {
        System.out.println("Calculating grenade weight with additional " + addedWeight + " kg.");
        return 0.4 ;
    }

    static boolean explosive(String testCondition) {
        System.out.println("Checking if grenade is explosive under " + testCondition + " condition.");
        return true;
    }

    static double radius(double safetyMargin) {
        System.out.println("Calculating blast radius with safety margin of " + safetyMargin + " meters.");
        return 15 ;
    }

    static String origin(String purpose) {
        System.out.println("Grenade origin checked for " + purpose + " purposes.");
        return "India";
    }
}
