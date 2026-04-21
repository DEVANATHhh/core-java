public class City {

    String name;
    int noOfDistricts;
    District[] districtName;

    public City(String name, int noOfDistricts, District[] districtName) {
        this.name = name;
        this.noOfDistricts = noOfDistricts;
        this.districtName = districtName;
    }
    public void cityInfo(){
        System.out.println("name :"+name);
        System.out.println("no of distict :"+noOfDistricts);
        for(District disname: districtName){
            if(disname!=null){
                disname.districtInfo();


            }
        }
    }
}
