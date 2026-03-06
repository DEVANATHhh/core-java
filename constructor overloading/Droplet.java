class Droplet{
	
	double volume;
    String color;
    double temperature;
    double weight;
    boolean isFalling;
	
	droplet(){
		
	}
	
	droplet(double volume,String color,double temperature,double weight,boolean isFalling){
		this.volume=volume;
		this.color=color;
		this.temperature=temperature;
		this.weight=weight;
		this.isFalling=isFalling;
	}
	
	droplet(double volume,String color,double temperature,double weight){
		this.volume=volume;
		this.color=color;
		this.temperature=temperature;
		this.weight=weight;

		
	}
	
	droplet(double volume,String color,double temperature){
		this.volume=volume;
		this.color=color;
		this.temperature=temperature;
	}
	
	droplet(double volume,String color){
		this.volume=volume;
		this.color=color;
	}
	
	droplet(double volume){
		this.volume=volume;
		
	}
	
	
	
	
	
	
}