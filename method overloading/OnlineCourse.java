 class OnlineCourse {

    
   static void enroll(String courseName) {
        System.out.println("Enrolled in course: " + courseName);
		
		if(courseName==null){
		        System.out.println("The data is invalid ! " );
				return;
	}
    }

    static void enroll(String courseName, int durationWeeks) {
        System.out.println("Enrolled in course: " + courseName +" for " + durationWeeks + " weeks.");
		
		if(courseName==null){
		        System.out.println("The data is invalid ! " );
				return;
	}
	
	if(durationWeeks<=1){
		        System.out.println("The data is invalid ! " );
				return;
	}
    }

    static void enroll(String courseName, int durationWeeks, String location) {
         System.out.println("Enrolled in course: " + courseName +" for " + durationWeeks + " weeks. The location is "+location);
		 
		 if(courseName==null){
		        System.out.println("The data is invalid ! " );
				return;
	}
	
	if(durationWeeks<=1){
		        System.out.println("The data is invalid ! " );
				return;
	}
	
	 if(location==null){
		        System.out.println("The data is invalid ! " );
				return;
	}
	
	System.out.println("The data is calid");
	
	
    }
}
