package extendsdemo;

public class TestCommander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commander c=new Commander();
		//���ַ��������ͬ
//		WarShip s=new WarShip("��Զ",5000,"Ѳ��","����");
//		c.check(s);
//		Submarine r=new Submarine("����",6000,"��Ǳͧ","��������");
//		c.check(r);
		//����ת�ͣ����� ������=new ���๹����
		Ship s=new WarShip("��Զ",5000,"Ѳ��","����");
		c.check(s);
		s=new Submarine("����",6000,"��Ǳͧ","��������");
		c.check(s);
		//��̬��1.�̳�2.�������¸���ķ���3.��Ҫ����ת�ͣ��ڲ�ͬʱ��㸸�����ָ��ͬ����
		//4.�������ڵķ����ڲ�ͬʱ�����ø��������Ϊ�������е�����������Ӷ�������ͬ������Ч��
		//�����������ת�ͺ󣬲����ٵ����������з�����ֻ�ܵ��ôӸ�����̳еķ�����������������д�ķ�����
		//Ӧ�����������

	}

}
