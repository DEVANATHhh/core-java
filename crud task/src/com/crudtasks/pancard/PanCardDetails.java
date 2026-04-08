package src.com.crudtasks.pancard;

public class PanCardDetails
{
    String name;
    String panNumber;
    String dob;
    String address;
    String fatherName;

    public PanCardDetails(String name,String panNumber,String dob,String address,String fatherName)
    {
        this.name=name;
        this.panNumber=panNumber;
        this.dob=dob;
        this.address=address;
        this.fatherName=fatherName;
    }

    public void showDetails()
    {
        System.out.println("executing showDetails in PanCardDetails");
        System.out.println("----------------------------------------");
        System.out.println("name:"+this.name);
        System.out.println("pan number:"+this.panNumber);
        System.out.println("dob:"+this.dob);
        System.out.println("address:"+this.address);
        System.out.println("father name:"+this.fatherName);
    }
}
