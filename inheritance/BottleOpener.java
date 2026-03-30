class BottleOpener extends Opener {
    String type;
    int size;
    boolean portable;
    String color;
    int weight;

    void displayDetails() {
        System.out.println(type+" "+size+" "+portable+" "+color+" "+weight);
    }
}