package interfacedemo02;

public class Warship extends Ship implements Randar, Fight {
	private String weapon;

	public Warship(String name, int weight, String type,String weapon) {
		super(name, weight, type);
		// TODO Auto-generated constructor stub
		this.weapon=weapon;
	}
	public String getWeapon(){
		return weapon;
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"使用"+getWeapon()+"战斗");

	}

	@Override
	public void scann() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"在扫描");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("战舰在行驶");

	}
	@Override
	public void rise() {
		// TODO Auto-generated method stub
		System.out.println("可以搭载飞机");
	}

}
