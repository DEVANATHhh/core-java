class Mouse {

    
    String brand;
    int dpi;
    double price;
    boolean wireless;
    String color;
	
	Samosa samosa;
	Mobile mobile;
	Car car;
	Laptop laptop;
	Book book;
	
	

   
   

    Mouse(String brand,int dpi,double price,boolean wireless,String color,Samosa samosa,Mobile mobile,Car car,Book book,Laptop laptop ){

        this.brand=brand;
        this.dpi=dpi;
        this.price=price;
        this.wireless=wireless;
        this.color=color;
		
		this.samosa=samosa;
		this.mobile=mobile;
		this.car=car;
		this.laptop=laptop;
		this.book=book;
		

       
    }
	
	void getinfo(){
		
		System.out.println("Mouse Brand: " + this.brand);
		System.out.println("Mouse DPI: " + this.dpi);
		System.out.println("Mouse Price: " + this.price);
		System.out.println("Mouse Wireless: " + this.wireless);
		System.out.println("Mouse Color: " + this.color);

		System.out.println("Samosa: " + this.samosa);
		System.out.println("Mobile: " + this.mobile);
		System.out.println("Car: " + this.car);
		System.out.println("Laptop: " + this.laptop);
		System.out.println("Book: " + this.book);
	}
	
	
	
	
}