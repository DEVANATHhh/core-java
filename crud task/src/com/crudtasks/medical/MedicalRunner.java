package src.com.crudtasks.medical;

public class MedicalRunner {
    public static void main(String[] args)
    {
        MedicalDetails[] medicalDetails=new MedicalDetails[3];
        MedicalFunction medicalFunction=new MedicalFunction(medicalDetails);

        MedicalDetails m1=new MedicalDetails("paracetamol","cipla",20.0,"2026",false);
        medicalFunction.store(m1);

        MedicalDetails m2=new MedicalDetails("dolo","micro",30.0,"2025",false);
        medicalFunction.store(m2);

        MedicalDetails m3=new MedicalDetails("insulin","novo",500.0,"2027",true);
        medicalFunction.store(m3);

        medicalFunction.search("dolo");

        medicalFunction.update("paracetamol",25.0);
    }
}
