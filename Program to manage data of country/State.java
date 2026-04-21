public class State {

    String name;
    double population;
    City[] city;

    public State(String name, double population, City[] city) {
        this.name = name;
        this.population = population;
        this.city = city;
    }


    public void stateInfo() {
        System.out.println("State name : " + name);
        System.out.println("population :" + population);
        if (city != null) {
            for (City cit : city) {
                if (cit != null) {
                    cit.cityInfo();
                }
            }
        }
    }


        }
