package finaldemo;

//The type Cat cannot subclass the final class Animal
public class Cat extends Animal {
	private final int weight=10;//������һ����static
	public void play(){
		System.out.println("è����д������ı��ݷ���");
	}
}
