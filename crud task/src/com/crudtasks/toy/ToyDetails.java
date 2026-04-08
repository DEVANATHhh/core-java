package src.com.crudtasks.toy;

public class ToyDetails
{
    String name;
    String[] materialTypes;
    double cost;
    boolean isVehicle;
    int mfdYear;

    public ToyDetails(String name, String[] materialTypes, double cost, boolean isVehicle, int mfdYear) {
        this.name = name;
        this.materialTypes = materialTypes;
        this.cost = cost;
        this.isVehicle = isVehicle;
        this.mfdYear = mfdYear;
    }

    public void showDetails()
    {
        System.out.println("executing showDetails in toyDetails");
        System.out.println("----------------------------------------");
        System.out.println("name:"+this.name);
        System.out.print("material types:");
        if(this.materialTypes!=null)
        {
            for(String material:materialTypes)
            {
                System.out.print(material+", ");
            }
        }
        System.out.println();
        System.out.println("cost:"+this.cost);
        System.out.println("is toy relate to vehicle:"+this.isVehicle);
        System.out.println("mfd year:"+this.mfdYear);
    }
}
