
public class CassandraTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		DBProxy db = new CassandraProxy();
		db.connect("aaa");
	}
}
