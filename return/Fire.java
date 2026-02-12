public class Fire {

    static String color(String situation) {
        System.out.println("The fire color is  " + situation + ".");
        return "Orange";
    }

    static double temperature(double ambientTemp) {
        System.out.println("Measuring fire temperature  " + ambientTemp + "°C.");
        return 800.5;
    }

    static boolean isHot(String intensityLevel) {
        System.out.println("Checking if the fire is hot at intensity: " + intensityLevel + ".");
        return true;
    }

    static String fuelType(String fuelSource) {
        System.out.println("The fire is fueled by " + fuelSource + ".");
        return "Wood";
    }

    static String state(String condition) {
        System.out.println("The fire is in " + condition + " condition.");
        return "Plasma";
    }
}
