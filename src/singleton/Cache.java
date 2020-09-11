package singleton;

public class Cache {
	
	private static Cache cache;
	
	private String name = null;
	
	private Cache() {
	}
	
	static Cache getInstance() {
		if(cache == null) {
			cache = new Cache();
		}
		
		return cache;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
