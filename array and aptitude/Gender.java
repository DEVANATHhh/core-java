class Gender
{
	
	String[] genderTypes;
	int currentIndex=0;
	
	Gender(String[] genderTypes)
	{
		this.genderTypes=genderTypes;
	}
	
	
	void storeGenders(String gender)
	{
		System.out.println("---------------------------------");
		System.out.println("executing storeGenders in Gender");
		if(genderTypes!=null && gender!=null)
		{
			if(this.currentIndex<this.genderTypes.length)
			{
				this.genderTypes[currentIndex]=gender;
				System.out.println(gender+" gender is stored at index:"+currentIndex);
				this.currentIndex++;
			}
			else
			{
				System.out.println("sorry,array is full");
			}
		}
		else
		{
			System.out.println("array and value should not be null");
		}
	
	}

	 
	void showGenders()
	{
		System.out.println("-------------------------------------");
		System.out.println("executing showGenders\nStored genders are:");
		for(String gender:genderTypes)
		{
			if(gender!=null)
			{
				System.out.println(gender);
			}
			else
			{
				System.out.println("gender should not be a null");
			}
		}
	}
	
	void sort()
	{
		System.out.println("-------------------------------------");
		System.out.println("executing sort(A-Z)");
		
		for(int i=0;i<genderTypes.length-1;i++)
		{
			for(int j=0;j<genderTypes.length-i-1;j++)
			{
				if(genderTypes[j].compareTo(genderTypes[j+1])>0)
				{
					String temp=genderTypes[j];
					genderTypes[j]=genderTypes[j+1];
					genderTypes[j+1]=temp;
				}
			}
		}
		System.out.println("Alphabetical(A-Z) order:");
		for(int i=0;i<genderTypes.length;i++)
		{
			System.out.println(genderTypes[i]);
		}
		
		System.out.println("-------------------------------------");
		System.out.println("executing sort(Z-A)");
		
		for(int i=0;i<genderTypes.length-1;i++)
		{
			for(int j=0;j<genderTypes.length-i-1;j++)
			{
				if(genderTypes[j].compareTo(genderTypes[j+1])<0)
				{
					String temp=genderTypes[j];
					genderTypes[j]=genderTypes[j+1];
					genderTypes[j+1]=temp;
				}
			}
		}
		System.out.println("Alphabetical(Z-A) order:");
		for(int i=0;i<genderTypes.length;i++)
		{
			System.out.println(genderTypes[i]);
		}
	}
	
}