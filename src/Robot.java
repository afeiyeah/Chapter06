
public class Robot implements Write {
	//重写edit方法
	@Override
	public void edit() {
		// TODO Auto-generated method stub
		System.out.println("机器人使用电脑计算");
	}
	
	//robot有一个充电方法charge
	public void charge(){
		System.out.println("机器人通过充电补充能量");
	}

}
