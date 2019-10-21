package extendsdemo04;

public class TestUser {
	public static void main(String [] args){
		User u=new User();
		DataBase db=new DB2000("2.0");
		u.useDB(db);
		System.out.println("过了一年用户的数据库升级到DB3000");
		db=new DB3000("3.0");
		u.useDB(db);
	}

}
