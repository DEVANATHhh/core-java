class StoreSingerName
{
	String[] names;
	int index=0;
	 
	StoreSingerName(String[] names)
	{
		this.names=names;
	}
	
	void getSingerName(String name)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getSingerName in StoreSingerName\nname: "+name);

		if(this.names!=null && name!=null)
		{
			int size=this.names.length;
			System.out.println("the max size of array: "+size);
			
			if(index<size)
			{
				System.out.println("present index: "+index);
				this.names[index]=name;
				index++;
				System.out.println("singer name saved,next index: "+index);
			}
			else
			{
				System.out.println("sorry,array is filled with names,so we cant save");
			}
		}
		else
		{
			System.out.println("name and array should not be null");
		}
	}

	void getSearchSinger(String searchName)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getSearchSinger in StoreSingerName\nsearchName:"+searchName);

		boolean found=false;

		for(int i=0;i<this.names.length;i++)
		{
			if(searchName!=null && searchName.equals(this.names[i]))
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

	boolean updateSingerByIndex(int updatingIndex,String updatingName)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing updateSingerByIndex in StoreSingerName\nupdatingIndex:"+updatingIndex);

		if(updatingName!=null && this.names!=null)
		{
			if(updatingIndex>=0 && updatingIndex<this.names.length)
			{
				if(!updatingName.equals(this.names[updatingIndex]))
				{
					System.out.println("updating the value");
					this.names[updatingIndex]=updatingName;
					System.out.println("updated successfully");
					return true;
				}
				else
				{
					System.out.println("same name found!! change name");
				}
			}
			else
			{
				System.out.println("index should be >=0 and <size");
			}
		}
		else
		{
			System.out.println("name should not be null");
		}

		return false;
	}

	boolean deleteSingerByIndex(int deletedIndex)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing deleteSingerByIndex in StoreSingerName\ndeletedIndex:"+deletedIndex);

		if(this.names!=null)
		{
			if(deletedIndex>=0 && deletedIndex<this.names.length)
			{
				if(this.names[deletedIndex]==null)
				{
					System.out.println("already null, nothing to delete");
					return false;
				}
				else
				{
					System.out.println("deleting name "+this.names[deletedIndex]);
					this.names[deletedIndex]=null;
					System.out.println("deleted successfully");
					return true;
				}
			}
			else
			{
				System.out.println("index should be >=0 and <size");
			}
		}

		return false;
	}
}