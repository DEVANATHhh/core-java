class Team {

    String name;
    int players;

    Team(String name, int players){
        this.name = name;
        this.players = players;
    }

    void getInfo(){
        System.out.println("Team Name: " + this.name + ", Players: " + this.players);
    }
}