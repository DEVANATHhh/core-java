public class Tablet {

    static String brand(String owner) { 
        System.out.println(owner + " chose the tablet brand.");
        return "Samsung";
    }

    static int storage(int extraStorage) { 
        System.out.println("Calculating total storage with extra " + extraStorage + " GB.");
        return 128 ;
    }

    static double screenSize(double addedSize) {
        System.out.println("Calculating screen size with added " + addedSize + " inches.");
        return 10.5 ;
    }

    static boolean supportsWifi(String networkType) {
        System.out.println("Checking if tablet supports " + networkType + " Wi-Fi.");
        return true;
    }

    static double price(String currency) {
        System.out.println("The tablet price is displayed in " + currency + ".");
        return 25000;
    }
}
