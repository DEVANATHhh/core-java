public class CountryRunner {

    public static void main(String[] args) {







                Collector collector = new Collector("Ramesh Gowda", 2011);
                Collector collector1 = new Collector("Suresh Babu", 2012);
                Collector collector2 = new Collector("Anita Shetty", 2013);
                Collector collector3 = new Collector("Vikram Singh", 2014);
                Collector collector4 = new Collector("Meena Rao", 2015);
                Collector collector5 = new Collector("Arjun Kumar", 2016);
                Collector collector6 = new Collector("Divya N", 2017);
                Collector collector7 = new Collector("Harish Patil", 2018);
                Collector collector8 = new Collector("Lakshmi Devi", 2019);
                Collector collector9 = new Collector("Prakash Hegde", 2020);

                District district = new District("Mysuru", collector);
                District district1 = new District("Udupi", collector1);
                District district2 = new District("Kalaburagi", collector2);
                District district3 = new District("Hassan", collector3);
                District district4 = new District("Koppal", collector4);
                District district5 = new District("Ballari", collector5);
                District district6 = new District("Kodagu", collector6);
                District district7 = new District("Bengaluru Rural", collector7);
                District district8 = new District("Chikkamagaluru", collector8);
                District district9 = new District("Dharwad", collector9);

                District[] districts = {
                        district, district1, district2, district3, district4,
                        district5, district6, district7, district8, district9
                };

                City city = new City("Mysuru City", 1, districts);
                City city1 = new City("Udupi City", 1, districts);
                City city2 = new City("Kalaburagi City", 1, districts);
                City city3 = new City("Hassan City", 1, districts);
                City city4 = new City("Koppal City", 1, districts);
                City city5 = new City("Ballari City", 1, districts);
                City city6 = new City("Madikeri", 1, districts);
                City city7 = new City("Ramanagara", 1, districts);
                City city8 = new City("Chikkamagaluru City", 1, districts);
                City city9 = new City("Hubballi", 1, districts);

                City[] cities = {city, city1, city2, city3, city4, city5, city6, city7, city8, city9};

                State state = new State("Karnataka", 6.91, cities);

                Address address = new Address(5, 560001, state);

                President president = new President("Droupadi Murmu", 75, address);

                State[] states = {state};

                Country country = new Country("India", "Droupadi Murmu", states);

                Country[] countries = new Country[10];

                CountryStore countryStore = new CountryStore(countries);
                countryStore.store(country);

                country.countryInfo();
            }
        }





