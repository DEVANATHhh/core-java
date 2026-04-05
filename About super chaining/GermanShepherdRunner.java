class GermanShepherdRunner {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        System.out.println(d1.breedType);
        System.out.println(d1.color);
        System.out.println(d1.purpose);

        Dog d2 = new Dog("Working", "Black", "Security");
        System.out.println(d2.breedType);
        System.out.println(d2.color);
        System.out.println(d2.purpose);

        Dog d3 = new Dog("Police");
        System.out.println(d3.breedType);
        System.out.println(d3.color);
        System.out.println(d3.purpose);
    }
}