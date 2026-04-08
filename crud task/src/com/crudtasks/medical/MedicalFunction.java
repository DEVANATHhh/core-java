package src.com.crudtasks.medical;

public class MedicalFunction {
    MedicalDetails[] medicalDetails;
    int currentIndex=0;

    MedicalFunction(MedicalDetails[] medicalDetails)
    {
        this.medicalDetails=medicalDetails;
    }

    void store(MedicalDetails medicalDetail)
    {
        if(medicalDetail!=null && this.medicalDetails!=null)
        {
            int size=this.medicalDetails.length;
            if(currentIndex<size)
            {
                this.medicalDetails[currentIndex]=medicalDetail;
                System.out.println("------------------------------------");
                System.out.println("Medical stored in index: "+currentIndex);
                medicalDetails[currentIndex].showDetails();
                currentIndex++;
            }
            else
            {
                System.out.println("array is full!");
            }
        }
        else
        {
            System.out.println("medicalDetails array and medical detail value should not be null!");
        }
    }

    void search(String name)
    {
        System.out.println("-----------------------------------------------");
        System.out.println("executing search method in MedicalFunction");
        if(name!=null && this.medicalDetails!=null)
        {
            boolean found=false;
            for(MedicalDetails medical:medicalDetails)
            {
                if(medical!=null)
                {
                    if(name.equals(medical.name))
                    {
                        System.out.println(name+" found!!");
                        found=true;
                        medical.showDetails();
                        break;
                    }
                }
            }
            if(!found)
            {
                System.out.println("name not found!");
            }
        }
        else
        {
            System.out.println("name and array should not be null!");
        }
    }

    void update(String name,double newCost)
    {
        System.out.println("-----------------------------------------------");
        System.out.println("executing update method in MedicalFunction");
        if(name!=null && newCost>=0.0)
        {
            boolean found=false;
            for(MedicalDetails medical:medicalDetails)
            {
                if(medical!=null)
                {
                    if(name.equals(medical.name))
                    {
                        medical.cost=newCost;
                        System.out.println("Medical "+medical.name+" has a new cost: "+medical.cost);
                        found=true;
                        medical.showDetails();
                        break;
                    }
                }
            }
            if(!found)
            {
                System.out.println("name not found!");
            }
        }
        else
        {
            System.out.println("name should not be null & cost cannot be negative");
        }
    }
}
