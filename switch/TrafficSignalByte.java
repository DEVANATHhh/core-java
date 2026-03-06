class TrafficSignalByte {
    public static void main(String[] args) {
        showSignal((byte)2);
    }

    static void showSignal(byte signal) {

        switch(signal) {
            case 1:
                System.out.println("Red - Stop");
                break;
            case 2:
                System.out.println("Yellow - Ready");
                break;
            case 3:
                System.out.println("Green - Go");
                break;
            case 4:
                System.out.println("Blue - Emergency");
                break;
            case 5:
                System.out.println("Blinking - Warning");
                break;
            default:
                System.out.println("Invalid signal");
				break;
        }
    }
}