package state;

public class NoQuarterState implements State{
	
	private GumballStateMachine gumballMachine;
	
	public NoQuarterState(GumballStateMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public String insertQuarter() {
		String result = "You inserted a quarter.";
		
		System.out.println(result);
		gumballMachine.setState(gumballMachine.getHasQuarterState());
		
		return result;
	}

	@Override
	public String ejectQuarter() {
		String result = "You haven't inserted a quarter.";
		
		System.out.println(result);
		
		return result;
	}

	@Override
	public String turnCrank() {
		String result = "You turned the crank, but there's no quarter.";
		
		System.out.println(result);
		
		return result;
	}

	@Override
	public String dispense() {
		String result = "You need to pay.";
		
		System.out.println(result);
		
		return result;
	}

}
