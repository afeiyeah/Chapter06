package finaldemo;

//The type Cat cannot subclass the final class Animal
public class Cat extends Animal {
	private final int weight=10;//常量不一定有static
	public void play(){
		System.out.println("猫类重写动物类的表演方法");
	}
}
