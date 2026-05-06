public class Main {

    public static void main(String[] args) {

        // Using new keyword
        UsingNew method1 = new UsingNew();
        method1.display();

        // Using constructor
        UsingConstructor method2 = new UsingConstructor();
        method2.display();

        // Using reflection
        try {
            Class<?> c = Class.forName("UsingReflection");

            UsingReflection method3 =
                    (UsingReflection) c.getDeclaredConstructor().newInstance();

            method3.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Using clone
        try {
            UsingClone obj1 = new UsingClone();

            UsingClone obj2 = (UsingClone) obj1.clone();

            obj2.display();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}