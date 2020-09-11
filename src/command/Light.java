package command;

public class Light {
	
	private String name;
	
	public Light(String name) {
		this.name = name;
	}
	
	public String on() {
		String action = name + " light switched on";
		
		System.out.println(action);
		
		return action;
	}
	
	public String off() {
		String action = name + " light switched off";
		
		System.out.println(action);
		
		return action;
	}

}
