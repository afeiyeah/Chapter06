package interfacedemo02;

public class TestShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ship s =new Warship("�����",5000,"Ѳ��","����");
		//���ôӸ���̳еķ��������ǲ���ֱ�ӵ������Խӿڵķ���
		s.drive();
		s.showInfo();
		if(s instanceof Warship){
			Warship ws=(Warship)s;
			ws.attack();
			ws.scann();
		}
		
		s=new TransShip("̩̹",8000,"���䴬",1000);
		s.drive();
		s.showInfo();
		if(s instanceof TransShip){
			TransShip ts=(TransShip)s;
			ts.scann();
		}
		

	}

}
