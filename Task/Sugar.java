class Sugar {

    int spoons;
    String type;

    Sugar(int spoons, String type){
        this.spoons = spoons;
        this.type = type;
    }

    void getInfo(){
        System.out.println("Spoons: " + this.spoons + ", Type: " + this.type);
    }
}