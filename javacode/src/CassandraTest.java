
public class CassandraTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		String db_name = "test_cassandra";
		
		
		DBProxy db = new CassandraProxy();
		db.connect("");
		
		db.createDB(db_name);
		db.createTable(db_name, "Employes");
		System.out.println("exit");
	}
}
