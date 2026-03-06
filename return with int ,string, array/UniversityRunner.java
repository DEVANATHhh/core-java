class UniversityRunner{
public static void main (String [] args){

String [] courses=University.getCoursesByCollegeName("sdit");

if(courses!=null){
	
	for(int index=0;index<courses.length;index++){
		System.out.println(courses[index]);
		
	}

System.out.println("The courses provided are :"+courses);

}
else{
	System.out.println("The courses are null");
}
}
}