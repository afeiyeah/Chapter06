package extendsdemo04;

public class DB3000 extends DB2000 {

	public DB3000(String version) {
		super(version);
		// TODO Auto-generated constructor stub
	}
	public void query(){
		super.query();
		System.out.println(getVersion()+"可以执行子查询");
	}

}
