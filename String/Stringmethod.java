public class Stringmethod {
    public static void main(String[] args) {

        // INSTANCE METHODS
        System.out.println("\n=== INSTANCE METHODS ===");

        String str = "  Hello India  ";
        String str2 = "hello india";

        System.out.println("Original: '" + str + "'");

        System.out.println("toLowerCase(): " + str.toLowerCase());
        System.out.println("toUpperCase(): " + str.toUpperCase());

        System.out.println("length(): " + str.length());
        System.out.println("trim(): '" + str.trim() + "'");

        System.out.println("charAt(2): " + str.charAt(2));
        System.out.println("substring(2, 7): " + str.substring(2, 7));

        System.out.println("equals(): " + str.equals(str2));
        System.out.println("equalsIgnoreCase(): " + str.trim().equalsIgnoreCase(str2));
        System.out.println("compareTo(): " + str.compareTo(str2));

        System.out.println("contains(\"India\"): " + str.contains("India"));
        System.out.println("startsWith(\"  He\"): " + str.startsWith("  He"));
        System.out.println("endsWith(\"  \"): " + str.endsWith("  "));

        System.out.println("indexOf('o'): " + str.indexOf('o'));
        System.out.println("lastIndexOf('o'): " + str.lastIndexOf('o'));

        System.out.println("replace(): " + str.replace("India", "World"));

        String sentence = "Java is easy";
        String[] words = sentence.split(" ");
        System.out.println("split():");
        for (String w : words) {
            System.out.println(w);
        }

        String empty = "";
        System.out.println("isEmpty(): " + empty.isEmpty());
        System.out.println("isBlank(): " + "   ".isBlank());



        // STATIC METHODS
        System.out.println("=== STATIC METHODS ===");

        String num = String.valueOf(100);
        System.out.println("valueOf(): " + num);

        String joined = String.join("-", "J", "A", "V", "A");
        System.out.println("join(): " + joined);

        String formatted = String.format("Name: %s, Age: %d", "John", 25);
        System.out.println("format(): " + formatted);








    }
}
