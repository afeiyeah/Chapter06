package extendsdemo04;

public class DB2000 extends DataBase {
	public DB2000(String version){
		super(version);
	}
	public void query(){
		//ʹ��super�ؼ��֣����ø��౻��д֮ǰ�ķ���
		super.query();
		System.out.println(getVersion()+"����ִ�ж���ѯ");
	}
}
