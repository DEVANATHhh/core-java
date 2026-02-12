class ItemRunner{

public static void main (String [] args){


 String suitcaseBrand = Suitcase.brand("Alice");
        int suitcaseCapacity = Suitcase.capacity(5);
        boolean wheels = Suitcase.hasWheels("mountain");
        double suitcasePrice = Suitcase.price("INR");
        String suitcaseColor = Suitcase.color("Alice");

        
        System.out.println("Brand: " + suitcaseBrand);
        System.out.println("Capacity: " + suitcaseCapacity);
        System.out.println("Has wheels? " + wheels);
        System.out.println("Price: " + suitcasePrice);
        System.out.println("Color: " + suitcaseColor);
		
		
		
		 System.out.println(Bullet.type("target practice"));
        System.out.println(Bullet.speed(100));
        System.out.println(Bullet.weight(0.5));
        System.out.println(Bullet.isMetal("lead"));
        System.out.println(Bullet.origin("military"));
		
		
		System.out.println(Fire.color("camping"));
        System.out.println(Fire.temperature(25));
        System.out.println(Fire.isHot("high"));
        System.out.println(Fire.fuelType("forest wood"));
        System.out.println(Fire.state("active"));
		
		System.out.println(Water.state("liquid"));
        System.out.println(Water.boilingPoint(500));
        System.out.println(Water.isDrinkable("river"));
        System.out.println(Water.color("sunlight"));
        System.out.println(Water.density(25));
		
		System.out.println(Crown.material("coronation"));
        System.out.println(Crown.weight(50));
        System.out.println(Crown.hasGems("diamond"));
        System.out.println(Crown.price("GBP"));
        System.out.println(Crown.country("Victorian"));
		
		System.out.println(Towel.fabric("summer"));
        System.out.println(Towel.size("bath use"));
        System.out.println(Towel.absorbent("water test"));
        System.out.println(Towel.price("INR"));
        System.out.println(Towel.color("Alice"));
		
		
		System.out.println(Ladder.material("indoor"));
        System.out.println(Ladder.steps(2));
        System.out.println(Ladder.height(1.5));
        System.out.println(Ladder.foldable("storage"));
        System.out.println(Ladder.weight(1.0));
		
		
		System.out.println(Bench.material("park"));
        System.out.println(Bench.seatingCapacity(2));
        System.out.println(Bench.length(1.0));
        System.out.println(Bench.outdoorUse("rainy weather"));
        System.out.println(Bench.color("Alice"));
		
		
		
		System.out.println(Tablet.brand("Alice"));
        System.out.println(Tablet.storage(32));
        System.out.println(Tablet.screenSize(1.5));
        System.out.println(Tablet.supportsWifi("5G"));
        System.out.println(Tablet.price("INR"));
		
		
		
		System.out.println(Grenade.type("military"));
        System.out.println(Grenade.weight(0.1));
        System.out.println(Grenade.explosive("test environment"));
        System.out.println(Grenade.radius(5));
        System.out.println(Grenade.origin("defense"));
		
		
		
		System.out.println(Stabilizer.capacity(2));
        System.out.println(Stabilizer.brand("Alice"));
        System.out.println(Stabilizer.price("INR"));
        System.out.println(Stabilizer.automatic("overload protection"));
        System.out.println(Stabilizer.voltageRange(10));
}
}