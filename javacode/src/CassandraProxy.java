import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class CassandraProxy extends DBProxy {
	Cluster cluster;
	Session session;
	
	
	public CassandraProxy() throws ClassNotFoundException {
		Class.forName("org.apache.cassandra.cql.jdbc.CassandraDriver");
        
		
		cluster = Cluster.builder()
				.addContactPoint("127.0.0.1")
				.build();
	}
	@Override
	public boolean connect(String replicaName) {
		// Connect to the cluster and keyspace "demo"
		session = cluster.connect("test_cassandra");
		return false;	
	}

	@Override
	public Object createDB(String dbName) {
		
		String query = "CREATE KEYSPACE \""+ dbName +"\"" +
				"WITH replication = {'class': 'SimpleStrategy', 'replication_factor' : 1};";
		return session.execute(query);
	}

	@Override
	public Object createTable(String dbName, String tbName, String columns) {
		// TODO Auto-generated method stub
		String query = "CREATE TABLE " + dbName + "." + tbName + "(";
		
		String[] columns_arr = columns.split(" ");
		for (int i = 0; i < columns_arr.length; i++){
			String[] name_type = columns_arr[i].split(":");
			String name = name_type[0], type = name_type[1];
			
			query += name + " " + type + " ";
			if(i == 0)
				query += "PRIMARY KEY";
			if(i != columns_arr.length - 1)
				query += ",";
		}
		query += ");";
		
		return session.execute(query);
	}

	@Override
	public Object createTable(String dbName, String tbName) {
		// TODO Auto-generated method stub
		String query = "CREATE TABLE " + dbName + "." + tbName + "(";
		return null;		
	}

	@Override
	public Object createTable(String tbName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addTuple(String[] values) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rmTuple(String filter) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getContent(String dbName, String tbName) {
		// TODO Auto-generated method stub
		return null;
	}

}
