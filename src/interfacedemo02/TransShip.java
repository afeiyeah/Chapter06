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
		System.out.println("����ͨ���״ﶨλ");

	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("�������ȶ���ʻ");
	}
	public void showInfo(){
		super.showInfo();
		System.out.println("�ô��Ĳ�λΪ"+getSpace());
	}
	@Override
	public void rise() {
		// TODO Auto-generated method stub
		System.out.println("�����Դ��طɻ�");
	}

}
