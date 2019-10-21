package abstractdemo01;

public class Rectangle extends Shape {
	
	private int length;
	private int width;
	
	public Rectangle(char color,int length, int width) {
		super(color);
		// TODO Auto-generated constructor stub
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

	@Override
	public double calPer() {
		// TODO Auto-generated method stub
		double per=2*(length+width);
		return per;
	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		double area=length*width;
		return area;
	}
	public void showInfo(){
		System.out.println("���εĳ�����"+length);
		System.out.println("���εĿ����"+width);
		System.out.println("�ܳ���"+calPer());
		System.out.println("�����"+calArea());
		super.showInfo();
	}

}
