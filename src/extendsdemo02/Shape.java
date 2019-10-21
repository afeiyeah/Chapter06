package extendsdemo02;

public class Shape {
	//图形类，有一个属性：颜色 color
	//该类有相应的属性读取器，设置器，带参构造器，一个输出颜色信息的方法
	private String color;
	public Shape(String color){
		this.color=color;
	}
	
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}
	public void showColor(){
		System.out.println("颜色是"+getColor());
	}

}
