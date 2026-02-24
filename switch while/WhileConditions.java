 class WhileConditions {
    public static void main(String[] args) {

    

       
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

       
        int c = 0;
        while (c < 5) {
            System.out.println(c);   
        c++;
		}

       
        int d = 0;
        while (d < 5) {
            System.out.println(d++);   
        }

        
        int e = 1;
        while (e < 20) {
            System.out.println(e);
            e ++;   
        }


        

        System.out.println("\nDecrement by 1:");
        int f = 5;
        while (f > 0) {
            System.out.println(f);
            f--;  
        }

        System.out.println("\nDecrement by 2:");
        int g = 10;
        while (g > 0) {
            System.out.println(g);
            g -= 2;   
        }

        
        int h = 5;
        while (h > 0) {
            System.out.println(--h);   
        }

   
        int i = 5;
        while (i > 0) {
            System.out.println(i--);  
        }

  
        int j = 64;
        while (j > 1) {
            System.out.println(j);
            j --;   
        }
    }
}
