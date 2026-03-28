class Kettle
{
	String[] kettleNames;
	int index=0;
	
	Kettle(String[] kettleNames)
	{
		this.kettleNames=kettleNames;
	}
	
	void getKettleName(String name)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getKettleName in Kettle. "+"\nKettle name:"+name);
	
		if(name!=null)
		{
			int size=this.kettleNames.length;
			System.out.println("size of kettleNames array: "+size);
			if(index<size)
			{
				this.kettleNames[index]=name;
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
			System.out.println("name and kettleNames array should not be null");
		}
	}
	
	void getSearchName(String searchName)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getSearchName in Kettle. "+"\nSearch name:"+searchName);

		boolean found=false;
		for(int i=0;i<kettleNames.length;i++)
		{
			if(searchName!=null && searchName.equals(kettleNames[i]))
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
		System.out.println("executing updateByIndex in Kettle"+"\nupdatingIndex: "+updatingIndex);

		if(updatingName!=null && this.kettleNames!=null)
		{
			if(updatingIndex>=0 && updatingIndex<this.kettleNames.length)
			{
				if(!updatingName.equals(this.kettleNames[updatingIndex]))
				{
					System.out.println("updating the values");
					this.kettleNames[updatingIndex]=updatingName;
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

	boolean deleteKettleNameByIndex(int deletedIndex)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing deleteKettleNameByIndex in Kettle"+"\ndeletedIndex: "+deletedIndex);

		if(this.kettleNames!=null)
		{
			if(deletedIndex>=0 && deletedIndex<this.kettleNames.length)
			{
				if(this.kettleNames[deletedIndex]==null)
				{
					System.out.println("its already null, no name to delete");
					return false;
				}
				else
				{
					System.out.println("The deleting index i.e "+deletedIndex+" has name ("+this.kettleNames[deletedIndex]+")");
					this.kettleNames[deletedIndex]=null;
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