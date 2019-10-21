package extendsdemo04;

public class DB2000 extends DataBase {
	public DB2000(String version){
		super(version);
	}
	public void query(){
		//使用super关键字，调用父类被重写之前的方法
		super.query();
		System.out.println(getVersion()+"可以执行多表查询");
	}
}
