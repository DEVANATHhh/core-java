class ZooCreator{
	

	
	static void getZooInfo(String name,String location ){
	
		System.out.println("Inofrmation about zoo");
		Zoo zoo = new Zoo(name,location);
		System.out.println("name and location of  zoo: "+zoo.name+" "+zoo.location);

}


	static void getZooInfo(String name ){
	
		System.out.println("Inofrmation about zoo");
		Zoo zoo = new Zoo(name);
		System.out.println("name  of  zoo: "+zoo.name);

}



}

