package src.com.crudtasks.medical;

public class MedicalDetails
{
    String name;
    String company;
    double cost;
    String expiryDate;
    boolean prescriptionRequired;

    public MedicalDetails(String name,String company,double cost,String expiryDate,boolean prescriptionRequired)
    {
        this.name=name;
        this.company=company;
        this.cost=cost;
        this.expiryDate=expiryDate;
        this.prescriptionRequired=prescriptionRequired;
    }

    public void showDetails()
    {
        System.out.println("executing showDetails in MedicalDetails");
        System.out.println("----------------------------------------");
        System.out.println("name:"+this.name);
        System.out.println("company:"+this.company);
        System.out.println("cost:"+this.cost);
        System.out.println("expiry date:"+this.expiryDate);
        System.out.println("prescription required:"+this.prescriptionRequired);
    }
}
