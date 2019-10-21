package interfacedemo02;

public class TransShip extends Ship implements Randar {
	private int space;

	public TransShip(String name, int weight, String type, int space) {
		super(name, weight, type);
		// TODO Auto-generated constructor stub
		this.space=space;
	}
	public int getSpace(){
		return space;
	}

	@Override
	public void scann() {
		// TODO Auto-generated method stub
		System.out.println("货船通过雷达定位");

	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("货船在稳定行驶");
	}
	public void showInfo(){
		super.showInfo();
		System.out.println("该船的仓位为"+getSpace());
	}
	@Override
	public void rise() {
		// TODO Auto-generated method stub
		System.out.println("不可以搭载飞机");
	}

}
