package extendsdemo;

public class Submarine extends Ship {
	private String sonar;
	public Submarine(String name, int weight,String type,String sonar){
		super(name,weight,type);
		this.sonar=sonar;
	}
	public void rise(){
		System.out.println(getName()+"���ϸ�ǰ������Ǳ����");
	}
	//��дship��̳еķ���
	public void drive(){
		System.out.println(getName()+"�ȿ�����ˮ��Ǳ����Ҳ������ˮ����ʻ");
	}
	public String getSonar(){
		return sonar;
	}
	public void setSonar(String sonar){
		this.sonar=sonar;
	}
}
