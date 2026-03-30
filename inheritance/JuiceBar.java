class JuiceBar extends Bar {
    String juiceType;
    int price;
    boolean fresh;
    String owner;
    int items;

    void displayDetails() {
        System.out.println(juiceType+" "+price+" "+fresh+" "+owner+" "+items);
    }
}