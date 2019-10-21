package interfacedemo01;

public interface USB {
	//接口当中的方法都是public和abstract修饰的方法
	//但是public和abstract默认被省略
	
	void useUSB();
	//JDK8.0以后，接口中可以有默认的具体方法
	default void changeVolt(){
		System.out.println("默认调整电压功能");
	}
	//接口里可以有常量
	//省略了关键字public、final、static
	double flow=5;
	//Java属于单继承。一个子类只能有一个父类。但是任何一个类都可以有多个接口
	

}
