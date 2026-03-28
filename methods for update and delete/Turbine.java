class Turbine
{
	String[] turbineNames;
	int index=0;
	
	Turbine(String[] turbineNames)
	{
		this.turbineNames=turbineNames;
	}
	
	void getTurbineName(String name)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getTurbineName in Turbine. "+"\nTurbine name:"+name);
	
		if(name!=null)
		{
			int size=this.turbineNames.length;
			System.out.println("size of turbineNames array: "+size);
			if(index<size)
			{
				this.turbineNames[index]=name;
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
			System.out.println("name and turbineNames array should not be null");
		}
	}
	
	void getSearchName(String searchName)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getSearchName in Turbine. "+"\nSearch name:"+searchName);

		boolean found=false;
		for(int i=0;i<turbineNames.length;i++)
		{
			if(searchName.equals(turbineNames[i]))
			{
				found=true;
				System.out.println("at index "+i);
				break;
			}
		}
		if(found == true)
		{
			System.out.println("The "+searchName+" was found!!");
		}
		else
		{
			System.out.println(searchName+" not found!!");
		}
	}

	boolean updateTurbineNameByIndex(int updatingIndex,String updatingName)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing updateTurbineNameByIndex in Turbine\nupdatingIndex:"+updatingIndex);

		if(updatingName!=null && this.turbineNames!=null)
		{
			if(updatingIndex>=0 && updatingIndex<this.turbineNames.length)
			{
				if(!updatingName.equals(this.turbineNames[updatingIndex]))
				{
					System.out.println("updating the values");
					this.turbineNames[updatingIndex]=updatingName;
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

	boolean deleteTurbineNameByIndex(int deletedIndex)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing deleteTurbineNameByIndex in Turbine\ndeletedIndex:"+deletedIndex);

		if(this.turbineNames!=null)
		{
			if(deletedIndex>=0 && deletedIndex<this.turbineNames.length)
			{
				if(this.turbineNames[deletedIndex]==null)
				{
					System.out.println("its already null, no name to delete");
					return false;
				}
				else
				{
					System.out.println("The deleting index i.e "+deletedIndex+" has name ("+this.turbineNames[deletedIndex]+")");
					this.turbineNames[deletedIndex]=null;
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