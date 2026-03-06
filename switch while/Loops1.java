class Loops1{

public static void main (String [] args){
	

        int year = 2003;

      
        if (year > 2000 && year<2025) {
            System.out.println("you belong to genz ");
        }



        int age =20;
        if (age >=18) {
            System.out.println("You cant create an account ");
        } else {
            System.out.println("enter your details");
        }

        
        int attendance = 85;

        if (attendance >= 90) {
            System.out.println("have attendance");
        } else if (attendance >= 75) {
            System.out.println("have averge attendance");
        } else if (attendance <75 && attendance>=50) {
            System.out.println("haev to pay 5000 fine");
        } else {
            System.out.println("Detention");
        }

      
       
        boolean dlicense = true;

        if (age >= 18) {
            if (dlicense) {
                System.out.println("can apply for drivers licensee");
            }
        }

        
        
        byte b = 3;
        switch (b) {
            case 1 : System.out.println("MOnday");
			break;
            case 2 : System.out.println("Tuesday");
			break;
            case 3 : System.out.println("Wednesday");
			break;
            case 4 : System.out.println("Thursday");
			break;
            case 5 : System.out.println("Friday");
			break;
            default : System.out.println("Holidays");
        }
		

        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Print first 10 digit: " + i);
        }
		

        
        int a = 0;
        while (a < 5) {
            System.out.println("Number of laps completed"+a);
            a++;   
        }

        
        
        while (b < 10) {
            System.out.println(b);
            b ++;   
        }

        
        
        do {
            System.out.println(a);
            a++;          
        } while (a < 10);


       
        do {
            System.out.println(b);
            b += 2;       
        } while (b < 10);

    }
}


