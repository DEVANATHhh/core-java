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

    public Country findByName(String name ){
        System.out.println("executing findByName method");
        int size=this.country.length;
        if(name!=null)
        {
            for (Country contri:country)
            {
                if(name.equals(contri.name))
                {
                    System.out.println("name:"+name+" found!");
                    return contri;
                }
            }
        }
        else
        {
            System.out.println("name should not be null");
        }
        return null;
    }



    public State findStateByStateName(String stateName)
    {
        System.out.println("-----------------------------------------");
        System.out.println("executing findStateByStateName method");
        int size=this.country.length;
        if(stateName!=null)
        {
            for (Country contri:country)
            {
                if(contri!=null && contri.states!=null)
                {
                    for (State st:contri.states)
                    {
                        if (stateName.equals(st.name))
                        {
                            System.out.println("name:" + stateName + " found!");
                            return st;
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("name should not be null");
        }
        return null;
    }




    public City[] findAllCityByStateName(String stName)
    {
        System.out.println("-----------------------------------------");
        System.out.println("executing findAllCityByStateName method");
        int size=this.country.length;
        if(stName!=null)
        {
            for (Country contri:country)
            {
                if(contri!=null && contri.states!=null)
                {
                    for(State  st:contri.states)
                    {
                        if(st != null)
                        {
                            if(stName.equals(st.name))
                            {
                                return st.city;
                            }
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("stName should not be null");
        }
        return null;
    }



    public int findNoOfDistrictsByCityName(String ctName)
    {
        System.out.println("-----------------------------------------");
        System.out.println("executing findNoOfDistrictsByCityName method");
        if(ctName!=null)
        {
            for(Country contri:country)
            {
                if(contri!=null && contri.states!=null)
                {
                    for (State st:contri.states)
                    {
                        if(st!=null && st.city!=null)
                        {
                            for(City ct: st.city)
                            {
                                if(ct!=null && ct.districtName!=null)
                                {
                                    if(ctName.equals(ct.name))
                                    {
                                        return ct.noOfDistricts;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("ctName should not be null");
        }
        return 0;
    }



    public Country findByCollectorName(String collectorName)
    {
        System.out.println("-----------------------------------------");
        System.out.println("executing findByCollectorName method");
        if(collectorName!=null)
        {
            for(Country contri:country)
            {
                if(contri!=null && contri.states!=null)
                {
                    for (State st:contri.states)
                    {
                        if(st!=null && st.city!=null)
                        {
                            for(City ct: st.city)
                            {
                                if(ct!=null && ct.districtName!=null)
                                {
                                    for(District dist: ct.districtName)
                                    {
                                        if(dist!=null && dist.collector!=null)
                                        {
                                            if(collectorName.equals(dist.collector.name))
                                            {
                                                return contri;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("collectorName should not be null!");
        }
        return null;
    }








}


