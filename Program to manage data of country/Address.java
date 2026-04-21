public class Address {

    double no;
    double pincode;
    State  state;

    public Address(double no, double pincode, State state) {
        this.no = no;
        this.pincode = pincode;
        this.state = state;
    }

    public void addressInfo(){
        System.out.println("no :"+no);
        System.out.println("pincode :"+pincode);
        if(state!=null){
            state.stateInfo();

        }
    }
}


