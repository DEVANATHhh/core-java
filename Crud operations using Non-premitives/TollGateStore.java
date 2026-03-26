class TollGateStore {

    TollGate[] tollGates;
    int currentIndex = 0;

    TollGateStore(TollGate[] tollGates) {
        this.tollGates = tollGates;
    }

    void save(TollGate tollGate) {

        int index = tollGates.length;

        if (tollGates != null) {
            if (currentIndex < index) {

                tollGates[currentIndex] = tollGate;

                System.out.println("Name: " + tollGate.name);
                System.out.println("Location: " + tollGate.location);
                System.out.println("Toll Amount: " + tollGate.tollAmount);
                System.out.println("Vehicle Type: " + tollGate.vehicleType);
                System.out.println("Number of Lanes: " + tollGate.lanes);
                System.out.println("Toll Type: " + tollGate.type);

                currentIndex++;
                System.out.println("Current Index: " + currentIndex);

            } else {
                System.out.println("Array is full cant store more");
            }
        }
    }
}