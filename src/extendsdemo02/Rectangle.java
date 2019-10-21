package extendsdemo02;

public class Rectangle extends Shape {
	//shape的子类矩形类
	//有两个特有属性，宽度和长度
	//该类还有一个算周长的特有方法，以及相应的读取器和设置器，和相应的构造器
	private int length;
	private int width;
	
	public Rectangle(String color,int length, int width){
		super(color);
		this.length=length;
		this.width=width;
	}
	public int getLength(){
		return length;
	}
	public int getWidth(){
		return width;
	}
	public void setLength(int length){
		this.length=length;
	}
	public void setWidth(int width){
		this.width=width;
	}
	public int calPer(){
		int per=2*(length+width);
		return per;
	}
	public void showInfo(){
		System.out.println("矩形的长为"+getLength());
		System.out.println("矩形的宽为"+getWidth());
		System.out.println("矩形的周长是"+calPer());
	}
}
