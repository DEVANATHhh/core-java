class UberBooking {

   static void bookRide(String pickup) {
        System.out.println("Ride booked from " + pickup);
    }

   
    static void bookRide(String pickup, String drop) {
        System.out.println("Ride booked from " + pickup + " to " + drop);
    }

   
   static void bookRide(String pickup, String drop, int charge) {
        System.out.println("Ride booked from " + pickup + " to " + drop +" and charge is  " + charge );
    }
}
