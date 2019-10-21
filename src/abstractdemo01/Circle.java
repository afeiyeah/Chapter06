package abstractdemo01;

public class Circle extends Shape {
	private int radius;
	public static double pi=3.14;
	public Circle(char color, int radius) {
		//super�����ڵ�һ��
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
		System.out.println("Բ�εİ뾶��"+radius);
		System.out.println("Բ�ε��ܳ���"+calPer());
		System.out.println("Բ�ε������"+calArea());
		super.showInfo();
	}

}
