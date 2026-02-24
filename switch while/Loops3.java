class Loops3 {

    public static void main(String[] args) {

        int balance = 5000;

        if (balance > 1000) {
            System.out.println("Sufficient balance");
        }

        int age = 17;

        if (age >= 18) {
            System.out.println("Account can be created");
        } else {
            System.out.println("Not eligible for account");
        }

        int creditScore = 650;

        if (creditScore >= 750) {
            System.out.println("High credit score");
        } else if (creditScore >= 600) {
            System.out.println("Medium credit score");
        } else {
            System.out.println("Low credit score");
        }

        boolean documents = true;

        if (age >= 18) {
            if (documents) {
                System.out.println("Loan approved");
            }
        }

        int option = 1;

        switch (option) {
            case 1: System.out.println("Deposit"); break;
            case 2: System.out.println("Withdraw"); break;
            default: System.out.println("Invalid option");
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("Transaction " + i);
        }

        int i = 0;
        while (i < 2) {
            System.out.println("Processing...");
            i++;
        }

        int j = 0;
        do {
            System.out.println("Receipt printing...");
            j++;
        } while (j < 2);
    }
}