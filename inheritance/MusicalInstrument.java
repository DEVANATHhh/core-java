class MusicalInstrument extends Instrument {
    String brand;
    int strings;
    boolean electric;
    String color;
    int weight;

    void displayDetails() {
        System.out.println(brand+" "+strings+" "+electric+" "+color+" "+weight);
    }
}