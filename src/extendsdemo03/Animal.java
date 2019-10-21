package extendsdemo03;

public class Animal {
	//声明一个动物类，有属性name，另一个属性type，还有一个方法play,和输出动物信息的方法
	private String name;
	private String type;
	
	public Animal(String name, String type){
		this.name=name;
		this.type=type;
	}
	public String getName(){
		return name;
	}
	public String getType(){
		return type;
	}
	public void setName(){
		this.name=name;
	}
	public void setType(){
		this.type=type;
	}
	public void play(){
		System.out.println("动物可以玩耍");
	}
	public void showInfo(){
		System.out.println(getName()+"是"+getType()+"类动物");
	}
}
