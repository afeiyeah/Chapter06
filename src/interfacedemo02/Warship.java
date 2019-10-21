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
		System.out.println(getName()+"ʹ��"+getWeapon()+"ս��");

	}

	@Override
	public void scann() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"��ɨ��");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("ս������ʻ");

	}
	@Override
	public void rise() {
		// TODO Auto-generated method stub
		System.out.println("���Դ��طɻ�");
	}

}
