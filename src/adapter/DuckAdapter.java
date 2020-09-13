package adapter;

public class DuckAdapter implements Duck{
	
	TurkeyAdaptee adaptee = new TurkeyAdaptee();

	@Override
	public String request() {
		return adaptee.specificRequest();
	}

}
