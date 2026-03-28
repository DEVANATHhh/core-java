class PastaStoring
{
	String[] flavours;
	int index=0;
	
	
	PastaStoring(String[] flavours)
	{
		this.flavours=flavours;
		this.index=index;
	}
	
	void getPastaFlavours(String flavour)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing the getPastaFlavours in PastaStoring"+"\nflavour: "+flavour);
		if(this.flavours!=null)
		{
			if(flavour!=null)
			{
				int size=this.flavours.length;
				System.out.println("the size of array: "+size);
				if(this.index<size)
				{
					flavours[index]=flavour;
					System.out.println(flavour+" stored at index: "+this.index);
					this.index++;
					System.out.println("next index will be: "+this.index);
				}
				else
				{
					System.out.println("sorry flavour can't be stored, array full!!");
				}
			}
			else
			{
				System.out.println("flavour should not be null");
			}
		}
		else
		{
			System.out.println("flavours array should not be empty");
		}
	}
	
	void searchFlavour(String flavourName)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing SearchFlavour in PastaStoring. "+"\nsearching flavourName:"+flavourName);
		
		boolean available=false;
		
		if(flavourName!=null)
		{
			for(String name:flavours)
			{
				if(flavourName==name)
				{
					available=true;
					break;
				}
			}
		}
		else
		{
			System.out.println("flavourName should not be null");
		}
		
		if(available==true)
		{
			System.out.println("The "+flavourName+" found!!");
		}
		else
		{
			System.out.println("The "+flavourName+" not found!!");
		}
	}
	
	boolean updateByIndex(int updatingIndex,String updatingName)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing updateByIndex in PastaStoring"+"\nupdatingIndex: "+updatingIndex);
		if(updatingName!=null && this.flavours !=null )
		{
			if(index>=0 && updatingIndex<=this.flavours.length)
			{
				if(flavours[updatingIndex]!=updatingName)
				{
					System.out.println("updating the values");
					//flavours[index]=flavours[updatingIndex];
					this.flavours[updatingIndex]=updatingName;
					System.out.println("the updating index is "+updatingIndex+" the new flavourName "+updatingName+" is updated!!");
					return true;
				}
				else
				{
					System.out.println("same flavourName found!! so change flavour");
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
			System.out.println("updating feature name should not be null");
		}
		return false;
	}
	
	boolean deleteFlavourByIndex(int deletedIndex)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing deleteFlavourByIndex in PastaStoring"+"\ndeletedIndex: "+deletedIndex);
		if( this.flavours!=null)
		{
			if(deletedIndex>=0 && deletedIndex<this.flavours.length)
			{
				if(this.flavours[deletedIndex]==null)
				{
					System.out.println("its already null, no flavour to delete");
					return false;
				}
				else
				{
					System.out.println("The deleting index i.e "+deletedIndex+" has flavour name "+"("+this.flavours[deletedIndex]+")");
					this.flavours[deletedIndex]=null;
					System.out.println("index "+deletedIndex+" is deleted(null)!!");
					return true;
				}
			}
			else
			{
				System.out.println("the index of flavour should be >= 0 and <size");
				return false;
			}
		}
		else
		{
			System.out.println("the array of flavours should not be null");
			return false;
		}
		//return false;
	}
}
