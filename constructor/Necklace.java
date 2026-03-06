class Necklace
{
    String brand;
    String material;
    String color;
    double price;
    double weight;
    double length;
    String pendantType;
    String stoneType;
    int numberOfStones;
    String claspType;
    String design;
    String style;
    boolean isAdjustable;
    boolean isWaterproof;
    String occasion;
    String gender;
    String origin;
    String warranty;
    String collectionName;
    int stock;
	
	Necklace(String brand,String material,String color, double price,double weight,double length,
	String pendantType,String stoneType,int numberOfStones,String claspType,String design,
	String style,boolean isAdjustable,boolean isWaterproof,String occasion,String gender,
	String origin,String warranty,String collectionName,int stock)
	{
		this.brand=brand;
		this.material=material;
		this.color=color;
		this.price=price;
		this.weight=weight;
		this.length=length;
		this.pendantType=pendantType;
		this.stoneType=stoneType;
		this.numberOfStones=numberOfStones;
		this.claspType=claspType;
		this.design=design;
		this.style=style;
		this.isAdjustable=isAdjustable;
		this.isWaterproof=isWaterproof;
		this.occasion=occasion;
		this.gender=gender;
		this.origin=origin;
		this.warranty=warranty;
		this.collectionName=collectionName;
		this.stock=stock;
	}
}