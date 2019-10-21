package interfacedemo01;

public class TestUSB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		USB u=new Keyboard();
		u.useUSB();
		u=new UDisc();
		u.useUSB();
		u=new Camera();
		u.useUSB();

	}

}
