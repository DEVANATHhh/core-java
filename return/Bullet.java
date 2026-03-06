public class Bullet {

    static String type(String usage) { 
        System.out.println("The bullet type is  " + usage );
        return "9mm";
    }

    static double speed(double distance) { 
        System.out.println("The bullet speed is " + distance );
        return 380.5;
    }

    static double weight(double extraLoad) {
        System.out.println("The bullet weight is  " + extraLoad + " grams.");
        return 7.5 + extraLoad;
    }

    static boolean isMetal(String materialType) {
        System.out.println(" the bullet is made of " + materialType + ".");
        return true;
    }

    static String origin(String countryPurpose) {
        System.out.println("Origin of the bullet is " + countryPurpose + ".");
        return "USA";
    }
}
