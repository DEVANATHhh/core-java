class Cloud {

    String provider;
    int storage;
    double price;
    boolean secure;
    String region;

    Sky sky;
    Rain rain;
    Wind wind;
    Lightning lightning;
    Thunder thunder;

    Cloud(String provider, int storage, double price, boolean secure, String region,
          Sky sky, Rain rain, Wind wind, Lightning lightning, Thunder thunder) {

        this.provider = provider;
        this.storage = storage;
        this.price = price;
        this.secure = secure;
        this.region = region;

        this.sky = sky;
        this.rain = rain;
        this.wind = wind;
        this.lightning = lightning;
        this.thunder = thunder;
    }

    void getinfo() {

        System.out.println("Provider: " + this.provider);
        System.out.println("Storage: " + this.storage);
        System.out.println("Price: " + this.price);
        System.out.println("Secure: " + this.secure);
        System.out.println("Region: " + this.region);

        System.out.println("Sky: " + this.sky);
        System.out.println("Rain: " + this.rain);
        System.out.println("Wind: " + this.wind);
        System.out.println("Lightning: " + this.lightning);
        System.out.println("Thunder: " + this.thunder);
    }
}