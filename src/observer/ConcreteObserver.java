package observer;

public class ConcreteObserver implements Observer{
	
	int id;
	boolean notified = false;
	
	public ConcreteObserver(int id) {
		this.id = id;
	}

	@Override
	public void update() {
		notified = true;
		System.out.println("Observer " + id + " has been notified");
	}
	
	public boolean isNotified() {
		return notified;
	}

}
