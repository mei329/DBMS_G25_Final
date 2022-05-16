
public class Manager {
	public Manager() {
		
	}
	
	public void update(String db, String id, String attr, Object value) {
		String query = "UPDATE " + attr + " = '" + value + "' FROM " + db + " WHERE id = '" + id + "'";
	}
	
	public void add(String db, String values) {
		String query = "INSERT INTO " + db + " VALUES(" + values + ")" ;
	}
	
	public void del(String db, String id) {
		String query = "DELETE FROM " + db + "WHERE id = '" + id + "'";
	}
}
