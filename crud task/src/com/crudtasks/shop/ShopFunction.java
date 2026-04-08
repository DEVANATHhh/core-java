package src.com.crudtasks.shop;



public class ShopFunction {
    ShopDetails[] shopDetails;
    int currentIndex=0;

    ShopFunction(ShopDetails[] shopDetails)
    {
        this.shopDetails=shopDetails;
    }

    void store(ShopDetails shopDetail)
    {
        if(shopDetail!=null && this.shopDetails!=null)
        {
            int size=this.shopDetails.length;
            if(currentIndex<size)
            {
                this.shopDetails[currentIndex]=shopDetail;
                System.out.println("------------------------------------");
                System.out.println("Shop stored in index: "+currentIndex);
                shopDetails[currentIndex].showDetails();
                currentIndex++;
            }
            else
            {
                System.out.println("array is full!");
            }
        }
        else
        {
            System.out.println("shopDetails array and shop detail value should not be null!");
        }
    }

    void search(String name)
    {
        System.out.println("-----------------------------------------------");
        System.out.println("executing search method in ShopFunction");
        if(name!=null && this.shopDetails!=null)
        {
            boolean found=false;
            for(ShopDetails shop:shopDetails)
            {
                if(shop!=null)
                {
                    if(name.equals(shop.name))
                    {
                        System.out.println(name+" found!!");
                        found=true;
                        shop.showDetails();
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

    void update(String name,double newRevenue)
    {
        System.out.println("-----------------------------------------------");
        System.out.println("executing update method in ShopFunction");
        if(name!=null && newRevenue>=0.0)
        {
            boolean found=false;
            for(ShopDetails shop:shopDetails)
            {
                if(shop!=null)
                {
                    if(name.equals(shop.name))
                    {
                        shop.revenue=newRevenue;
                        System.out.println("Shop "+shop.name+" has new revenue: "+shop.revenue);
                        found=true;
                        shop.showDetails();
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
            System.out.println("name should not be null & revenue cannot be negative");
        }
    }
}
