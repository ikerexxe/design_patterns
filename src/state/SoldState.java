package state;

public class SoldState implements State{
	
private GumballStateMachine gumballMachine;
	
	public SoldState(GumballStateMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public String insertQuarter() {
		String result = "Please wait, we're already giving you a gumball.";
		
		System.out.println(result);
		
		return result;
	}

	@Override
	public String ejectQuarter() {
		String result = "Sorry, you already turned the crank.";
		
		System.out.println(result);
		
		return result;
	}

	@Override
	public String turnCrank() {
		String result = "Turning twice doesn't get you another gumball.";
		
		System.out.println(result);
		
		return result;
	}

	@Override
	public String dispense() {
		String result = gumballMachine.releaseBall();
		
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
		
		return result;
	}

}
