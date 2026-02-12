class Person{

static void contactInfo(String name,String emails,int mobileNumbers,String address){
	
	System.out.println("The person's name is "+name);
	if(name==null){
		System.out.println("The persons name is invalid");
		return;
	}
	
	System.out.println("The person's email id "+emails);
	if(emails==null){
		System.out.println("The persons email is invalid");
		return;
	}
	

	System.out.println("The person's phone number "+mobileNumbers);
	if(mobileNumbers<900000000){
		System.out.println("The persons phone number is invalid");
		return;
	}
	
	
	
	System.out.println("The person's Address "+address);
	if(address==null){
		System.out.println("The persons Address is invalid");
		return;
	}
	
		System.out.println("The data entered are vallid");


}



static void foodDish(String name,String [] ingredents){

System.out.println("name of the dish is :"+name);
if(name==null){
		System.out.println("Food name is invalid ");
		return;
	}


System.out.println("ingredients of the dish :"+ingredents);
if(ingredents==null){
		System.out.println("The ingredient is invalid");
		return;
	}
	
	for(int i=0;i<ingredents.length;i++){
		System.out.println(ingredents[i]);
	}
	

	
		System.out.println("The data's are valid");

	
}




 
static void laptop(String brand,String model,String [] ports,String [] countriesOfWarranty){
	
		System.out.println("The brand names is :"+brand);
		if(brand==null){
		System.out.println("brand name is invalid ");
		return;
	}

		System.out.println("The model name is :"+model);
		if(model==null){
		System.out.println("model name is invalid ");
		return;
	}

		System.out.println("The ports in laptops are :"+ports);
		if(ports==null){
		System.out.println(" invalid data for ports");
		return;
	}
	for(int i=0;i<ports.length;i++){
		System.out.println(ports[i]);
	}
	

		System.out.println("The country which accept the warranty: "+countriesOfWarranty);
		
		if(countriesOfWarranty==null){
		System.out.println("country name is invalid ");
		return;
	}
	for(int i=0;i<countriesOfWarranty.length;i++){
		System.out.println(ports[i]);
	}
System.out.println("The datas are valid");
}
}