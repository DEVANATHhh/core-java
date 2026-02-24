class Runner
{
	public static void main(String[] args)
	{
		Bangle bangle=new Bangle("Pink");
		
		Anklet anklet=new Anklet("Gold");
		
		Coffee coffee=new Coffee("cold cofffee",15);
		
		Ant ant=new Ant("Fire","red",12);
		
		Bucket bucket=new Bucket(15.5,"Blue","Plastic","Round",true);
		
		Jacket jacket=new Jacket("Puma","M","Black",2499.99,"Leather");
		
		Pocket pocket=new Pocket("Front","Left",5.5);
		
		Cricket cricket=new Cricket("T20","India","Australia","Rohit Sharma","Pat Cummins","Mumbai",
		"Kumar Dharmasena",20,8,180,10,181,6,5,"Virat Kohli","India","24-02-2026","Bilateral Series",
		true,"India Won!!!");
		
		Racket racket=new Racket("Yonex","Badminton",500,67,"Rubber","Carbon Fiber","Red",
		1500,"Nylon",true);
		
		Helmet helmet=new Helmet("Vega","L","Black");
		
		Blanket blanket=new Blanket("Cotton","King","Grey",1999,2.5,true);
		
		Bracelet bracelet=new Bracelet("Titan","Gold","Golden",50000,15,18,"Hook","Floral",true,"Diamond",
		5,"Glossy","Traditional",true,"Wedding","Female","India","2 years","Royal collection",10);
		
		Necklace nakelace=new Necklace("Tanishq","Gold","Golden",75000,24,25,"Heart","Ruby",3,
		"Hook","Modern","Party Wear",true,true,"Engagement","Female","India","3 years",
		"Love series",5);
		
		ShoeLace shoeLace=new ShoeLace("Nike","White",120,"Cotton","Plain",199,false,"flat","Medium",50);
		
		System.out.println("All Instances Created Successfully...");
		
	}
}