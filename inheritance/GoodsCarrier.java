class GoodsCarrier extends Carrier {
    String goods;
    int trucks;
    boolean refrigerated;
    String company;
    int distance;

    void displayDetails() {
        System.out.println(goods+" "+trucks+" "+refrigerated+" "+company+" "+distance);
    }
}