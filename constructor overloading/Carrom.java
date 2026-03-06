class Carrom {

    String boardMaterial;
    int players;
    double boardSize;
    boolean isIndoor;
    String strikerType;

    Carrom() { }

    Carrom(String boardMaterial, int players, double boardSize, boolean isIndoor, String strikerType) {
        this.boardMaterial = boardMaterial;
        this.players = players;
        this.boardSize = boardSize;
        this.isIndoor = isIndoor;
        this.strikerType = strikerType;
    }

    Carrom(String boardMaterial, int players, double boardSize, boolean isIndoor) {
        this.boardMaterial = boardMaterial;
        this.players = players;
        this.boardSize = boardSize;
        this.isIndoor = isIndoor;
    }

    Carrom(String boardMaterial, int players, double boardSize) {
        this.boardMaterial = boardMaterial;
        this.players = players;
        this.boardSize = boardSize;
    }

    Carrom(String boardMaterial, int players) {
        this.boardMaterial = boardMaterial;
        this.players = players;
    }

    Carrom(String boardMaterial) {
        this.boardMaterial = boardMaterial;
    }
}