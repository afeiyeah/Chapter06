package extendsdemo;

public class Commander {
	//方法重载：方法名一样，参数类型和个数不同
//	public void check(WarShip w){
//		w.drive();
//		w.fight();
//		w.showInfo();	
//	}
//	public void check(Submarine s){
//		s.drive();
//		s.rise();;
//		s.showInfo();
//		
//	}
	//多态
	public void check(Ship s){
		s.drive();
		s.showInfo();
	}
	
	
}
