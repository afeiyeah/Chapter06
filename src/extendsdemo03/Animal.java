package extendsdemo03;

public class Animal {
	//����һ�������࣬������name����һ������type������һ������play,�����������Ϣ�ķ���
	private String name;
	private String type;
	
	public Animal(String name, String type){
		this.name=name;
		this.type=type;
	}
	public String getName(){
		return name;
	}
	public String getType(){
		return type;
	}
	public void setName(){
		this.name=name;
	}
	public void setType(){
		this.type=type;
	}
	public void play(){
		System.out.println("���������ˣ");
	}
	public void showInfo(){
		System.out.println(getName()+"��"+getType()+"�ද��");
	}
}
