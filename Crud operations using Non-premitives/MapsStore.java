class MapsStore {

    Maps[] map;
    int currentindex = 0;

    MapsStore(Maps[] map) {
        this.map = map;
    }

    void save(Maps maps) {

        int index = map.length;

        if (map != null) {
            if (currentindex < index) {

                map[currentindex] = maps;

                System.out.println("Country: " + maps.country);
                System.out.println("Length: " + maps.length);
                System.out.println("Width: " + maps.width);
                System.out.println("Language: " + maps.language);
                System.out.println("Scale: " + maps.scale);
                System.out.println("Region Covered: " + maps.regionCovered);

                currentindex++;
                System.out.println("Current Index: " + currentindex);

            } else {
                System.out.println("Array is full");
            }
        }
    }
}

				
				
	