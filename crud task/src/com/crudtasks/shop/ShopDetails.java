package src.com.crudtasks.shop;

public class ShopDetails {
    String name;
    String location;
    int noOfEmployees;
    String ownerName;
    double revenue;

    public ShopDetails(String name,String location,int noOfEmployees,String ownerName,double revenue)
    {
        this.name=name;
        this.location=location;
        this.noOfEmployees=noOfEmployees;
        this.ownerName=ownerName;
        this.revenue=revenue;
    }

    public void showDetails()
    {
        System.out.println("executing showDetails in ShopDetails");
        System.out.println("----------------------------------------");
        System.out.println("name:"+this.name);
        System.out.println("location:"+this.location);
        System.out.println("no of employees:"+this.noOfEmployees);
        System.out.println("owner name:"+this.ownerName);
        System.out.println("revenue:"+this.revenue);
    }
}
