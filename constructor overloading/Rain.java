class Rain {

    double intensity;
    double duration;
    String type;
    double humidity;
    boolean isStorm;

    Rain() { 
	}

    Rain(double intensity, double duration, String type, double humidity, boolean isStorm) {
        this.intensity = intensity;
        this.duration = duration;
        this.type = type;
        this.humidity = humidity;
        this.isStorm = isStorm;
    }

    Rain(double intensity, double duration, String type, double humidity) {
        this.intensity = intensity;
        this.duration = duration;
        this.type = type;
        this.humidity = humidity;
    }

    Rain(double intensity, double duration, String type) {
        this.intensity = intensity;
        this.duration = duration;
        this.type = type;
    }

    Rain(double intensity, double duration) {
        this.intensity = intensity;
        this.duration = duration;
    }

    Rain(double intensity) {
        this.intensity = intensity;
    }
}