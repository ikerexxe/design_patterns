package command;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
	
	private Map <String, Command> onCommands = new HashMap<String, Command>();
	private Map <String, Command> offCommands = new HashMap<String, Command>();
	
	public void setCommand(String name, Command onCommand, Command offCommand) {
		onCommands.put(name, onCommand);
		offCommands.put(name, offCommand);
	}
	
	public String onButtonIsPushed(String name) {
		return onCommands.get(name).execute();
	}
	
	public String offButtonIsPushed(String name) {
		return offCommands.get(name).execute();
	}

}
