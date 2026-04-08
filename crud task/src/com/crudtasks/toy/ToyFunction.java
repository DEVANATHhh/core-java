package src.com.crudtasks.toy;

public class ToyFunction
{
    ToyDetails[] toysDetails;
    int currentIndex=0;

    ToyFunction(ToyDetails[] toysDetails)
    {
        this.toysDetails=toysDetails;
    }

    void store(ToyDetails toyDetail)
    {
        if(toyDetail!=null && this.toysDetails!=null)
        {
            int size=this.toysDetails.length;
            if(currentIndex<size)
            {
                this.toysDetails[currentIndex]=toyDetail;
                System.out.println("------------------------------------");
                System.out.println("Toy stored in index: "+currentIndex);
                toysDetails[currentIndex].showDetails();
                currentIndex++;
            }
            else
            {
                System.out.println("array is full!");
            }
        }
        else
        {
            System.out.println("toyDetails array and toy detail value should not be null!");
        }
    }

    void search(String toyName)
    {
        System.out.println("-----------------------------------------------");
        System.out.println("executing search method in ToyFunction");
        if(toyName!=null && this.toysDetails!=null)
        {
            boolean found=false;
            for(ToyDetails toys:toysDetails)
            {
                if(toys!=null) {
                    if (toyName.equals(toys.name)) {
                        System.out.println(toyName + " found!!");
                        found = true;
                        toys.showDetails();
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
            System.out.println("name and array should ot be null!");
        }
    }

    void update(String name,double newCost)
    {
        System.out.println("-----------------------------------------------");
        System.out.println("executing update method in ToyFunction");
        if(name!=null && newCost>0.0)
        {
            boolean found=false;
            for(ToyDetails toys:toysDetails)
            {
                if(toys!=null)
                {
                    if (name.equals(toys.name))
                    {
                        toys.cost=newCost;
                        System.out.println("Toy "+toys.name+" has a new cost: "+toys.cost);
                        found = true;
                        toys.showDetails();
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
            System.out.println("name should not be null & cost cannot be 0");
        }
    }
}
