class CloudSoftware {

    String name;
    String provider;
    String deploymentType;
    double pricePerMonth;
    String platform;
    boolean freeTrial;

    CloudSoftware(String name, String provider, String deploymentType, double pricePerMonth, String platform, boolean freeTrial) {
        this.name = name;
        this.provider = provider;
        this.deploymentType = deploymentType;
        this.pricePerMonth = pricePerMonth;
        this.platform = platform;
        this.freeTrial = freeTrial;
    }
}