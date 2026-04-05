class ShawarmaRunner {
    public static void main(String[] args) {

        ShawarmaShop s1 = new ShawarmaShop();
        System.out.println(s1.type);
        System.out.println(s1.size);
        System.out.println(s1.sauce);

        ShawarmaShop s2 = new ShawarmaShop("Chicken", "Large", "Spicy Mayo");
        System.out.println(s2.type);
        System.out.println(s2.size);
        System.out.println(s2.sauce);

        ShawarmaShop s3 = new ShawarmaShop("Veg");
        System.out.println(s3.type);
        System.out.println(s3.size);
        System.out.println(s3.sauce);
    }
}