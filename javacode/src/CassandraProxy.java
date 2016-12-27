import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class CassandraProxy extends DBProxy {
	Cluster cluster;
	Session session;
	
	
	public CassandraProxy() {
		cluster = Cluster.builder()
				.withClusterName("myCluster")
				.addContactPoint("localhost")
				.build();
	}
	@Override
	public boolean connect(String replicaName) {
		// Connect to the cluster and keyspace "demo"
		session = cluster.connect(replicaName);
		return false;
	}

	@Override
	public Object createDB(String dbName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object createTable(String dbName, String tbName, String columns) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object createTable(String dbName, String tbName) {
		// TODO Auto-generated method stub
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
