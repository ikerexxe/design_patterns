package command;

public class Fan {
	
	private String name;
	
	public Fan(String name) {
		this.name = name;
	}
	
	public String on() {
		String action = name + " fan switched on";
		
		System.out.println(action);
		
		return action;
	}
	
	public String off() {
		String action = name + " fan switched off";
		
		System.out.println(action);
		
		return action;
	}

}
