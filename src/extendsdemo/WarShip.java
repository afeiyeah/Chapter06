package extendsdemo;
//WarShip�̳���Ship
//Ship���Ϊ���࣬Warship���Ϊ����
public class WarShip extends Ship {
	//WalShip����������weapon
	private String weapon;
	//WalShip�̳���Ship��ȫ�����Ժͷ���������˽�������޷�ֱ�ӷ��ʣ�ֻ��ͨ���������򷽷���ӷ���
	public WarShip(String name, int weight,String type,String weapon){
		//super������Ĺ�����
		//super()�����๹����
		super(name, weight,type);
		this.weapon=weapon;
	}
	//WalShip���еķ�����ս��
	public void fight(){
		System.out.println(getName()+"����ʹ��"+weapon+"��������");
	}
	//������д
	public void drive(){
		System.out.println(getName()+"����һ�ߺ���һ��ս��");
	}
	
}
