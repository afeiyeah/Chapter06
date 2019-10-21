package interfacedemo01;

public class TestComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c=new Computer();
		USB u=new Keyboard();
		c.setU(u);
		c.useDevice();
		u=new Camera();
		c.setU(u);
		c.useDevice();
		u=new UDisc();
		c.setU(u);
		c.useDevice();

	}

}
