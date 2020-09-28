package state;

public class SoldOutState implements State{
	
	@SuppressWarnings("unused")
	private GumballStateMachine gumballMachine;
	
	public SoldOutState(GumballStateMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public String insertQuarter() {
		String result = "You inserted a quarter but nothing will happen.";
		
		System.out.println(result);
		
		return result;
	}

	@Override
	public String ejectQuarter() {
		String result = "You ejected a quarter but nothing will happen.";
		
		System.out.println(result);
		
		return result;
	}

	@Override
	public String turnCrank() {
		String result = "You turned the crank but nothing will happen.";
		
		System.out.println(result);
		
		return result;
	}

	@Override
	public String dispense() {
		String result = "The machine is empty nothing can be dispensed.";
		
		System.out.println(result);
		
		return result;
	}

}
