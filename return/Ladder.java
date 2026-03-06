public class Ladder {

    static String material(String usage) { 
        System.out.println("The ladder material is chosen for " + usage + " use.");
        return "Aluminium";
    }

    static int steps(int extraSteps) { 
        System.out.println("Calculating total steps including " + extraSteps + " extra steps.");
        return 10 ;
    }

    static double height(double addedHeight) { 
        System.out.println("Calculating ladder height with added height of " + addedHeight + " meters.");
        return 12.5 + addedHeight;
    }

    static boolean foldable(String purpose) { 
        System.out.println("Checking if the ladder is foldable for " + purpose + ".");
        return true;
    }

    static double weight(double addedWeight) { 
        System.out.println("Calculating ladder weight with additional weight of " + addedWeight + " kg.");
        return 8.5 ;
    }
}
