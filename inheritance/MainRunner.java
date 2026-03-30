class MainRunner {
    public static void main(String[] args) {

      

        // ARMY 
        IndianArmy a1 = new IndianArmy();
        a1.country="India";
		a1.soldiers=100000;
		a1.chief="General";
        a1.regiment="Madras";
		a1.weapon="Rifle"; 
		a1.missions=10; 
		a1.borderDuty=true;
		a1.base="Delhi";
        a1.protect(); 
		a1.train(); 
		a1.displayDetails();

        System.out.println("----------------");

        IndianArmy a2 = new IndianArmy();
        a2.country="India";
		a2.soldiers=120000; 
		a2.chief="Chief";
        a2.regiment="Sikh";
		a2.weapon="AK47"; 
		a2.missions=15; 
		a2.borderDuty=true; 
		a2.base="Punjab";
        a2.protect();
		a2.train();
		a2.displayDetails();

        System.out.println("----------------");

        Army a3 = new IndianArmy();
        a3.country="India";
		a3.soldiers=90000; 
		a3.chief="Officer";
        a3.protect(); 
		a3.train();

        System.out.println("----------------");

        Army a4 = new IndianArmy();
        a4.country="India";
		a4.soldiers=80000;
		a4.chief="Commander";
        a4.protect(); 
		a4.train();

        System.out.println("----------------");

        Army a5 = new Army();
        a5.country="India";
		a5.soldiers=70000;
		a5.chief="Leader";
        a5.protect(); 
		a5.train();

        System.out.println("----------------");

        Army a6 = new Army();
        a6.country="India";
		a6.soldiers=60000;
		a6.chief="Captain";
        a6.protect(); 
		a6.train();

        System.out.println("==========");

        // SOLDIER 
        SpecialSoldier s1 = new SpecialSoldier();
        s1.name="Arjun";
		s1.rank="Captain";
		s1.age=30;
        s1.weapon="Sniper";
		s1.mission="Rescue";
		s1.exp=10; 
		s1.nightVision=true; 
		s1.unit="Para";
        s1.attack(); 
		s1.defend();
		s1.displayDetails();

        System.out.println("----------------");

        SpecialSoldier s2 = new SpecialSoldier();
        s2.name="Vikram";
		s2.rank="Major"; 
		s2.age=40;
        s2.weapon="Rifle"; 
		s2.mission="Combat";
		s2.exp=15;
		s2.nightVision=true;
		s2.unit="Black";
        s2.attack();
		s2.defend();
		s2.displayDetails();

        System.out.println("----------------");

        Soldier s3 = new SpecialSoldier();
        s3.name="Ravi";
		s3.rank="Lieutenant"; 
		s3.age=30;
        s3.attack();
		s3.defend();

        System.out.println("----------------");

        Soldier s4 = new SpecialSoldier();
        s4.name="Karan";
		s4.rank="Captain";
		s4.age=33;
		
        s4.attack(); 
		s4.defend();

        System.out.println("----------------");

        Soldier s5 = new Soldier();
        s5.name="Raj";
		s5.rank="Sergeant";
		s5.age=38;
        s5.attack();
		s5.defend();

        System.out.println("----------------");

        Soldier s6 = new Soldier();
        s6.name="Manoj"; 
		s6.rank="Corporal";
		s6.age=29;
        s6.attack(); 
		s6.defend();

        System.out.println("==========");
		
		
		
		// BALLOON
		AirBalloon b1 = new AirBalloon();
		b1.color="Red";
		b1.size="Medium";
		b1.price=50;
		b1.gas="Helium";
		b1.height=10; 
		b1.decorated=true;
		b1.shape="Round";
		b1.owner="Raj";
		b1.inflate(); 
		b1.burst();
		b1.displayDetails();

		System.out.println("----------------");

		AirBalloon b2 = new AirBalloon();
		b2.color="Blue";
		b2.size="Large"; 
		b2.price=80;
		b2.gas="Hydrogen"; 
		b2.height=15; 
		b2.decorated=false;
		b2.shape="Heart";
		b2.owner="Amit";
		b2.inflate(); 
		b2.burst();
		b2.displayDetails();

		System.out.println("----------------");

		Balloon b3 = new AirBalloon();
		b3.color="Green";
		b3.size="Small"; 
		b3.price=30;
		b3.inflate(); 
		b3.burst();

		System.out.println("----------------");

		Balloon b4 = new AirBalloon();
		b4.color="Yellow";
		b4.size="Medium";
		b4.price=40;
		
		b4.inflate(); 
		b4.burst();

		System.out.println("----------------");

		Balloon b5 = new Balloon();
		b5.color="Pink";
		b5.size="Small";
		b5.price=20;
		b5.inflate(); 
		b5.burst();

		System.out.println("----------------");

		Balloon b6 = new Balloon();
		b6.color="White";
		b6.size="Large";
		b6.price=60;
		b6.inflate(); 
		b6.burst();

		System.out.println("==========");

		//  POWERBANK
		SmartPowerBank p1 = new SmartPowerBank();
		p1.brand="Mi"; 
		p1.capacity=20000;
		p1.price=1500;
		p1.ports=2; 
		p1.fastCharge=true;
		p1.color="Black";
		p1.weight=300;
		p1.type="Lithium";
		p1.charge();
		p1.plugIn(); 
		p1.displayDetails();

		System.out.println("----------------");

		SmartPowerBank p2 = new SmartPowerBank();
		p2.brand="Realme";
		p2.capacity=15000;
		p2.price=1200;
		p2.ports=3;
		p2.fastCharge=true;
		p2.color="Blue"; 
		p2.weight=280;
		p2.type="Polymer";
		p2.charge(); 
		p2.plugIn();
		p2.displayDetails();

		System.out.println("----------------");

		PowerBank p3 = new SmartPowerBank();
		p3.brand="Ambrane"; 
		p3.capacity=10000;
		p3.price=800;
		p3.charge();
		p3.plugIn();

		System.out.println("----------------");

		PowerBank p4 = new SmartPowerBank();
		p4.brand="Syska";
		p4.capacity=12000;
		p4.price=900;
		p4.charge(); 
		p4.plugIn();

		System.out.println("----------------");

		PowerBank p5 = new PowerBank();
		p5.brand="Boat";
		p5.capacity=8000;
		p5.price=600;
		p5.charge(); 
		p5.plugIn();

		System.out.println("----------------");

		PowerBank p6 = new PowerBank();
		p6.brand="HP";
		p6.capacity=5000;
		p6.price=500;
		p6.charge(); 
		p6.plugIn();

		System.out.println("==========");

		// WAR 
		ModernWar w1 = new ModernWar();
		w1.name="WW3"; 
		w1.country="Global";
		w1.year=2030;
		w1.technology="AI";
		w1.troops=100000; 
		w1.drones=true; 
		w1.strategy="Cyber";
		w1.weapons="Missiles";
		w1.startWar(); 
		w1.endWar(); 
		w1.displayDetails();

		System.out.println("----------------");

		ModernWar w2 = new ModernWar();
		w2.name="ColdWar"; 
		w2.country="USA"; 
		w2.year=1950;
		w2.technology="Nuclear";
		w2.troops=50000; 
		w2.drones=false; 
		w2.strategy="Defense";
		w2.weapons="Bomb";
		w2.startWar();
		w2.endWar();
		w2.displayDetails();

		System.out.println("----------------");

		War w3 = new ModernWar();
		w3.name="Historic";
		w3.country="UK";
		w3.year=1900;
		w3.startWar();
		w3.endWar();

		System.out.println("----------------");

		War w4 = new ModernWar();
		w4.name="Future";
		w4.country="India";
		w4.year=2040;
		w4.startWar(); 
		w4.endWar();

		System.out.println("----------------");

		War w5 = new War();
		w5.name="Battle1"; 
		w5.country="India";
		w5.year=1800;
		w5.startWar();
		w5.endWar();

		System.out.println("----------------");

		War w6 = new War();
		w6.name="Battle2";
		w6.country="China";
		w6.year=1700;
		w6.startWar(); 
		w6.endWar();

		System.out.println("==========");

		//  GAMEBOARD 
		ChessBoard g1 = new ChessBoard();
		g1.type="Indoor"; g1.size=8; g1.material="Wood";
		g1.squares=64; g1.color="BlackWhite"; g1.digital=false; g1.brand="ChessCo"; g1.players=2;
		g1.startGame(); g1.endGame(); g1.displayDetails();

		System.out.println("----------------");

		ChessBoard g2 = new ChessBoard();
		g2.type="Digital"; g2.size=10; g2.material="Plastic";
		g2.squares=100; g2.color="Brown"; g2.digital=true; g2.brand="SmartChess"; g2.players=2;
		g2.startGame(); g2.endGame(); g2.displayDetails();

		System.out.println("----------------");

		GameBoard g3 = new ChessBoard();
		g3.type="Board"; g3.size=6; g3.material="Wood";
		g3.startGame(); g3.endGame();

		System.out.println("----------------");

		GameBoard g4 = new ChessBoard();
		g4.type="Mini"; g4.size=5; g4.material="Plastic";
		g4.startGame(); g4.endGame();

		System.out.println("----------------");

		GameBoard g5 = new GameBoard();
		g5.type="Ludo"; g5.size=4; g5.material="Paper";
		g5.startGame(); g5.endGame();

		System.out.println("----------------");

		GameBoard g6 = new GameBoard();
		g6.type="Snake"; g6.size=5; g6.material="Card";
		g6.startGame(); g6.endGame();

		System.out.println("==========");

		// ORBIT 
		SatelliteOrbit o1 = new SatelliteOrbit();
		o1.planet="Earth"; o1.speed=20000; o1.type="Circular";
		o1.satellite="ISRO"; o1.altitude=500; o1.active=true; o1.purpose="Communication"; o1.duration=5;
		o1.rotate(); o1.stabilize(); o1.displayDetails();

		System.out.println("----------------");

		SatelliteOrbit o2 = new SatelliteOrbit();
		o2.planet="Mars"; o2.speed=15000; o2.type="Elliptical";
		o2.satellite="NASA"; o2.altitude=800; o2.active=true; o2.purpose="Research"; o2.duration=10;
		o2.rotate(); o2.stabilize(); o2.displayDetails();

		System.out.println("----------------");

		Orbit o3 = new SatelliteOrbit();
		o3.planet="Jupiter"; o3.speed=10000; o3.type="Circular";
		o3.rotate(); o3.stabilize();

		System.out.println("----------------");

		Orbit o4 = new SatelliteOrbit();
		o4.planet="Saturn"; o4.speed=9000; o4.type="Elliptical";
		o4.rotate(); o4.stabilize();

		System.out.println("----------------");

		Orbit o5 = new Orbit();
		o5.planet="Venus"; o5.speed=8000; o5.type="Circular";
		o5.rotate(); o5.stabilize();

		System.out.println("----------------");

		Orbit o6 = new Orbit();
		o6.planet="Mercury"; o6.speed=7000; o6.type="Elliptical";
		o6.rotate(); o6.stabilize();

		System.out.println("==========");
		
		
		//  BAR
		JuiceBar jb1 = new JuiceBar();
		jb1.name="FreshBar"; jb1.location="Bangalore"; jb1.rating=5;
		jb1.juiceType="Orange"; jb1.price=100; jb1.fresh=true; jb1.owner="Ravi"; jb1.items=20;
		jb1.serve(); jb1.open(); jb1.displayDetails();

		System.out.println("----------------");

		JuiceBar jb2 = new JuiceBar();
		jb2.name="CoolDrinks"; jb2.location="Chennai"; jb2.rating=4;
		jb2.juiceType="Mango"; jb2.price=120; jb2.fresh=true; jb2.owner="Kiran"; jb2.items=15;
		jb2.serve(); jb2.open(); jb2.displayDetails();

		System.out.println("----------------");

		Bar jb3 = new JuiceBar();
		jb3.name="MiniBar"; jb3.location="Delhi"; jb3.rating=3;
		jb3.serve(); jb3.open();

		System.out.println("----------------");

		Bar jb4 = new JuiceBar();
		jb4.name="StreetBar"; jb4.location="Mumbai"; jb4.rating=4;
		jb4.serve(); jb4.open();

		System.out.println("----------------");

		Bar jb5 = new Bar();
		jb5.name="LocalBar"; jb5.location="Hyderabad"; jb5.rating=3;
		jb5.serve(); jb5.open();

		System.out.println("----------------");

		Bar jb6 = new Bar();
		jb6.name="CityBar"; jb6.location="Pune"; jb6.rating=5;
		jb6.serve(); jb6.open();

		System.out.println("==========");

		// OPENER 
		BottleOpener op1 = new BottleOpener();
		op1.material="Steel"; op1.brand="Prestige"; op1.price=200;
		op1.type="Bottle"; op1.size=5; op1.portable=true; op1.color="Silver"; op1.weight=100;
		op1.open(); op1.close(); op1.displayDetails();

		System.out.println("----------------");

		BottleOpener op2 = new BottleOpener();
		op2.material="Iron"; op2.brand="Local"; op2.price=100;
		op2.type="Jar"; op2.size=4; op2.portable=false; op2.color="Black"; op2.weight=120;
		op2.open(); op2.close(); op2.displayDetails();

		System.out.println("----------------");

		Opener op3 = new BottleOpener();
		op3.material="Plastic"; op3.brand="Generic"; op3.price=50;
		op3.open(); op3.close();

		System.out.println("----------------");

		Opener op4 = new BottleOpener();
		op4.material="Wood"; op4.brand="Handmade"; op4.price=80;
		op4.open(); op4.close();

		System.out.println("----------------");

		Opener op5 = new Opener();
		op5.material="Steel"; op5.brand="Basic"; op5.price=60;
		op5.open(); op5.close();

		System.out.println("----------------");

		Opener op6 = new Opener();
		op6.material="Aluminium"; op6.brand="Lite"; op6.price=70;
		op6.open(); op6.close();

		System.out.println("==========");

		// FACTORY
		CarFactory f1 = new CarFactory();
		f1.name="Tata"; f1.location="India"; f1.workers=2000;
		f1.carBrand="Nexon"; f1.carsPerDay=300; f1.automation=true; f1.manager="Ramesh"; f1.shift="Day";
		f1.produce(); f1.maintain(); f1.displayDetails();

		System.out.println("----------------");

		CarFactory f2 = new CarFactory();
		f2.name="Mahindra"; f2.location="India"; f2.workers=2500;
		f2.carBrand="XUV"; f2.carsPerDay=350; f2.automation=true; f2.manager="Suresh"; f2.shift="Night";
		f2.produce(); f2.maintain(); f2.displayDetails();

		System.out.println("----------------");

		Factory f3 = new CarFactory();
		f3.name="Honda"; f3.location="Japan"; f3.workers=1500;
		f3.produce(); f3.maintain();

		System.out.println("----------------");

		Factory f4 = new CarFactory();
		f4.name="Toyota"; f4.location="Japan"; f4.workers=1800;
		f4.produce(); f4.maintain();

		System.out.println("----------------");

		Factory f5 = new Factory();
		f5.name="LocalFactory"; f5.location="India"; f5.workers=500;
		f5.produce(); f5.maintain();

		System.out.println("----------------");

		Factory f6 = new Factory();
		f6.name="MiniFactory"; f6.location="India"; f6.workers=300;
		f6.produce(); f6.maintain();

		System.out.println("==========");

		//  MEDIA 
		SocialMedia m1 = new SocialMedia();
		m1.type="Online"; m1.platform="Mobile"; m1.users=1000000;
		m1.app="Instagram"; m1.followers=50000; m1.verified=true; m1.owner="Meta"; m1.posts=200;
		m1.publish(); m1.stream(); m1.displayDetails();

		System.out.println("----------------");

		SocialMedia m2 = new SocialMedia();
		m2.type="Online"; m2.platform="Web"; m2.users=2000000;
		m2.app="YouTube"; m2.followers=100000; m2.verified=true; m2.owner="Google"; m2.posts=500;
		m2.publish(); m2.stream(); m2.displayDetails();

		System.out.println("----------------");

		Media m3 = new SocialMedia();
		m3.type="TV"; m3.platform="Cable"; m3.users=500000;
		m3.publish(); m3.stream();

		System.out.println("----------------");

		Media m4 = new SocialMedia();
		m4.type="Radio"; m4.platform="FM"; m4.users=300000;
		m4.publish(); m4.stream();

		System.out.println("----------------");

		Media m5 = new Media();
		m5.type="Print"; m5.platform="Newspaper"; m5.users=100000;
		m5.publish(); m5.stream();

		System.out.println("----------------");

		Media m6 = new Media();
		m6.type="Magazine"; m6.platform="Print"; m6.users=80000;
		m6.publish(); m6.stream();

		System.out.println("==========");

		//  SLIDE 
		WaterSlide sl1 = new WaterSlide();
		sl1.type="Water"; sl1.height=20; sl1.material="Fiber";
		sl1.water=true; sl1.speed=60; sl1.color="Blue"; sl1.park="Wonderla"; sl1.length=100;
		sl1.climb(); sl1.slide(); sl1.displayDetails();

		System.out.println("----------------");

		WaterSlide sl2 = new WaterSlide();
		sl2.type="Dry"; sl2.height=15; sl2.material="Plastic";
		sl2.water=false; sl2.speed=40; sl2.color="Red"; sl2.park="FunWorld"; sl2.length=80;
		sl2.climb(); sl2.slide(); sl2.displayDetails();

		System.out.println("----------------");

		Slide sl3 = new WaterSlide();
		sl3.type="Mini"; sl3.height=10; sl3.material="Metal";
		sl3.climb(); sl3.slide();

		System.out.println("----------------");

		Slide sl4 = new WaterSlide();
		sl4.type="Kids"; sl4.height=8; sl4.material="Plastic";
		sl4.climb(); sl4.slide();

		System.out.println("----------------");

		Slide sl5 = new Slide();
		sl5.type="Basic"; sl5.height=5; sl5.material="Wood";
		sl5.climb(); sl5.slide();

		System.out.println("----------------");

		Slide sl6 = new Slide();
		sl6.type="Park"; sl6.height=6; sl6.material="Metal";
		sl6.climb(); sl6.slide();

		System.out.println("==========");

		// CARRIER 
		GoodsCarrier cr1 = new GoodsCarrier();
		cr1.type="Truck"; cr1.capacity=10000; cr1.route="City";
		cr1.goods="Food"; cr1.trucks=10; cr1.refrigerated=true; cr1.company="ABC"; cr1.distance=500;
		cr1.load(); cr1.transport(); cr1.displayDetails();

		System.out.println("----------------");

		GoodsCarrier cr2 = new GoodsCarrier();
		cr2.type="Ship"; cr2.capacity=50000; cr2.route="International";
		cr2.goods="Oil"; cr2.trucks=5; cr2.refrigerated=false; cr2.company="XYZ"; cr2.distance=2000;
		cr2.load(); cr2.transport(); cr2.displayDetails();

		System.out.println("----------------");

		Carrier cr3 = new GoodsCarrier();
		cr3.type="Rail"; cr3.capacity=20000; cr3.route="State";
		cr3.load(); cr3.transport();

		System.out.println("----------------");

		Carrier cr4 = new GoodsCarrier();
		cr4.type="Air"; cr4.capacity=15000; cr4.route="Global";
		cr4.load(); cr4.transport();

		System.out.println("----------------");

		Carrier cr5 = new Carrier();
		cr5.type="Mini"; cr5.capacity=5000; cr5.route="Local";
		cr5.load(); cr5.transport();

		System.out.println("----------------");

		Carrier cr6 = new Carrier();
		cr6.type="Van"; cr6.capacity=3000; cr6.route="City";
		cr6.load(); cr6.transport();

		System.out.println("==========");

		//  INSTRUMENT
		MusicalInstrument i1 = new MusicalInstrument();
		i1.name="Guitar"; i1.type="String"; i1.price=5000;
		i1.brand="Yamaha"; i1.strings=6; i1.electric=true; i1.color="Black"; i1.weight=3;
		i1.play(); i1.tune(); i1.displayDetails();

		System.out.println("----------------");

		MusicalInstrument i2 = new MusicalInstrument();
		i2.name="Piano"; i2.type="Keyboard"; i2.price=20000;
		i2.brand="Casio"; i2.strings=0; i2.electric=true; i2.color="White"; i2.weight=20;
		i2.play(); i2.tune(); i2.displayDetails();

		System.out.println("----------------");

		Instrument i3 = new MusicalInstrument();
		i3.name="Violin"; i3.type="String"; i3.price=7000;
		i3.play(); i3.tune();

		System.out.println("----------------");

		Instrument i4 = new MusicalInstrument();
		i4.name="Drum"; i4.type="Percussion"; i4.price=4000;
		i4.play(); i4.tune();

		System.out.println("----------------");

		Instrument i5 = new Instrument();
		i5.name="Flute"; i5.type="Wind"; i5.price=1000;
		i5.play(); i5.tune();

		System.out.println("----------------");

		Instrument i6 = new Instrument();
		i6.name="Tabla"; i6.type="Percussion"; i6.price=3000;
		i6.play(); i6.tune();


       

    }
}