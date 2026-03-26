class StatueStore {

    Statue[] statues;
    int currentIndex = 0;

    StatueStore(Statue[] statues) {
        this.statues = statues;
    }

    void save(Statue statue) {

        int index = statues.length;

        if (statues != null) {
            if (currentIndex < index) {

                statues[currentIndex] = statue;

              
                System.out.println("Name: " + statue.name);
                System.out.println("Location: " + statue.location);
                System.out.println("Height: " +  statue.height);
                System.out.println("Material: " + statue.material);
                System.out.println("Sculptor: " + statue.sculptor);
                System.out.println("Year Built: " + statue.yearBuilt);

                currentIndex++;
                System.out.println("Current Index: " + currentIndex);

            } else {
                System.out.println("Array is full");
            }
        }
    }
}