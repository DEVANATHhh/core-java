class DocumentFile {
    String title;
    int pages;
	
	
	DocumentFile( String title,int pages){
		this.title=title;
		this.pages=pages;
	}
	
	void getInfo(){
		System.out.println("The title of the file is :"+this.title+" The no of pages :"+this.pages);
	}
}