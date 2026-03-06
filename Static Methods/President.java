class President {

   static void govern() {
        System.out.println("President governs the country");
        callState();
    }

   static void callState() {
        System.out.println("Calling state governments");
        rules();
    }

   static void rules() {
        System.out.println("Rules are framed");
        check();
    }

   static void check() {
        System.out.println("Checking rules");
        callAdmin();
    }

   static void callAdmin() {
        System.out.println("Calling administrators");
        collect();
    }

   static void collect() {
        System.out.println("Collecting reports");
        apply();
    }

    static void apply() {
        System.out.println("Applying policies");
        chain();
    }

   static void chain() {
        System.out.println("Creating chain of command");
        citizen();
    }

   static void citizen() {
        System.out.println("Informing citizens");
        follow();
    }

   static void follow() {
        System.out.println("Citizens follow the rules");
    }
}
