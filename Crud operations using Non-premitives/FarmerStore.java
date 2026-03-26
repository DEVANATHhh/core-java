class FarmerStore{
	
	Farmer[] farmers;
	int currentIndex=0;
	
	FarmerStore(Farmer[] farmers)
	{
		this.farmer=farmers;
	}
	
	void save(Farmer farmer)
	{
		int index=farmers.length;
		
		if(farmers!=null)
		{
			if(currentIndex<index)
			{
				farmers[currentIndex]=farmer;
				
				System.out.println("farmer name:"+farmer.name);
				System.out.println("farmer location:"+farmer.location);
				System.out.println("cropGrown:"+farmer.cropGrown);
				System.out.println("area:"+farmer.area);
				System.out.println("total acers of land:"+farmer.acers);
				System.out.println("type of soil:"+farmer.soilType);
				
				currentIndex++;
				System.out.println("currentIndex:"+currentIndex);
				
			}
			else{
				System.out.println("array is full , more items cant stored");
			}
		}
	}
}

				
	
	