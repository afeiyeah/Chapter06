package extendsdemo;
//WarShip继承自Ship
//Ship类称为父类，Warship类称为子类
public class WarShip extends Ship {
	//WalShip的特有属性weapon
	private String weapon;
	//WalShip继承了Ship的全部属性和方法，但是私有属性无法直接访问，只能通过构造器或方法间接访问
	public WarShip(String name, int weight,String type,String weapon){
		//super代表父类的构造器
		//super()代表父类构造器
		super(name, weight,type);
		this.weapon=weapon;
	}
	//WalShip特有的方法：战斗
	public void fight(){
		System.out.println(getName()+"正在使用"+weapon+"攻击敌人");
	}
	//方法重写
	public void drive(){
		System.out.println(getName()+"可以一边航行一边战斗");
	}
	
}
