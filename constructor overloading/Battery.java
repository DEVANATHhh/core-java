class Battery {

    String type;
    double voltage;
    int capacity;
    boolean isRechargeable;
    double weight;

    Battery() { }

    Battery(String type, double voltage, int capacity, boolean isRechargeable, double weight) {
        this.type = type;
        this.voltage = voltage;
        this.capacity = capacity;
        this.isRechargeable = isRechargeable;
        this.weight = weight;
    }

    Battery(String type, double voltage, int capacity, boolean isRechargeable) {
        this.type = type;
        this.voltage = voltage;
        this.capacity = capacity;
        this.isRechargeable = isRechargeable;
    }

    Battery(String type, double voltage, int capacity) {
        this.type = type;
        this.voltage = voltage;
        this.capacity = capacity;
    }

    Battery(String type, double voltage) {
        this.type = type;
        this.voltage = voltage;
    }

    Battery(String type) {
        this.type = type;
    }
}