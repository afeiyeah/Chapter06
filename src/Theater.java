
public class Theater {
	//有一个write接口的属性w
	private Write w;
	
	public Write getW(){
		return w;
	}
	public void setW(Write w){
		this.w=w;
	}
	
	//还有一个表演方法，通过该方法调用接口的edit方法
	public void play(){
		w.edit();
		//运算符instanceof+子类 
		if(w instanceof Person){
			Person p=(Person)w;
			p.eat();
		}
		else if(w instanceof Robot){
			Robot r=(Robot)w;
			r.charge();
		}
		else{
			System.out.println("w既不是人也不是机器人");
		}
		
	}

	

}
