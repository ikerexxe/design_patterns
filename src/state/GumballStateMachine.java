package state;

public class GumballStateMachine {
	
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State soldOutState;
	
	private State state;
	private int count = 0;
	
	public GumballStateMachine(int numberGumballs) {
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		soldOutState = new SoldOutState(this);
		
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		} else {
			state = soldOutState;
		}
	}
	
	public String insertQuarter() {
		return state.insertQuarter();
	}
	
	public String ejectQuarter() {
		return state.ejectQuarter();
	}
	
	public String turnCrank() {
		String result;
		
		result = state.turnCrank() + " ";
		result += state.dispense();
		
		return result;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public String releaseBall() {
		String result = "A gumball comes rolling out of the slot...";
		
		System.out.println(result);
		if (count != 0) {
			count--;
		}
		
		return result;
	}
	
	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public State getSoldState() {
		return soldState;
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int numberGumballs) {
		count = numberGumballs;
		
		if (count > 0) {
			state = noQuarterState;
		} else {
			state = soldOutState;
		}
	}

}
