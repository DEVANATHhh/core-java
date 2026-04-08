package src.com.crudtasks.shop;



public class ShopRunner {
    public static void main(String[] args)
    {
        ShopDetails[] shopDetails=new ShopDetails[3];
        ShopFunction shopFunction=new ShopFunction(shopDetails);

        ShopDetails s1=new ShopDetails("Reliance","blr",20,"ambani",100000);
        shopFunction.store(s1);

        ShopDetails s2=new ShopDetails("DMart","mys",15,"radhakishan",80000);
        shopFunction.store(s2);

        ShopDetails s3=new ShopDetails("More","hyd",10,"aditya",50000);
        shopFunction.store(s3);

        shopFunction.search("DMart");

        shopFunction.update("Reliance",120000);
    }
}
