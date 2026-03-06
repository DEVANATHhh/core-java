 class  Payment{

    
   static void pay(String paymentMethod) {
        System.out.println("payment method is "+paymentMethod);
		if(paymentMethod==null){
		        System.out.println("The data is invalid ! " );
				return;
	}
    }

    
   static void pay(String paymentMethod, int amount) {
        System.out.println("payment method is "+paymentMethod+" amount is "+amount);
		
		if(paymentMethod==null){
		        System.out.println("The data is invalid ! " );
				return;
	}
	
		if(amount<=100){
		        System.out.println("The data is invalid ! " );
				return;
	}
	
	
		
    }

    
    static void pay(int amount, String paymentMethod) {
        System.out.println("amount paid is:" + amount + " using " + paymentMethod);
		
		if(amount<=100){
		        System.out.println("The data is invalid ! " );
				return;
	}
	
		if(paymentMethod==null){
		        System.out.println("The data is invalid ! " );
				return;
	}
	
	System.out.println("The datas are valid");
    }
}
