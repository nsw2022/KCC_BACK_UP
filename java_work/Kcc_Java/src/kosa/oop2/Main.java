package kosa.oop2;

public class Main {
	
	public static void main(String[] args) {
		OrcaleDao orcalDao = new OrcaleDao();
		MySQLDao  mysqlDao = new MySQLDao();
		MyService service = new MyService(new Dao() {
			
			@Override
			public void insert() {
				System.out.println("���� ���");
			}
		});
		service.insertService();
		
		
	}
	
}
