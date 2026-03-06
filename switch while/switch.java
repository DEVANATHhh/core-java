 //1. 5 switch cases --> 5 conditions --> 5 diff data type
// 2. while --> 10 times --> 5 increment --> 5 dec
// 3. do while --> 10 times --> 5 increment --> 5 dec

 class Switch {
   public static void main(String[] args) {
     
        int num = 2;
        switch (num) {
            case 1 : System.out.println("int: One");
            case 2 : System.out.println("int: Two");
            case 3 : System.out.println("int: Three");
            case 4 : System.out.println("int: Four");
            case 5 : System.out.println("int: Five");
           default: System.out.println("int: Not 1-5");
        }

     
        char ch = 'C';
        switch (ch) {
            case 'A': System.out.println("char: A");
            case 'B': System.out.println("char: B");
            case 'C': System.out.println("char: C");
            case 'D': System.out.println("char: D");
            case 'E': System.out.println("char: E");
            default: System.out.println("char: Other");
        }

   
        String fruit = "Apple";
        switch (fruit) {
            case "Apple" : System.out.println("String: Apple");
			break;
            case "Banana" : System.out.println("String: Banana");
			break;
            case "Mango" : System.out.println("String: Mango");
			break;
            case "Orange" : System.out.println("String: Orange");
			break;
            case "Grapes" : System.out.println("String: Grapes");
			break;
            default : System.out.println("String: Unknown");
			break;
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
		
	
        }
 }

