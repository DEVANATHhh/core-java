class BuildingRunner {
    public static void main(String[] args) {

        House h1 = new House();
        System.out.println(h1.type);
        System.out.println(h1.size);
        System.out.println(h1.material);

        House h2 = new House("Villa", "Big", "Wood");
        System.out.println(h2.type);
        System.out.println(h2.size);
        System.out.println(h2.material);

        House h3 = new House("Office");
        System.out.println(h3.type);
        System.out.println(h3.size);
        System.out.println(h3.material);
    }
}