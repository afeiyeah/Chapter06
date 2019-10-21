package extendsdemo;

public class TestShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WarShip w=new WarShip("致远",4000,"巡洋舰","火炮");
		w.drive();
		w.fight();
		w.showInfo();
		
		System.out.println(w.getName()+"进行了改造");
		w.setWeight(6000);
		w.setName("定远");
		w.setType("铁甲舰");
		
		w.drive();
		w.fight();
		w.showInfo();
		
		Submarine s=new Submarine("明级",6000,"核潜艇","主动声呐");
		s.drive();
		s.rise();
		s.showInfo();
	}

}
