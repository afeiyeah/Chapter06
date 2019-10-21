package interfacedemo02;

public abstract class Ship implements Fly{
	private String name;
	private int weight;
	private String type;
	
	public abstract void drive();
	
	public Ship(String name, int weight, String type){
		this.name=name;
		this.weight=weight;
		this.type=type;
	}
	public String getName(){
		return name;
	}
	public int getWeight(){
		return weight;
	}
	public String getType(){
		return type;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setWeight(int weight){
		this.weight=weight;
	}
	public void setType(String type){
		this.type=type;
	}
	
	
	public void showInfo(){
		System.out.println(name+"的吨位是"+weight+",用途是"+type);
		
	}

	public abstract void rise();

}
