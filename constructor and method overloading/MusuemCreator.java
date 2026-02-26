class MusuemCreator{




static void getMuseumInfo(String location,double entryFee ){
	
		System.out.println("Inofrmation about Museum ");
		Museum museum = new Museum(location,entryFee);
		System.out.println("name and entry fees: "+museum.location+" "+museum.entryFee);

}

static void getMuseumInfo(String location ){
	
		System.out.println("Inofrmation about Museum ");
		Museum museum = new Museum(location);
		System.out.println("name of the museum "+museum.location);

}


static void getMuseumInfo(double entryFee ){
	
		System.out.println("Inofrmation about Museum ");
		Museum museum = new Museum(entryFee);
		System.out.println("The entry  fees: "+museum.entryFee);

}

}
