package extendsdemo02;

public class Rectangle extends Shape {
	//shape�����������
	//�������������ԣ���Ⱥͳ���
	//���໹��һ�����ܳ������з������Լ���Ӧ�Ķ�ȡ����������������Ӧ�Ĺ�����
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
		System.out.println("���εĳ�Ϊ"+getLength());
		System.out.println("���εĿ�Ϊ"+getWidth());
		System.out.println("���ε��ܳ���"+calPer());
	}
}
