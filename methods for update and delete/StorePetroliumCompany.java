class StorePetroliumCompany
{
	String[] companyName;
	int index=0;
	
	StorePetroliumCompany(String[] companyName)
	{
		this.companyName=companyName;
	}
	
	void getCompanyName(String company)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getCompanyName in StorePetroliumCompany. "+"\nname:"+company);
	
		if(companyName!=null)
		{
			if(company!=null)
			{
				int size=this.companyName.length;
				System.out.println("the size items of the array:"+size);
				if(index<size)
				{
					this.companyName[index]=company;
					System.out.println("current index: "+this.index);
					index++;
					System.out.println("company name saved,next index: "+this.index);
				}
				else
				{
					System.out.println("sorry, company names are filled, we cant store");
				}
			}
			else
			{
				System.out.println("the company name should not be a null");
			}
		}
		else
		{
			System.out.println("the company array should not be a null");
		}
	}

	void searchCompany(String searchName)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing searchCompany in StorePetroliumCompany. "+"\nSearch name:"+searchName);

		boolean found=false;
		for(int i=0;i<companyName.length;i++)
		{
			if(searchName!=null && searchName.equals(companyName[i]))
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
		System.out.println("executing updateByIndex in StorePetroliumCompany"+"\nupdatingIndex: "+updatingIndex);

		if(updatingName!=null && this.companyName!=null)
		{
			if(updatingIndex>=0 && updatingIndex<this.companyName.length)
			{
				if(!updatingName.equals(this.companyName[updatingIndex]))
				{
					System.out.println("updating the values");
					this.companyName[updatingIndex]=updatingName;
					System.out.println("the updating index is "+updatingIndex+" the new company "+updatingName+" is updated!!");
					return true;
				}
				else
				{
					System.out.println("same company found!! so change company");
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

	boolean deleteCompanyByIndex(int deletedIndex)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing deleteCompanyByIndex in StorePetroliumCompany"+"\ndeletedIndex: "+deletedIndex);

		if(this.companyName!=null)
		{
			if(deletedIndex>=0 && deletedIndex<this.companyName.length)
			{
				if(this.companyName[deletedIndex]==null)
				{
					System.out.println("its already null, no company to delete");
					return false;
				}
				else
				{
					System.out.println("The deleting index i.e "+deletedIndex+" has company ("+this.companyName[deletedIndex]+")");
					this.companyName[deletedIndex]=null;
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