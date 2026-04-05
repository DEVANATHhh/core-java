class House extends Building 
{
    House() 
	{
        super("Residential", "Medium", "Bricks");
        System.out.println("---------------------------------");
        System.out.println("implicit values");
    }

    House(String type, String size, String material) 
	{
        super(type, size, material);
        System.out.println("---------------------------------");
        System.out.println("explicit values");
    }

    House(String type) 
	{
        super("Commercial", "Large", "Concrete");
        System.out.println("---------------------------------");
        System.out.println("explicit + implicit values");
    }
}