 class DoWhileConditions {
    public static void main(String[] args) {

      

       
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


        int c = 0;
        do {
            System.out.println(++c);   
        } while (c < 5);


        int d = 0;
        do {
            System.out.println(d++);   
        } while (d < 5);


        int e = 1;
        do {
            System.out.println(e);
            e  ++;      
        } while (e < 20);



        
        int f = 5;
        do {
            System.out.println(f);
            f--;          // -1
        } while (f > 0);


       
        int g = 10;
        do {
            System.out.println(g);
            g -= 2;      
        } while (g > 0);


        int h = 5;
        do {
            System.out.println(--h);   
        } while (h > 0);


        int i = 5;
        do {
            System.out.println(i--);  
        } while (i > 0);


        int j = 64;
        do {
            System.out.println(j);
            j /= 2;       
        } while (j > 1);

    }
}
