package abstractdemo01;

public abstract class Shape {
	//��������������һ���������У����ԡ�������������
	//�������еķ����ֳɾ��巽���ͳ��󷽷�
	//���巽���Ǹ�����̳��ã��涨���������඼Ӧ���еķ�����ʵ�ַ�ʽ��ͬ
	//���󷽷�Ҳ������Ӧ�еķ�������������ʵ�ַ�ʽ��ͬ
	//����������й����������ǳ����౾����ֱ�ӵ����γ���Ӧ����
	//������Ĺ������Ǹ�������õģ�������������á�Ŀ�����ڰ�̳��Գ������˽�����Ը�ֵ
	private char color;
	//�����๹����
	public Shape(char color){
		this.color=color;
	}
	//��������巽��
	public char getColor(){
		return color;
	}
	public void setColor(char color){
		this.color=color;
	}
	//���巽�������ͼ����Ϣ
	public void showInfo(){
		System.out.println("��ɫ��"+color);
	}
	//���󷽷�:��abstract�ؼ������Σ�û�з����壬�������󲻼�{}
	//�����ܳ��ĳ��󷽷�
	public abstract double calPer();
	//��������ĳ��󷽷�
	public abstract double calArea();
	

}
