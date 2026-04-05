class ButterRunner {
    public static void main(String[] args) {

        ButterProduct b1 = new ButterProduct();
        System.out.println(b1.brand);
        System.out.println(b1.type);
        System.out.println(b1.quantity);

        ButterProduct b2 = new ButterProduct("Amul", "Salted", "500g");
        System.out.println(b2.brand);
        System.out.println(b2.type);
        System.out.println(b2.quantity);

        ButterProduct b3 = new ButterProduct("Nandini");
        System.out.println(b3.brand);
        System.out.println(b3.type);
        System.out.println(b3.quantity);
    }
}