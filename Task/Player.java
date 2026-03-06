class Player {

    String name;
    int runs;

    Player(String name, int runs){
        this.name = name;
        this.runs = runs;
    }

    void getInfo(){
        System.out.println("Player Name: " + this.name + ", Runs: " + this.runs);
    }
}