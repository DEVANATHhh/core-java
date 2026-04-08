package src.com.crudtasks.grocery;

public class GroceryRunner {
    public static void main(String[] args)
    {
        GroceryDetails[] groceryDetails=new GroceryDetails[3];
        GroceryFunction groceryFunction=new GroceryFunction(groceryDetails);

        GroceryDetails g1=new GroceryDetails("rice","food",50.0,10,"IndiaGate");
        groceryFunction.store(g1);

        GroceryDetails g2=new GroceryDetails("oil","cooking",120.0,5,"Fortune");
        groceryFunction.store(g2);

        GroceryDetails g3=new GroceryDetails("sugar","food",45.0,8,"Madhur");
        groceryFunction.store(g3);

        groceryFunction.search("oil");

        groceryFunction.update("rice",60.0);
    }
}
