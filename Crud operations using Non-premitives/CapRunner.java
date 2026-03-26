class CapRunner {

    public static void main(String[] args) {

        Cap[] caps = new Cap[10];
        CapStore capstore = new CapStore(caps);

        capstore.save(new Cap("Black", "Nike", 999, "M", "Cotton", true));
        capstore.save(new Cap("White", "Adidas", 899, "L", "Polyester", true));
        capstore.save(new Cap("Red", "Puma", 799, "S", "Cotton", false));
        capstore.save(new Cap("Blue", "Reebok", 850, "M", "Wool", true));
        capstore.save(new Cap("Green", "Fila", 650, "L", "Cotton", false));
        capstore.save(new Cap("Grey", "Under Armour", 1200, "M", "Polyester", true));
        capstore.save(new Cap("Brown", "Levis", 700, "S", "Denim", false));
        capstore.save(new Cap("Yellow", "Zara", 1100, "L", "Cotton", true));
        capstore.save(new Cap("Pink", "H&M", 500, "M", "Polyester", true));
        capstore.save(new Cap("Black", "Gucci", 5000, "L", "Silk", false));
		
		
		System.out.println("-----");
		
		

        Maps[] mapsArray = new Maps[10];
        MapsStore store = new MapsStore(mapsArray);

        store.save(new Maps("India", 100.5, 80.2, "1:50000", "English", "Asia"));
        store.save(new Maps("USA", 120.0, 90.5, "1:100000", "English", "North America"));
        store.save(new Maps("Australia", 95.0, 70.0, "1:75000", "English", "Australia"));
        store.save(new Maps("Canada", 130.0, 100.0, "1:200000", "English", "North America"));
        store.save(new Maps("Brazil", 110.0, 85.0, "1:150000", "Portuguese", "South America"));
        store.save(new Maps("UK", 80.0, 60.0, "1:50000", "English", "Europe"));
        store.save(new Maps("Germany", 85.0, 65.0, "1:60000", "German", "Europe"));
        store.save(new Maps("Japan", 70.0, 50.0, "1:40000", "Japanese", "Asia"));
        store.save(new Maps("China", 140.0, 110.0, "1:250000", "Chinese", "Asia"));
        store.save(new Maps("Russia", 160.0, 120.0, "1:300000", "Russian", "Europe/Asia"));
		
		
System.out.println("--------");

Cloth[] cloth = new Cloth[10];   
ClothStore clothStore = new ClothStore(cloth); 

clothStore.save(new Cloth("Shirt", "Nike", 999, "M", "Black", "Cotton"));
clothStore.save(new Cloth("T-Shirt", "Adidas", 799, "L", "White", "Polyester"));
clothStore.save(new Cloth("Jeans", "Levis", 1999, "32", "Blue", "Denim"));
clothStore.save(new Cloth("Jacket", "Puma", 2499, "L", "Grey", "Wool"));
clothStore.save(new Cloth("Kurta", "FabIndia", 1299, "M", "Green", "Cotton"));
clothStore.save(new Cloth("Hoodie", "H&M", 1599, "L", "Black", "Fleece"));
clothStore.save(new Cloth("Shorts", "Zara", 899, "M", "Yellow", "Cotton"));
clothStore.save(new Cloth("Blazer", "Allen Solly", 2999, "L", "Navy", "Polyester"));
clothStore.save(new Cloth("Sweater", "Uniqlo", 1799, "M", "Brown", "Wool"));
clothStore.save(new Cloth("Track Pant", "Reebok", 1199, "L", "Grey", "Cotton"));

System.out.println("----------------");

Profile[] profileArray = new Profile[10];
ProfileStore profileStore = new ProfileStore(profileArray);

profileStore.save(new Profile("Chaturth", 22, "chaturth@gmail.com", "9876543210", "Bangalore", "Engineer"));
profileStore.save(new Profile("Rahul", 23, "rahul@gmail.com", "9123456780", "Mysore", "Developer"));
profileStore.save(new Profile("Anjali", 21, "anjali@gmail.com", "9988776655", "Delhi", "Designer"));
profileStore.save(new Profile("Kiran", 24, "kiran@gmail.com", "9871234560", "Hyderabad", "Tester"));
profileStore.save(new Profile("Sneha", 22, "sneha@gmail.com", "9012345678", "Chennai", "Analyst"));
profileStore.save(new Profile("Arjun", 25, "arjun@gmail.com", "9090909090", "Mumbai", "Manager"));
profileStore.save(new Profile("Divya", 23, "divya@gmail.com", "9887766554", "Pune", "HR"));
profileStore.save(new Profile("Ravi", 26, "ravi@gmail.com", "9876501234", "Kolkata", "Consultant"));
profileStore.save(new Profile("Meena", 21, "meena@gmail.com", "9123987654", "Jaipur", "Student"));
profileStore.save(new Profile("Vikram", 27, "vikram@gmail.com", "9001122334", "Ahmedabad", "Architect"));

System.out.println("----------------");

Statue[] statueArray = new Statue[10];
StatueStore statueStore = new StatueStore(statueArray);

statueStore.save(new Statue("Statue of Unity", "Gujarat", 182.0, "Bronze", "Ram V. Sutar", 2018));
statueStore.save(new Statue("Basava Statue", "Karnataka", 33.0, "Bronze", "Unknown", 2012));
statueStore.save(new Statue("Shivaji Statue", "Maharashtra", 16.0, "Bronze", "Unknown", 1921));
statueStore.save(new Statue("Kempegowda Statue", "Bangalore", 6.0, "Bronze", "Unknown", 2017));
statueStore.save(new Statue("Adiyogi Shiva", "Tamil Nadu", 34.0, "Steel", "Sadhguru", 2017));
statueStore.save(new Statue("Thiruvalluvar Statue", "Tamil Nadu", 41.0, "Stone", "V. Ganapati Sthapati", 2000));
statueStore.save(new Statue("Mahatma Gandhi Statue", "Delhi", 5.0, "Bronze", "Unknown", 1931));
statueStore.save(new Statue("Dr. B. R. Ambedkar Statue", "Maharashtra", 10.0, "Bronze", "Unknown", 1995));
statueStore.save(new Statue("Hanuman Statue", "Himachal Pradesh", 33.0, "Concrete", "Unknown", 2010));
statueStore.save(new Statue("Buddha Statue", "Hyderabad", 18.0, "Granite", "Unknown", 1992));

TollGate[] tollArray = new TollGate[10];
TollGateStore tollStore = new TollGateStore(tollArray);

tollStore.save(new TollGate("Attibele Toll", "Karnataka", 95.0, "Car", 6, "Highway"));
tollStore.save(new TollGate("Electronic City Toll", "Bangalore", 85.0, "Car", 4, "Expressway"));
tollStore.save(new TollGate("Nelamangala Toll", "Karnataka", 110.0, "Truck", 8, "Highway"));
tollStore.save(new TollGate("Hosur Toll", "Tamil Nadu", 100.0, "Car", 6, "Highway"));
tollStore.save(new TollGate("Krishnagiri Toll", "Tamil Nadu", 120.0, "Bus", 5, "Expressway"));
tollStore.save(new TollGate("Tumkur Toll", "Karnataka", 90.0, "Car", 4, "Highway"));
tollStore.save(new TollGate("Bidadi Toll", "Karnataka", 80.0, "Car", 3, "Bridge"));
tollStore.save(new TollGate("Mandya Toll", "Karnataka", 75.0, "Car", 4, "Highway"));
tollStore.save(new TollGate("Chitradurga Toll", "Karnataka", 130.0, "Truck", 7, "Expressway"));
tollStore.save(new TollGate("Davanagere Toll", "Karnataka", 105.0, "Bus", 5, "Highway"));


System.out.println("-----------");

CloudSoftware[] softwareArray = new CloudSoftware[10];
CloudSoftwareStore store = new CloudSoftwareStore(softwareArray);

store.save(new CloudSoftware("AWS EC2", "Amazon", "Public", 7500, "Web", true));
store.save(new CloudSoftware("Azure VM", "Microsoft", "Public", 7000, "Web", true));
store.save(new CloudSoftware("Google Compute Engine", "Google", "Public", 7200, "Web", true));
store.save(new CloudSoftware("IBM Cloud", "IBM", "Hybrid", 6800, "Enterprise", true));
store.save(new CloudSoftware("Oracle Cloud", "Oracle", "Public", 6500, "Enterprise", false));
store.save(new CloudSoftware("Salesforce", "Salesforce", "SaaS", 9000, "CRM", true));
store.save(new CloudSoftware("Dropbox", "Dropbox", "SaaS", 500, "Storage", true));
store.save(new CloudSoftware("Google Drive", "Google", "SaaS", 300, "Storage", true));
store.save(new CloudSoftware("Slack", "Slack", "SaaS", 800, "Communication", true));
store.save(new CloudSoftware("Zoom", "Zoom", "SaaS", 600, "Communication", true));

Farmer[] farmer = new Farmer[10];
FarmerStore farmerstore = new FarmerStore(farmer);

farmerstore.save(new FarmerStore("Chaturth","Balehonnuru","Coffee",10,"Black soil");
farmerstore.save(new FarmerStore("shodan","seegodu","arecanut",15,"Black soil");
farmerstore.save(new FarmerStore("aman","Balehonnuru","Coffee",5,"red soil");
farmerstore.save(new FarmerStore("koya","koppa","ragi",20,"mud soil");
farmerstore.save(new FarmerStore("danush","kadbgere","ragi",10,"Black soil");
farmerstore.save(new FarmerStore("shrijith","Bannur","Coffee",30,"red soil");
farmerstore.save(new FarmerStore("manjunath","kanthi","ragi",2,"Black soil");
farmerstore.save(new FarmerStore("raksha","chillamagaluru","paddy",10,"Black soil");
farmerstore.save(new FarmerStore("rajesh","hassan","tomato",1,"red soil");

	}
}


  
  

	

		
