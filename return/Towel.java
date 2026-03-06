public class Towel {

    static String fabric(String season) { 
        System.out.println("Choosing towel fabric for " + season + " season.");
        return "Cotton";
    }

    static String size(String purpose) {
        System.out.println("Selecting towel size for " + purpose + ".");
        return "Large";
    }

    static boolean absorbent(String testType) { 
        System.out.println("Checking absorbency of towel using " + testType + " test.");
        return true;
    }

    static double price(String currency) {
        System.out.println("The towel price is calculated in " + currency + ".");
        return 499.99;
    }

    static String color(String preference) {
        System.out.println("Choosing towel color based on " + preference + " preference.");
        return "White";
    }
}
