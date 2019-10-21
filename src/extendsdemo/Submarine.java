package extendsdemo;

public class Submarine extends Ship {
	private String sonar;
	public Submarine(String name, int weight,String type,String sonar){
		super(name,weight,type);
		this.sonar=sonar;
	}
	public void rise(){
		System.out.println(getName()+"在上浮前先升起潜望镜");
	}
	//重写ship类继承的方法
	public void drive(){
		System.out.println(getName()+"既可以在水下潜航，也可以在水面行驶");
	}
	public String getSonar(){
		return sonar;
	}
	public void setSonar(String sonar){
		this.sonar=sonar;
	}
}
