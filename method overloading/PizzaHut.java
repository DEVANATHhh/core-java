 class PizzaHut {

    
    static void order(String item) {
        System.out.println("Ordered: " + item);
		
		if(item==null){
		        System.out.println("The data is invalid ! " );
				return;
	}
    }

    
    static void order(String item, int quantity) {
        System.out.println("Ordered: " + item + ", Quantity: " + quantity);
		
		if(item==null){
		        System.out.println("The data is invalid ! " );
				return;
	}
		
		if(quantity<=0){
		        System.out.println("The data is invalid ! " );
				return;
	}
    }

    
	static void order(String item, int quantity, String addons) {
        System.out.println("Ordered: " + item +", Quantity: " + quantity +", Addons: " + addons);
		
		if(item==null){
		        System.out.println("The data is invalid ! " );
				return;
	}
		
		if(quantity<=0){
		        System.out.println("The data is invalid ! " );
				return;
	}
	
	
		System.out.println("The data is invalid ! " );
    }
}
