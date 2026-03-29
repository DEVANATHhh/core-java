public class BitShiftOperation {
    public static void main(String[] args) {
        int number = 8;
		int num=-16;

        System.out.println("Original: " + number);
        System.out.println("Left shift << 2: " + (number << 2));   
        System.out.println("Right shift >> 2: " + (number >> 2));  
        System.out.println("Unsigned right >>> 2: " + (num >>> 2)); 
    }
}