class Agency
{
	int[] cylinderNumbers;
	int index=0;
	
	Agency(int[] cylinderNumbers)
	{
		this.cylinderNumbers=cylinderNumbers;
	}
	
	void getCylinderNumber(int serialNo)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getCylinderNumber in Agency. "+"\nSerial number:"+serialNo);
	
		if(serialNo!=0)
		{
			int size=this.cylinderNumbers.length;
			System.out.println("size of cylinderNumbers array: "+size);
			if(index<size)
			{
				this.cylinderNumbers[index]=serialNo;
				System.out.println("serialNo stored at index:"+this.index);
				this.index++;
				System.out.println("next index will be:"+this.index);
			}
			else
			{
				System.out.println("sorry we can't store serialNo,bcz array is full");
			}
		}
		else
		{
			System.out.println("serialNo and cylinderNumbers array should not be a zero");
		}
	}
	
	void getSearchNumber(int serialSearchNo)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getSearchNumber in Agency. "+"\nSerial Search number:"+serialSearchNo);

		boolean found=false;
		for(int  i=0;i<cylinderNumbers.length;i++)
		{
			if(serialSearchNo==cylinderNumbers[i])
			{
				found=true;
				System.out.println("at index "+i);
				break;
			}
		}
		if(found == true)
		{
			System.out.println("The "+serialSearchNo+" was found!!");
		}
		else
		{
			System.out.println(serialSearchNo+" not found!!");
		}
	}

	boolean updateByIndex(int updatingIndex,int updatingSerialNo)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing updateByIndex in Agency"+"\nupdatingIndex: "+updatingIndex);

		if(updatingSerialNo!=0 && this.cylinderNumbers!=null )
		{
			if(updatingIndex>=0 && updatingIndex<this.cylinderNumbers.length)
			{
				if(this.cylinderNumbers[updatingIndex]!=updatingSerialNo)
				{
					System.out.println("updating the values");

					this.cylinderNumbers[updatingIndex]=updatingSerialNo;

					System.out.println("the updating index is "+updatingIndex+" the new serialNo "+updatingSerialNo+" is updated!!");
					return true;
				}
				else
				{
					System.out.println("same serialNo found!! so change serialNo");
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
			System.out.println("updating serialNo should not be zero");
		}
		return false;
	}

	boolean deleteCylinderNumberByIndex(int deletedIndex)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing deleteCylinderNumberByIndex in Agency"+"\ndeletedIndex: "+deletedIndex);

		if(this.cylinderNumbers!=null)
		{
			if(deletedIndex>=0 && deletedIndex<this.cylinderNumbers.length)
			{
				if(this.cylinderNumbers[deletedIndex]==0)
				{
					System.out.println("its already zero, no serialNo to delete");
					return false;
				}
				else
				{
					System.out.println("The deleting index i.e "+deletedIndex+" has serialNo ("+this.cylinderNumbers[deletedIndex]+")");

					this.cylinderNumbers[deletedIndex]=0;

					System.out.println("index "+deletedIndex+" is deleted(0)!!");
					return true;
				}
			}
			else
			{
				System.out.println("the index of serialNo should be >= 0 and <size");
				return false;
			}
		}
		else
		{
			System.out.println("the array of cylinderNumbers should not be null");
			return false;
		}
	}
}