class ChessBoard extends GameBoard {
    int squares;
    String color;
    boolean digital;
    String brand;
    int players;

    void displayDetails() {
        System.out.println(squares+" "+color+" "+digital+" "+brand+" "+players);
    }
}