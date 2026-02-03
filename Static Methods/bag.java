class Bag {

    static void open() {
        System.out.println("Bag opened");
	
    }

   static  void close() {
        System.out.println("Bag closed");
    }

   static  void store() {
        System.out.println("Items stored in bag");
    }

   static  void carry() {
        System.out.println("Bag is being carried");
    }

  static  void zip() {
        System.out.println("Bag zipped");
    }
}

class AnotherClass {

    static void useBag() {
        Bag.open();
        Bag.store();
        Bag.carry();
        Bag.zip();
        Bag.close();
    }
}
