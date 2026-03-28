class Steel
{
	String[] steelNames;
	int index=0;
	
	Steel(String[] steelNames)
	{
		this.steelNames=steelNames;
	}
	
	void getSteelName(String name)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getSteelName in Steel. "+"\nSteel name:"+name);
	
		if(name!=null)
		{
			int size=this.steelNames.length;
			System.out.println("size of steelNames array: "+size);
			if(index<size)
			{
				this.steelNames[index]=name;
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
			System.out.println("name and steelNames array should not be null");
		}
	}
	
	void getSearchName(String searchName)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getSearchName in Steel. "+"\nSearch name:"+searchName);

		boolean found=false;
		for(int i=0;i<steelNames.length;i++)
		{
			if(searchName!=null && searchName.equals(steelNames[i]))
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
		System.out.println("executing updateByIndex in Steel"+"\nupdatingIndex: "+updatingIndex);

		if(updatingName!=null && this.steelNames!=null)
		{
			if(updatingIndex>=0 && updatingIndex<this.steelNames.length)
			{
				if(!updatingName.equals(this.steelNames[updatingIndex]))
				{
					System.out.println("updating the values");
					this.steelNames[updatingIndex]=updatingName;
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

	boolean deleteSteelNameByIndex(int deletedIndex)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing deleteSteelNameByIndex in Steel"+"\ndeletedIndex: "+deletedIndex);

		if(this.steelNames!=null)
		{
			if(deletedIndex>=0 && deletedIndex<this.steelNames.length)
			{
				if(this.steelNames[deletedIndex]==null)
				{
					System.out.println("its already null, no name to delete");
					return false;
				}
				else
				{
					System.out.println("The deleting index i.e "+deletedIndex+" has name ("+this.steelNames[deletedIndex]+")");
					this.steelNames[deletedIndex]=null;
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