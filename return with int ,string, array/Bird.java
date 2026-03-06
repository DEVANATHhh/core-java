class Bird{


static String getColorByName(String name ){
	
	System.out.println("The colour  of the Bird is :"+name);
		if(name==null){
		System.out.println("The colour of t invalid ");
		return null;
	}
	
	if(name=="Sparrow" ){
		return "brown";
	}
		
	if(name=="Parrot"){
		return "green";
	}
	
	if(name=="crow"){
		return "black";
	}
	
	if(name=="Pigeon"){
		return "gray";
	}
	
	if(name=="peacock"){
		return "blue and green";
	}
	
	if(name=="flamingo"){
		return "pink";
		
	}		
	
	if(name=="Eagle"){
		
		return "brown";
	}
	
	if(name=="Owl"){
		return "Brown and White";
	}
	
	if(name=="Duck"){
		
		return "white";
	}
	
	if(name=="Swan"){
		return "white";
	}
	
	if(name=="Penguin"){
		return "black and white";
	}
	
	if(name=="Woodpecker"){
		return "Red and black";
	}
	
	if(name=="Kingfisher"){
		return "blue";
	}
	
	if(name=="Canary"){
		return "yellow";
	}
	
	if(name=="Hummingbird"){
		
		return "yelloew";
	}
	
	if(name=="Falcon"){
		return "Gray";
	}
	
	
	if(name=="Heron"){
		return "Gray and white";
	}
	
	
	if(name=="Ostrich"){
		return "black and white";
	}
	
	if(name=="Turkey"){
		return "brown";
	}
	return null;
	
}



static int birdLifeSpan(String name){
	
	System.out.println("The lifespan of the bird is "+name);
	
	
		if(name==null){
		System.out.println("The colour of t invalid ");
		return -1;
	}
	
	if(name=="Sparrow" ){
		return 2;
	}
		
	if(name=="Parrot"){
		return 3;
	}
	
	if(name=="crow"){
		return 4;
	}
	
	if(name=="Pigeon"){
		return 5;
	}
	
	if(name=="peacock"){
		return 6;
	}
	
	if(name=="flamingo"){
		return 7;
		
	}		
	
	if(name=="Eagle"){
		
		return 6;
	}
	
	if(name=="Owl"){
		return 6;
	}
	
	if(name=="Duck"){
		
		return 4;
	}
	
	if(name=="Swan"){
		return 6;
	}
	
	if(name=="Penguin"){
		return 7;
	}
	
	if(name=="Woodpecker"){
		return 9;
	}
	
	if(name=="Kingfisher"){
		return 4;
	}
	
	if(name=="Canary"){
		return 6;
	}
	
	if(name=="Hummingbird"){
		
		return 6;
	}
	
	if(name=="Falcon"){
		return 8;
	}
	
	
	if(name=="Heron"){
		return 2;
	}
	
	
	if(name=="Ostrich"){
		return 5;
	}
	
	if(name=="Turkey"){
		return 5;
	}
	return 0;
}

}






