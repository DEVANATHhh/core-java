public class Crown {

    static String material(String occasion) { 
        System.out.println("The crown material is chosen for " + occasion + ".");
        return "Gold";
    }

    static int weight(int extraGems) { 
        System.out.println("The crown weight increases by " + extraGems + " grams due to extra gems.");
        return 1500 + extraGems;
    }

    static boolean hasGems(String gemType) {
        System.out.println("Checking if the crown has " + gemType + " gems.");
        return true;
    }

    static double price(String currency) {
        System.out.println("The crown price is calculated in " + currency + ".");
        return 50000;
    }

    static String country(String historicalEra) { 
        System.out.println("The crown is from UK, used in " + historicalEra + " era.");
        return "UK";
    }
}
