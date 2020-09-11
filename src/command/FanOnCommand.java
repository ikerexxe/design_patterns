package command;

public class FanOnCommand implements Command{
	
	private Fan fan;
	
	public FanOnCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public String execute() {
		return fan.on();
	}

}
