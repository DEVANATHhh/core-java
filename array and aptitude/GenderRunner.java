class GenderRunner
{
	public static void main(String[] args)
	{
		String [] genderArray = new String[3];
		Gender gender = new Gender(genderArray);
		
		gender.storeGenders("male");
		gender.storeGenders("female");
		gender.storeGenders("trans");
		
		gender.showGenders();
		gender.sort();
	}
}