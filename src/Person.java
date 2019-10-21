
public class Person implements Write {
	//重写edit方法
	@Override
	public void edit() {
		// TODO Auto-generated method stub
		System.out.println("人类使用大脑计算");
	}
	
	//person类有一个吃饭方法eat
	public void eat(){
		System.out.println("人类通过吃饭补充能量");
	}
}
