class StadiumCreator{


static void getStadiumInfo(String location,double capacity ){
	
		System.out.println("Inofrmation about the stadium : ");
		Stadium stadium = new Stadium(location,capacity);
		System.out.println("location and capacity: "+stadium.location+" "+stadium.capacity);

}


static void getStadiumInfo(String location ){
	
		System.out.println("Inofrmation about the stadium : ");
		Stadium stadium = new Stadium(location);
		System.out.println("location of the stadium: "+stadium.location);

}


static void getStadiumInfo(double capacity ){
	
		System.out.println("Inofrmation about the stadium : ");
		Stadium stadium = new Stadium(capacity);
		System.out.println("capacity of stadium : "+stadium.capacity);

}

}