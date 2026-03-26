class GumStore {

    Gum[] gums;
    int currentIndex = 0;

    GumStore(Gum[] gums) {
        this.gums = gums;
    }

    void save(Gum gum) {

        int index = gums.length;

        if (gums != null) {
            if (currentIndex < index) {

                gums[currentIndex] = gum;


                System.out.println("Brand: " + gum.brand);
                System.out.println("Flavor: " + gum.flavor);
                System.out.println("Price: " + gum.price);
                System.out.println("Quantity: " + gum.quantity);
                System.out.println("Sugar Free: " + gum.sugarFree);
                System.out.println("Packaging Type: " + gum.pack);

                currentIndex++;
                System.out.println("Current Index: " + currentIndex);

            } else {
                System.out.println("Array is full");
            }
        }
    }
}