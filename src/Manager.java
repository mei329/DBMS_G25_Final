
public class Manager {
	private String[] info;
	
	public Manager(String[] info) {
		this.info = info;
	}
	
	public Manager(String id, String name, String psswrd) {
		info[0] = id;
		info[1] = name;
		info[2] = psswrd;
	}
	
	public String getId() {
		return info[0];
	}
	
	public String getName() {
		return info[1];
	}
	
	public String getPsswrd() {
		return info[2];
	}
}
