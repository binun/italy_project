
public abstract class DBProxy {
 
  protected int port = 3306;
  protected String username = "";
  protected String password = "";
  
  protected String replicaName;
  protected String startDB;
  
  protected Object lastDB;
  protected Object lastTable;
  
  protected String [] columns = {"id","surid"};
  protected String colType = "int";
  
  protected void setLast(Object ldb, Object lt) {
	  lastDB = ldb;
	  lastTable = lt;
  }
  
  
  public abstract boolean connect(String replicaName);
  public abstract Object createDB(String dbName);  
  public abstract Object createTable(String dbName, String tbName, String columns);
  public abstract Object createTable(String dbName, String tbName);
  public abstract Object createTable(String tbName);
  public abstract void addTuple(String [] values);
  public abstract void rmTuple(String filter);
  public abstract String getContent(String dbName, String tbName);
  
}
