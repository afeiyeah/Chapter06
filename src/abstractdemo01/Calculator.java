package abstractdemo01;

public class Calculator {
	public void calPer(Shape s){
		System.out.println(s.calPer());
	}
	public void calArea(Shape s){
		System.out.println(s.calArea());
	}
	public void showInfo(Shape s){
		s.showInfo();
	}
}
