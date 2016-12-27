
public class CassandraTest {
	
	public static void main(String[] args) {
		DBProxy db = new CassandraProxy();
		db.connect("aaa");
	}
}
