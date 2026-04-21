public class Country {


    String name;
    String president;
    State[] states;

    public Country(String name, String president, State[] states) {
        this.name = name;
        this.president = president;
        this.states = states;
    }

    public void countryInfo(){
        System.out.println();
        System.out.println();
        for(State sta:states){
            if(sta!=null){
                sta.stateInfo();
            }
        }
    }

}
