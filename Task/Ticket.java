class Ticket {

    int seatNumber;
    int price;

    Ticket(int seatNumber, int price){
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void getInfo(){
        System.out.println("Seat Number: " + this.seatNumber + ", Price: " + this.price);
    }
}