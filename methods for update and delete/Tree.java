class Tree
{
	String[] treeNames;
	int index=0;
	
	Tree(String[] treeNames)
	{
		this.treeNames=treeNames;
	}
	
	void getTreeName(String name)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getTreeName in Tree. "+"\nTree name:"+name);
	
		if(name!=null)
		{
			int size=this.treeNames.length;
			System.out.println("size of treeNames array: "+size);
			if(index<size)
			{
				this.treeNames[index]=name;
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
			System.out.println("name and treeNames array should not be null");
		}
	}
	
	void getSearchName(String searchName)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getSearchName in Tree. "+"\nSearch name:"+searchName);

		boolean found=false;
		for(int i=0;i<treeNames.length;i++)
		{
			if(searchName.equals(treeNames[i]))
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

	boolean updateTreeNameByIndex(int updatingIndex,String updatingName)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing updateTreeNameByIndex in Tree\nupdatingIndex:"+updatingIndex);

		if(updatingName!=null && this.treeNames!=null)
		{
			if(updatingIndex>=0 && updatingIndex<this.treeNames.length)
			{
				if(!updatingName.equals(this.treeNames[updatingIndex]))
				{
					System.out.println("updating the values");
					this.treeNames[updatingIndex]=updatingName;
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

	boolean deleteTreeNameByIndex(int deletedIndex)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing deleteTreeNameByIndex in Tree\ndeletedIndex:"+deletedIndex);

		if(this.treeNames!=null)
		{
			if(deletedIndex>=0 && deletedIndex<this.treeNames.length)
			{
				if(this.treeNames[deletedIndex]==null)
				{
					System.out.println("already null, nothing to delete");
					return false;
				}
				else
				{
					System.out.println("deleting name "+this.treeNames[deletedIndex]);
					this.treeNames[deletedIndex]=null;
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