class CapStore {

    Cap[] caps;
    int currentIndex = 0;

    CapStore(Cap[] caps) {
        this.caps = caps;
    }

    void save(Cap cap) {
        int index = caps.length;

        if (caps != null) {
            if (currentIndex < index) {
                caps[currentIndex] = cap;
                System.out.println("Cap brand: " + cap.brand);
                System.out.println("Color: " + cap.color);
                System.out.println("Price: " + cap.price);
                System.out.println("Size: " + cap.size);
                System.out.println("Material: " + cap.material);
                System.out.println("Is round cap: " + cap.isRoundCap);
                currentIndex++;
                System.out.println("Current index: " + currentIndex);
            } else {
                System.out.println("Array is full, can't store more items");
            }
        }
    }
}
