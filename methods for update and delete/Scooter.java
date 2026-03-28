class Scooter
{
	String[] scooterNames;
	int index=0;
	
	Scooter(String[] scooterNames)
	{
		this.scooterNames=scooterNames;
	}
	
	void getScooterName(String name)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getScooterName in Scooter. "+"\nScooter name:"+name);
	
		if(name!=null)
		{
			int size=this.scooterNames.length;
			System.out.println("size of scooterNames array: "+size);
			if(index<size)
			{
				this.scooterNames[index]=name;
				System.out.println("name stored at index:"+this.index);
				this.index++;
				System.out.println("next index will be:"+this.index);
			}
			else
			{
				System.out.println("sorry we can't store name,bcz array is full");
			}
		}
		else
		{
			System.out.println("name and scooterNames array should not be null");
		}
	}
	
	void getSearchName(String searchName)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getSearchName in Scooter. "+"\nSearch name:"+searchName);

		boolean found=false;
		for(int i=0;i<scooterNames.length;i++)
		{
			if(searchName!=null && searchName.equals(scooterNames[i]))
			{
				found=true;
				System.out.println("at index "+i);
				break;
			}
		}
		if(found==true)
		{
			System.out.println("The "+searchName+" was found!!");
		}
		else
		{
			System.out.println(searchName+" not found!!");
		}
	}

	boolean updateByIndex(int updatingIndex,String updatingName)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing updateByIndex in Scooter"+"\nupdatingIndex: "+updatingIndex);

		if(updatingName!=null && this.scooterNames!=null)
		{
			if(updatingIndex>=0 && updatingIndex<this.scooterNames.length)
			{
				if(!updatingName.equals(this.scooterNames[updatingIndex]))
				{
					System.out.println("updating the values");
					this.scooterNames[updatingIndex]=updatingName;
					System.out.println("the updating index is "+updatingIndex+" the new name "+updatingName+" is updated!!");
					return true;
				}
				else
				{
					System.out.println("same name found!! so change name");
				}
			}
			else
			{
				System.out.println("index should be >0 and <size");
				return false;
			}
		}
		else
		{
			System.out.println("updating name should not be null");
		}
		return false;
	}

	boolean deleteScooterNameByIndex(int deletedIndex)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing deleteScooterNameByIndex in Scooter"+"\ndeletedIndex: "+deletedIndex);

		if(this.scooterNames!=null)
		{
			if(deletedIndex>=0 && deletedIndex<this.scooterNames.length)
			{
				if(this.scooterNames[deletedIndex]==null)
				{
					System.out.println("its already null, no name to delete");
					return false;
				}
				else
				{
					System.out.println("The deleting index i.e "+deletedIndex+" has name ("+this.scooterNames[deletedIndex]+")");
					this.scooterNames[deletedIndex]=null;
					System.out.println("index "+deletedIndex+" is deleted(null)!!");
					return true;
				}
			}
			else
			{
				System.out.println("the index should be >=0 and <size");
				return false;
			}
		}
		else
		{
			System.out.println("the array should not be null");
			return false;
		}
	}
}