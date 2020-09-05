package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
	
	List<Observer> observers = new ArrayList<>();

	@Override
	public void registerObserver(Observer ob) {
		observers.add(ob);
	}

	@Override
	public void removeObserver(Observer ob) {
		observers.remove(ob);
	}

	@Override
	public void notifyObservers() {
		for(Observer ob : observers) {
			ob.update();
		}
	}

}
