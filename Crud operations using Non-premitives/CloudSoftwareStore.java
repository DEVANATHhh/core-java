class CloudSoftwareStore {

    CloudSoftware[] softwares;
    int currentIndex = 0;

    CloudSoftwareStore(CloudSoftware[] softwares) {
        this.softwares = softwares;
    }

    void save(CloudSoftware software) {

        int index = softwares.length;

        if (softwares != null) {
            if (currentIndex < index) {

                softwares[currentIndex] = software;

                System.out.println("Name: " + software.name);
                System.out.println("Provider: " + software.provider);
                System.out.println("Deployment Type: " + software.deploymentType);
                System.out.println("Price per Month: " + software.pricePerMonth);
                System.out.println("Platform: " + software.platform);
                System.out.println("Free Trial: " + software.freeTrial);

                currentIndex++;
                System.out.println("Current Index: " + currentIndex);

            } else {
                System.out.println("more items cant be stored in this array");
            }
        }
    }
}