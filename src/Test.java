
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theater t=new Theater();
		Write w=new Robot();
		t.setW(w);
		t.play();
		
		
//		Robot r=new Robot();
//		r.charge();
		
		w=new Person();
		t.setW(w);
		t.play();
//		Person p=new Person();
//		p.eat();
		

	}

}
