class ModernWar extends War {
    String technology;
    int troops;
    boolean drones;
    String strategy;
    String weapons;

    void displayDetails() {
        System.out.println(technology+" "+troops+" "+drones+" "+strategy+" "+weapons);
    }
}