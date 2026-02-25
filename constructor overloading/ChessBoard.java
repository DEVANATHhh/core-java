class ChessBoard {

    int rows;
    int columns;
    String material;
    String colorPattern;
    boolean isFoldable;

    ChessBoard() { }

    ChessBoard(int rows, int columns, String material, String colorPattern, boolean isFoldable) {
        this.rows = rows;
        this.columns = columns;
        this.material = material;
        this.colorPattern = colorPattern;
        this.isFoldable = isFoldable;
    }

    ChessBoard(int rows, int columns, String material, String colorPattern) {
        this.rows = rows;
        this.columns = columns;
        this.material = material;
        this.colorPattern = colorPattern;
    }

    ChessBoard(int rows, int columns, String material) {
        this.rows = rows;
        this.columns = columns;
        this.material = material;
    }

    ChessBoard(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    ChessBoard(int rows) {
        this.rows = rows;
    }
}