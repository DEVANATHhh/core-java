 class OnlineCourse {

    
   static void enroll(String courseName) {
        System.out.println("Enrolled in course: " + courseName);
    }

    static void enroll(String courseName, int durationWeeks) {
        System.out.println("Enrolled in course: " + courseName +" for " + durationWeeks + " weeks.");
    }

    static void enroll(String courseName, int durationWeeks, String location) {
         System.out.println("Enrolled in course: " + courseName +" for " + durationWeeks + " weeks. The location is "+location);
    }
}
