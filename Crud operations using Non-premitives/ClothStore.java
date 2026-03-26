class ClothStore {

    Cloth[] clothes;
    int currentIndex = 0;

    ClothStore(Cloth[] clothes) {
        this.clothes = clothes;
    }

    void save(Cloth cloth) {

        int index = clothes.length;

        if (clothes != null) {
            if (currentIndex < index) {

                clothes[currentIndex] = cloth;

                System.out.println("Type: " + cloth.type);
                System.out.println("Brand: " + cloth.brand);
                System.out.println("Price: " + cloth.price);
                System.out.println("Size: " + cloth.size);
                System.out.println("Color: " + cloth.color);
                System.out.println("Material: " + cloth.material);

                currentIndex++;
                System.out.println("Current Index: " + currentIndex);

            } else {
                System.out.println("Array is full");
            }
        }
    }
}