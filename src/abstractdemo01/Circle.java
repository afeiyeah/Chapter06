package abstractdemo01;

public class Circle extends Shape {
	private int radius;
	public static double pi=3.14;
	public Circle(char color, int radius) {
		//super必须在第一句
		super(color);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}
	public int getRadius(){
		return radius;
	}
	public void setRadius(int radius){
		this.radius=radius;
	}

	@Override
	public double calPer() {
		// TODO Auto-generated method stub
		double per=2*pi*radius;
		return per;
	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		double area=pi*radius*radius;
		return area;
	}
	public void showInfo(){
		System.out.println("圆形的半径是"+radius);
		System.out.println("圆形的周长是"+calPer());
		System.out.println("圆形的面积是"+calArea());
		super.showInfo();
	}

}
