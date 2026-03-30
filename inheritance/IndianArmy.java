class IndianArmy extends Army {
    String regiment;
    String weapon;
    int missions;
    boolean borderDuty;
    String base;

    void displayDetails() {
        System.out.println(regiment+" "+weapon+" "+missions+" "+borderDuty+" "+base);
    }
}