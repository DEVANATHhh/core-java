public class UsingClone implements Cloneable {

    String name = "Rahul";

    public void display() {
        System.out.println("Student -> " + name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}