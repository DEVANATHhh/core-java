class Umpire {

    String name;
    int matches;

    Umpire(String name, int matches){
        this.name = name;
        this.matches = matches;
    }

    void getInfo(){
        System.out.println("Umpire Name: " + this.name + ", Matches: " + this.matches);
    }
}