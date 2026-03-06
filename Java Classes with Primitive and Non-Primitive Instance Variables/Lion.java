class Lion{

    String name;
    int age;
    double weight;
    boolean wild;
    String color;
	
	
	Samosa samosa;
	Mobile mobile;
	Car car;
	Laptop laptop;
	Book book;



 

    Lion(String name,int age,double weight,boolean wild,String color,Samosa samosa,Mobile mobile,Car car,Book book,Laptop laptop){

        this.name=name;
        this.age=age;
        this.weight=weight;
        this.wild=wild;
        this.color=color;
		
		this.samosa=samosa;
		this.mobile=mobile;
		this.car=car;
		this.laptop=laptop;
		this.book=book;
		

       
    }
	
	void getinfo() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Weight: " + weight);
    System.out.println("Wild: " + wild);
    System.out.println("Color: " + color);

    System.out.println("Samosa: " + samosa);
    System.out.println("Mobile: " + mobile);
    System.out.println("Car: " + car);
    System.out.println("Laptop: " + laptop);
    System.out.println("Book: " + book);
}
}