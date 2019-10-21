package interfacedemo02;

public class TestShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ship s =new Warship("重庆号",5000,"巡洋舰","火炮");
		//调用从父类继承的方法，但是不能直接调用来自接口的方法
		s.drive();
		s.showInfo();
		if(s instanceof Warship){
			Warship ws=(Warship)s;
			ws.attack();
			ws.scann();
		}
		
		s=new TransShip("泰坦",8000,"运输船",1000);
		s.drive();
		s.showInfo();
		if(s instanceof TransShip){
			TransShip ts=(TransShip)s;
			ts.scann();
		}
		

	}

}
