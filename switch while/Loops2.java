class OnlineShopping {

    public static void main(String[] args) {

        int amount = 3000;

        if (amount > 2000) {
            System.out.println("Free Delivery Available");
        }

        boolean member = true;

        if (member) {
            System.out.println("Discount Applied");
        } else {
            System.out.println("No Discount");
        }

        int rating = 4;

        if (rating == 5) {
            System.out.println("Excellent Product");
        } else if (rating >= 3) {
            System.out.println("Good Product");
        } else {
            System.out.println("Low Rated Product");
        }

        boolean paymentSuccess = true;

        if (amount > 0) {
            if (paymentSuccess) {
                System.out.println("Order Confirmed");
            }
        }

        int option = 2;

        switch (option) {
            case 1: System.out.println("Cash on Delivery"); break;
            case 2: System.out.println("Online Payment"); break;
            default: System.out.println("Invalid Payment Method");
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("Processing item " + i);
        }

        int i = 0;
        while (i < 2) {
            System.out.println("Checking stock...");
            i++;
        }

        int j = 0;
        do {
            System.out.println("Generating Invoice...");
            j++;
        } while (j < 2);
    }
}