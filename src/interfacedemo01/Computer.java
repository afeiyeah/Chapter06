package interfacedemo01;

public class Computer {
	//以接口USB类型变量作为computer类的属性
	//将来使用时，u会被初始化为USB接口的实现类的对象
	private USB u;
	
//	public Computer(USB u){
//		this.u=u;
//	}
	public void setU(USB u){
		this.u=u;
	}
	public void useDevice(){
		u.useUSB();
		//调用接口的默认方法
		u.changeVolt();
		//打印接口里的常量
		//System.out.println("USB设备的电流是"+u.flow);
	}
	

}
