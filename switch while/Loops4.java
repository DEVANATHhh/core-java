class Loops4 {

    public static void main(String[] args) {

        int age = 20;

        if (age >= 18) {
            System.out.println("Eligible for driving test");
        }

        boolean helmet = false;

        if (helmet) {
            System.out.println("Safety followed");
        } else {
            System.out.println("Wear helmet");
        }

        int score = 80;

        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 70) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }

        boolean license = true;

        if (age >= 18) {
            if (license) {
                System.out.println("Can drive legally");
            }
        }

        int signal = 3;

        switch (signal) {
            case 1: System.out.println("Red - Stop"); break;
            case 2: System.out.println("Yellow - Wait"); break;
            case 3: System.out.println("Green - Go"); break;
            default: System.out.println("Invalid signal");
        }

        for (int k = 1; k <= 3; k++) {
            System.out.println("Practice round " + k);
        }

        int x = 0;
        while (x < 3) {
            System.out.println("Checking vehicle " + x);
            x++;
        }

        int y = 0;
        do {
            System.out.println("Test lap " + y);
            y++;
        } while (y < 3);
    }
}