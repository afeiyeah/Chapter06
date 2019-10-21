package abstractdemo01;

public abstract class Shape {
	//抽象类像其他类一样，可以有：属性、方法、构造器
	//抽象类中的方法分成具体方法和抽象方法
	//具体方法是给子类继承用，规定了所有子类都应该有的方法，实现方式相同
	//抽象方法也是子类应有的方法，但是子类实现方式不同
	//抽象类可以有构造器，但是抽象类本身不能直接调用形成相应对象
	//抽象类的构造器是给子类调用的，生成子类对象用。目的在于帮继承自抽象类的私有属性赋值
	private char color;
	//抽象类构造器
	public Shape(char color){
		this.color=color;
	}
	//抽象类具体方法
	public char getColor(){
		return color;
	}
	public void setColor(char color){
		this.color=color;
	}
	//具体方法：输出图形信息
	public void showInfo(){
		System.out.println("颜色是"+color);
	}
	//抽象方法:加abstract关键字修饰，没有方法体，即方法后不加{}
	//计算周长的抽象方法
	public abstract double calPer();
	//计算面积的抽象方法
	public abstract double calArea();
	

}
