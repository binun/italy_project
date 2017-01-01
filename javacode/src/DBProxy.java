
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
  
  /**
   * connect to the database driver.
   * @param replicaName the name/IP of some replica.
   * @return true if successfully connected, false otherwise.
   */
  public abstract boolean connect(String replicaName);
  
  
  /**
   * Create new instance of database in the replica.
   * @param dbName representing string of database name to be created.
   * @return true if successfully created, false otherwise.
   */
  public abstract Object createDB(String dbName);  
  
  /**
   * Create new table in database with columns definition.
   * @param dbName representing string of database name.
   * @param tbName representing string of table name to be created.
   * @param columns the definition of columns are made in that way ("name:type")+
   * @return true if successfully created, false otherwise.
   */
  public abstract Object createTable(String dbName, String tbName, String columns);
  
  /**
   * Create new table in database.
   * @param dbName representing string of database name.
   * @param tbName representing string of table name to be created.
   * @return true if successfully created, false otherwise.
   */
  public abstract Object createTable(String dbName, String tbName);
  
  /**
   * 
   * @param tbName
   * @return
   */
  public abstract Object createTable(String tbName);
  
  /**
   * 
   * @param values
   */
  public abstract void addTuple(String [] values);
  
  /**
   * 
   * @param filter
   */
  public abstract void rmTuple(String filter);
  
  /**
   * 
   * @param dbName
   * @param tbName
   * @return
   */
  public abstract String getContent(String dbName, String tbName);
  
}
