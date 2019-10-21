package abstractdemo01;

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		Shape s=new Rectangle('R',200,100);
		c.showInfo(s);
		s=new Circle('B',100);
		c.showInfo(s);
	}

}
