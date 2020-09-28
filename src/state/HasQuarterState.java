package state;

public class HasQuarterState implements State{
	
	private GumballStateMachine gumballMachine;
	
	public HasQuarterState(GumballStateMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public String insertQuarter() {
		String result = "You can't insert another quarter.";
		
		System.out.println(result);
		
		return result;
	}

	@Override
	public String ejectQuarter() {
		String result = "Quarter ejected.";
		
		System.out.println(result);
		gumballMachine.setState(gumballMachine.getNoQuarterState());
		
		return result;
	}

	@Override
	public String turnCrank() {
		String result = "You turned the crank...";
		
		System.out.println(result);
		gumballMachine.setState(gumballMachine.getSoldState());
		
		return result;
	}

	@Override
	public String dispense() {
		String result = "No gumball dispensed.";
		
		System.out.println(result);
		
		return result;
	}

}
