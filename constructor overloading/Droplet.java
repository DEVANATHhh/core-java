class Droplet{
	
	double volume;
    String color;
    double temperature;
    double weight;
    boolean isFalling;
	
	Droplet(){
		
	}
	
	Droplet(double volume,String color,double temperature,double weight,boolean isFalling){
		this.volume=volume;
		this.color=color;
		this.temperature=temperature;
		this.weight=weight;
		this.isFalling=isFalling;
	}
	
	Droplet(double volume,String color,double temperature,double weight){
		this.volume=volume;
		this.color=color;
		this.temperature=temperature;
		this.weight=weight;

		
	}
	
	Droplet(double volume,String color,double temperature){
		this.volume=volume;
		this.color=color;
		this.temperature=temperature;
	}
	
	Droplet(double volume,String color){
		this.volume=volume;
		this.color=color;
	}
	
	Droplet(double volume){
		this.volume=volume;
		
	}
	
	
	
	
	
	
}