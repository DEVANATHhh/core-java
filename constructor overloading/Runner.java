class Runner{

public static void main (String []args){


        Droplet droplet1 = new Droplet();
        Droplet droplet2 = new Droplet(10);
        Droplet droplet3 = new Droplet(10, "Blue");
        Droplet droplet4 = new Droplet(10, "Blue", 25);
        Droplet droplet5 = new Droplet(10, "Blue", 25, 5);
        Droplet droplet6 = new Droplet(10, "Blue", 25, 5, true);
		
	
System.out.println("Droplet info: " + droplet6.volume + " " + droplet6.color + " " + droplet6.temperature + "" + droplet6.weight + " " + droplet6.isFalling);
	
		
		
		Umbrella umbrella1 = new Umbrella();
        Umbrella umbrella2 = new Umbrella("Black");
        Umbrella umbrella3 = new Umbrella("Black", 5);
        Umbrella umbrella4 = new Umbrella("Black", 5, "Nylon");
        Umbrella umbrella5 = new Umbrella("Black", 5, "Nylon", true);
        Umbrella umbrella6 = new Umbrella("Black", 5, "Nylon", true, 2);
		
		System.out.println("Umbrella info: " + umbrella6.color + " " + umbrella6.radius + " " + umbrella6.material + "" + umbrella6.isOpen + " " + umbrella6.weight);
	
		
		

		
		Rain rain1 = new Rain();
        Rain rain2 = new Rain(50);
        Rain rain3 = new Rain(50, 2);
        Rain rain4 = new Rain(50, 2, "Heavy");
        Rain rain5 = new Rain(50, 2, "Heavy", 80);
        Rain rain6 = new Rain(50, 2, "Heavy", 80, true);
			System.out.println("Rain info: " + rain6.intensity + " " + rain6.duration + " " + rain6.type + "" + rain6.humidity + " " + rain6.isStorm);
			

			
		
		Snow snow1 = new Snow();
        Snow snow2 = new Snow(5);
        Snow snow3 = new Snow(5, "White");
        Snow snow4 = new Snow(5, "White", -2);
        Snow snow5 = new Snow(5, "White", -2, true);
        Snow snow6 = new Snow(5, "White", -2, true, "Himalaya");
		
		System.out.println("Snow info: " + snow6.thickness + " " + snow6.color + " " + snow6.temperature + "" + snow6.isMelting + " " + snow6.region);
		

		
		
		HairDryer hairDryer1 = new HairDryer();
        HairDryer hairDryer2 = new HairDryer("Philips");
        HairDryer hairDryer3 = new HairDryer("Philips", 1200);
        HairDryer hairDryer4 = new HairDryer("Philips", 1200, "Black");
        HairDryer hairDryer5 = new HairDryer("Philips", 1200, "Black", true);
        HairDryer hairDryer6 = new HairDryer("Philips", 1200, "Black", true, 2500);
		System.out.println("HairDryer info: " + hairDryer6.brand + " " + hairDryer6.power + " " + hairDryer6.color + "" + hairDryer6.isOn + " " + hairDryer6.price);
		

		
		
        Clip clip1 = new Clip();
        Clip clip2 = new Clip("Plastic");
        Clip clip3 = new Clip("Plastic", "Red");
        Clip clip4 = new Clip("Plastic", "Red", 5);
        Clip clip5 = new Clip("Plastic", "Red", 5, false);
        Clip clip6 = new Clip("Plastic", "Red", 5, false, 10);
		System.out.println("clip info: " + clip6.material + " " + clip6.color + " " + clip6.length + "" + clip6.isMetal + " " + clip6.price);
		
		

		
		ChessBoard chessBoard1 = new ChessBoard();
        ChessBoard chessBoard2 = new ChessBoard(8);
        ChessBoard chessBoard3 = new ChessBoard(8, 8);
        ChessBoard chessBoard4 = new ChessBoard(8, 8, "Wood");
        ChessBoard chessBoard5 = new ChessBoard(8, 8, "Wood", "BlackWhite");
        ChessBoard chessBoard6 = new ChessBoard(8, 8, "Wood", "BlackWhite", true);
		System.out.println("ChessBoard info: " + chessBoard6.rows + " " + chessBoard6.columns + " " + chessBoard6.material + "" + chessBoard6.colorPattern + " " + chessBoard6.isFoldable);
	
		
				
		
		Track track1 = new Track();
        Track track2 = new Track(400);
        Track track3 = new Track(400, "Synthetic");
        Track track4 = new Track(400, "Synthetic", 8);
        Track track5 = new Track(400, "Synthetic", 8, "Stadium");
        Track track6 = new Track(400, "Synthetic", 8, "Stadium", true);
		System.out.println("ticket info: " + track6.length + " " + track6.surfaceType + " " + track6.lanes + "" + track6.location + " " + track6.isIndoor);
		
	 

	

		
		Battery battery1 = new Battery();
        Battery battery2 = new Battery("Li-ion");
        Battery battery3 = new Battery("Li-ion", 12);
        Battery battery4 = new Battery("Li-ion", 12, 5000);
        Battery battery5 = new Battery("Li-ion", 12, 5000, true);
        Battery battery6 = new Battery("Li-ion", 12, 5000, true, 1.5);
		System.out.println("battery6 info: " + battery6.type + " " + battery6.voltage + " " + battery6.capacity + "" + battery6.isRechargeable + " " + battery6.weight);
		
	
	
		
		
		Pawn pawn1 = new Pawn();
        Pawn pawn2 = new Pawn("White");
        Pawn pawn3 = new Pawn("White", "Wooarrom");
        Pawn pawn4 = new Pawn("White", "Wood", 4);
        Pawn pawn5 = new Pawn("White", "Wood", 4, 0.2);
        Pawn pawn6 = new Pawn("White", "Wood", 4, 0.2, false);
		System.out.println("Pawn info: " + pawn6.color + " " + pawn6.material + " " + pawn6.height + "" + pawn6.weight + " " + pawn6.isCaptured);
		
	
		
			
		
		Carrom carrom1 = new Carrom();
        Carrom carrom2 = new Carrom("Wood");
        Carrom carrom3 = new Carrom("Wood", 4);
        Carrom carrom4 = new Carrom("Wood", 4, 29);
        Carrom carrom5 = new Carrom("Wood", 4, 29, true);
        Carrom carrom6 = new Carrom("Wood", 4, 29, true, "Plastic");
		System.out.println("Carrom info: " + carrom6.boardMaterial + " " + carrom6.players + " " + carrom6.boardSize + "" + carrom6.isIndoor + " " + carrom6.strikerType);
		
	
		

		
        Strawberry strawberry1 = new Strawberry();
        Strawberry strawberry2 = new Strawberry("Red");
        Strawberry strawberry3 = new Strawberry("Red", 20);
        Strawberry strawberry4 = new Strawberry("Red", 20, true);
        Strawberry strawberry5 = new Strawberry("Red", 20, true, "Sweet");
        Strawberry strawberry6 = new Strawberry("Red", 20, true, "Sweet", "India");
		System.out.println("Strawberry info: " + strawberry6.color + " " + strawberry6.weight + " " + strawberry6.isRipe + "" + strawberry6.taste + " " + strawberry6.origin);
		
		
    

		


}

}