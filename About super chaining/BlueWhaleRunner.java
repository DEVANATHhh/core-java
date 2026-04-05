class BlueWhaleRunner {
    public static void main(String[] args) {

        WhaleInfo w1 = new WhaleInfo();
        System.out.println(w1.habitat);
        System.out.println(w1.size);
        System.out.println(w1.diet);

        WhaleInfo w2 = new WhaleInfo("Ocean", "Huge", "Krill");
        System.out.println(w2.habitat);
        System.out.println(w2.size);
        System.out.println(w2.diet);

        WhaleInfo w3 = new WhaleInfo("Deep Sea");
        System.out.println(w3.habitat);
        System.out.println(w3.size);
        System.out.println(w3.diet);
    }
}