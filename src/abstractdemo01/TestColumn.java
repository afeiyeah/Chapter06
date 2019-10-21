package abstractdemo01;

public class TestColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Rectangle('B',100,20);
		Column c=new Column();
		c.setHeight(200);
		c.setShape(s);
		System.out.println(s);
		c.showInfo();

	}

}
