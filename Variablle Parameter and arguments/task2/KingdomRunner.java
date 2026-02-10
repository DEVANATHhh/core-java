public class KingdomRunner {

    public static void main(String[] args) {

        
        Kingdom.save(true, "Alexander", "Macedonia", "Roxana", "Cleopatra", 2000000, "Balkans", 356, 323, 50000, 13);
        Kingdom.save(true, "Ashoka", "Maurya", "Dharma", "Charumati", 3000000, "India", 304, 232, 60000, 40);
        Kingdom.save(false, "Caesar", "Rome", "Calpurnia", "Julia", 1000000, "Italy", 100, 44, 40000, 20);

        
        Kingdom.saveArmy(50000, 100, 2000, "Infantry", 10000, "Commander1", true, "Wife1", true, "Child1", 15);
        Kingdom.saveArmy(60000, 150, 2500, "Cavalry", 12000, "Commander2", true, "Wife2", false, "Child2", 20);
        Kingdom.saveArmy(40000, 80, 1800, "Archers", 8000, "Commander3", false, "", true, "Child3", 10);
    }
}
