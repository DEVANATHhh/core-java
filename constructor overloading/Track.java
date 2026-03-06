class Track {

    double length;
    String surfaceType;
    int lanes;
    String location;
    boolean isIndoor;

    Track() { }

    Track(double length, String surfaceType, int lanes, String location, boolean isIndoor) {
        this.length = length;
        this.surfaceType = surfaceType;
        this.lanes = lanes;
        this.location = location;
        this.isIndoor = isIndoor;
    }

    Track(double length, String surfaceType, int lanes, String location) {
        this.length = length;
        this.surfaceType = surfaceType;
        this.lanes = lanes;
        this.location = location;
    }

    Track(double length, String surfaceType, int lanes) {
        this.length = length;
        this.surfaceType = surfaceType;
        this.lanes = lanes;
    }

    Track(double length, String surfaceType) {
        this.length = length;
        this.surfaceType = surfaceType;
    }

    Track(double length) {
        this.length = length;
    }
}