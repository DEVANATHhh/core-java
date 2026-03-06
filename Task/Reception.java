class Reception {

    int staff;
    String deskColor;

    Reception(int staff, String deskColor){
        this.staff = staff;
        this.deskColor = deskColor;
    }

    void getInfo(){
        System.out.println("Staff: " + this.staff + ", Desk Color: " + this.deskColor);
    }
}