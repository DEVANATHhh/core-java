class SpecialSoldier extends Soldier {
    String weapon;
    String mission;
    int exp;
    boolean nightVision;
    String unit;

    void displayDetails() {
        System.out.println(weapon+" "+mission+" "+exp+" "+nightVision+" "+unit);
    }
}