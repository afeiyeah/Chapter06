package extendsdemo02;

public class Shape {
	//ͼ���࣬��һ�����ԣ���ɫ color
	//��������Ӧ�����Զ�ȡ���������������ι�������һ�������ɫ��Ϣ�ķ���
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
		System.out.println("��ɫ��"+getColor());
	}

}
