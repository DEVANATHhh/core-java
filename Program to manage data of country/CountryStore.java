public class CountryStore {

    Country[] country;
    int index;


    public CountryStore(Country[] country) {
        this.country = country;
        this.index = index;
    }


    public void store(Country country) {
        if (this.country != null && country != null) {
            int size = this.country.length - 1;
            if (this.index != size) {
                this.country[size] = country;
                System.out.println("The Country Info saved at Index:" + index);
                this.index++;
                country.countryInfo();
                System.out.println("Storing Country Info at next Index:" + index);
            }

        }
    }
}
