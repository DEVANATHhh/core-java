class Loops{

public static void main (String [] args){
	

        int number = 10;

      
        if (number > 0) {
            System.out.println("Number is positive");
        }

        
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        
        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

      
        int age = 20;
        boolean dlicense = true;

        if (age >= 18) {
            if (dlicense) {
                System.out.println("can apply for drivers licensee");
            }
        }

        
        
        byte b = 3;
        switch (b) {
            case 1 : System.out.println("byte: One");
			break;
            case 2 : System.out.println("byte: Two");
			break;
            case 3 : System.out.println("byte: Three");
			break;
            case 4 : System.out.println("byte: Four");
			break;
            case 5 : System.out.println("byte: Five");
			break;
            default : System.out.println("byte: Other");
        }
		

        
        for (int i = 1; i <= 3; i++) {
            System.out.println("For loop: " + i);
        }
		

        
        int a = 0;
        while (a < 5) {
            System.out.println(a);
            a++;   
        }

        
        int b = 0;
        while (b < 10) {
            System.out.println(b);
            b ++;   
        }

        
        int a = 0;
        do {
            System.out.println(a);
            a++;          
        } while (a < 5);


        int b = 0;
        do {
            System.out.println(b);
            b += 2;       
        } while (b < 10);

    }
}


