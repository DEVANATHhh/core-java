package src.com.crudtasks.grocery;

public class GroceryFunction {
    GroceryDetails[] groceryDetails;
    int currentIndex=0;

    GroceryFunction(GroceryDetails[] groceryDetails)
    {
        this.groceryDetails=groceryDetails;
    }

    void store(GroceryDetails groceryDetail)
    {
        if(groceryDetail!=null && this.groceryDetails!=null)
        {
            int size=this.groceryDetails.length;
            if(currentIndex<size)
            {
                this.groceryDetails[currentIndex]=groceryDetail;
                System.out.println("------------------------------------");
                System.out.println("Grocery stored in index: "+currentIndex);
                groceryDetails[currentIndex].showDetails();
                currentIndex++;
            }
            else
            {
                System.out.println("array is full!");
            }
        }
        else
        {
            System.out.println("groceryDetails array and grocery detail value should not be null!");
        }
    }

    void search(String groceryName)
    {
        System.out.println("-----------------------------------------------");
        System.out.println("executing search method in GroceryFunction");
        if(groceryName!=null && this.groceryDetails!=null)
        {
            boolean found=false;
            for(GroceryDetails grocery:groceryDetails)
            {
                if(grocery!=null)
                {
                    if(groceryName.equals(grocery.name))
                    {
                        System.out.println(groceryName+" found!!");
                        found=true;
                        grocery.showDetails();
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
        System.out.println("executing update method in GroceryFunction");
        if(name!=null && newCost>=0.0)
        {
            boolean found=false;
            for(GroceryDetails grocery:groceryDetails)
            {
                if(grocery!=null)
                {
                    if(name.equals(grocery.name))
                    {
                        grocery.cost=newCost;
                        System.out.println("Grocery "+grocery.name+" has a new cost: "+grocery.cost);
                        found=true;
                        grocery.showDetails();
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
