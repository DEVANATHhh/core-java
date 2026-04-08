package src.com.crudtasks.pancard;

public class PanCardFunction {
    PanCardDetails[] panCardDetails;
    int currentIndex=0;

    PanCardFunction(PanCardDetails[] panCardDetails)
    {
        this.panCardDetails=panCardDetails;
    }

    void store(PanCardDetails panDetail)
    {
        if(panDetail!=null && this.panCardDetails!=null)
        {
            int size=this.panCardDetails.length;
            if(currentIndex<size)
            {
                this.panCardDetails[currentIndex]=panDetail;
                System.out.println("------------------------------------");
                System.out.println("PanCard stored in index: "+currentIndex);
                panCardDetails[currentIndex].showDetails();
                currentIndex++;
            }
            else
            {
                System.out.println("array is full!");
            }
        }
        else
        {
            System.out.println("panCardDetails array and pan detail value should not be null!");
        }
    }

    void search(String name)
    {
        System.out.println("-----------------------------------------------");
        System.out.println("executing search method in PanCardFunction");
        if(name!=null && this.panCardDetails!=null)
        {
            boolean found=false;
            for(PanCardDetails pan:panCardDetails)
            {
                if(pan!=null)
                {
                    if(name.equals(pan.name))
                    {
                        System.out.println(name+" found!!");
                        found=true;
                        pan.showDetails();
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

    void update(String name,String newAddress)
    {
        System.out.println("-----------------------------------------------");
        System.out.println("executing update method in PanCardFunction");
        if(name!=null && newAddress!=null)
        {
            boolean found=false;
            for(PanCardDetails pan:panCardDetails)
            {
                if(pan!=null)
                {
                    if(name.equals(pan.name))
                    {
                        pan.address=newAddress;
                        System.out.println("PanCard "+pan.name+" has new address: "+pan.address);
                        found=true;
                        pan.showDetails();
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
            System.out.println("name and address should not be null!");
        }
    }
}
