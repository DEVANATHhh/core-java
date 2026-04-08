package src.com.crudtasks.grocery;

public class GroceryDetails {
    String name;
    String category;
    double cost;
    int quantity;
    String brand;

    public GroceryDetails(String name, String category, double cost, int quantity, String brand)
    {
        this.name = name;
        this.category = category;
        this.cost = cost;
        this.quantity = quantity;
        this.brand = brand;
    }

    public void showDetails()
    {
        System.out.println("executing showDetails in GroceryDetails");
        System.out.println("----------------------------------------");
        System.out.println("name:"+this.name);
        System.out.println("category:"+this.category);
        System.out.println("cost:"+this.cost);
        System.out.println("quantity:"+this.quantity);
        System.out.println("brand:"+this.brand);
    }
}
