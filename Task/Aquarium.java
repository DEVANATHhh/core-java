class Aquarium {

    String type;
    int fishCount;
    double price;
    boolean freshwater;
    String shape;

    Goldfish goldfish;
    Coral coral;
    Filter filter;
    Gravel gravel;
    WaterPlant waterPlant;

    Aquarium(String type, int fishCount, double price, boolean freshwater, String shape,
             Goldfish goldfish, Coral coral, Filter filter, Gravel gravel, WaterPlant waterPlant) {

        this.type = type;
        this.fishCount = fishCount;
        this.price = price;
        this.freshwater = freshwater;
        this.shape = shape;

        this.goldfish = goldfish;
        this.coral = coral;
        this.filter = filter;
        this.gravel = gravel;
        this.waterPlant = waterPlant;
    }

    void getInfo() {

        System.out.println("Type: " + this.type);
        System.out.println("Fish Count: " + this.fishCount);
        System.out.println("Price: " + this.price);
        System.out.println("Freshwater: " + this.freshwater);
        System.out.println("Shape: " + this.shape);

        if(goldfish != null){
            goldfish.getInfo();
        }

        if(coral != null){
            coral.getInfo();
        }

        if(filter != null){
            filter.getInfo();
        }

        if(gravel != null){
            gravel.getInfo();
        }

        if(waterPlant != null){
            waterPlant.getInfo();
        }
    }
}