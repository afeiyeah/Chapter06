package extendsdemo;

public class TestShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WarShip w=new WarShip("��Զ",4000,"Ѳ��","����");
		w.drive();
		w.fight();
		w.showInfo();
		
		System.out.println(w.getName()+"�����˸���");
		w.setWeight(6000);
		w.setName("��Զ");
		w.setType("���׽�");
		
		w.drive();
		w.fight();
		w.showInfo();
		
		Submarine s=new Submarine("����",6000,"��Ǳͧ","��������");
		s.drive();
		s.rise();
		s.showInfo();
	}

}
