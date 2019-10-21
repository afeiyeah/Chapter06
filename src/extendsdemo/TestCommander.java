package extendsdemo;

public class TestCommander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commander c=new Commander();
		//两种方法结果相同
//		WarShip s=new WarShip("致远",5000,"巡洋舰","火炮");
//		c.check(s);
//		Submarine r=new Submarine("明级",6000,"核潜艇","主动声呐");
//		c.check(r);
		//向上转型：父类 对象名=new 子类构造器
		Ship s=new WarShip("致远",5000,"巡洋舰","火炮");
		c.check(s);
		s=new Submarine("明级",6000,"核潜艇","主动声呐");
		c.check(s);
		//多态：1.继承2.子类重新父类的方法3.需要向上转型，在不同时间点父类对象指向不同子类
		//4.第三方磊的方法在不同时间点调用父类对象作为方法运行的输入参数，从而带来不同的运行效果
		//子类对象向上转型后，不能再调用子类特有方法，只能调用从父类里继承的方法（包括被子类重写的方法）
		//应用于软件升级

	}

}
