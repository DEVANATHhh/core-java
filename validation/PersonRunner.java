class PersonRunner{

public static void main (String [] args){
	
	Person.contactInfo("Athul","Athul@gmail.com",91234565,"Btm");
	
	
	String foodName="chai";
	String ingredients[]={"tealeaves","sugar","water","milk"};
	
	Person.foodDish(foodName,ingredients);
	
	
	String brand="Asus";
	String model="TUF";
	String [] ports={"charging","hdmi","aux","Thunderbolt"};
	String [] countriesOfWarranty={"India","China","Africa","America"};
	
	Person.laptop(brand,model,ports,countriesOfWarranty);
}
}