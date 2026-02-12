public class Water {

    static String state(String condition) {
        System.out.println("Water is in " + condition + " state.");
        return "Liquid";
    }

    static double boilingPoint(double altitude) {
        System.out.println("Measuring boiling point at altitude: " + altitude + " meters.");
        return 100.0;
    }

    static boolean isDrinkable(String source) {
        System.out.println("Checking if water from " + source + " is drinkable.");
        return true;
    }

    static String color(String lightCondition) {
        System.out.println("Water color observed under " + lightCondition + " light.");
        return "Colorless";
    }

    static double density(double temperature) {
        System.out.println("Calculating water density at " + temperature + "°C.");
        return 1.0;
    }
}
