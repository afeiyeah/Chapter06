package extendsdemo04;

public class DataBase {
	private String version;
	public DataBase(String version){
		this.version=version;
	}
	String getVersion(){
		return version;
	}
	public void query(){
		System.out.println(version+"��ִ�м򵥲�ѯ");
	}
}
