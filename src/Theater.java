
public class Theater {
	//��һ��write�ӿڵ�����w
	private Write w;
	
	public Write getW(){
		return w;
	}
	public void setW(Write w){
		this.w=w;
	}
	
	//����һ�����ݷ�����ͨ���÷������ýӿڵ�edit����
	public void play(){
		w.edit();
		//�����instanceof+���� 
		if(w instanceof Person){
			Person p=(Person)w;
			p.eat();
		}
		else if(w instanceof Robot){
			Robot r=(Robot)w;
			r.charge();
		}
		else{
			System.out.println("w�Ȳ�����Ҳ���ǻ�����");
		}
		
	}

	

}
