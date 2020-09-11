package observer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestConcreteObserver {
	
	static int MAX_OBSERVERS = 2;

	@Test
	void whenObserversAreRegistered_thenObserversAreNotified() {
		Subject subject = new ConcreteSubject();
		List<Observer> observers = new ArrayList<>();
		
		for(int i = 0; i <= MAX_OBSERVERS; i++) {
			observers.add(new ConcreteObserver(i));
			subject.registerObserver(observers.get(i));
		}
		
		subject.notifyObservers();
		
		for(int i = 0; i <= MAX_OBSERVERS; i++) {
			boolean result = observers.get(i).isNotified();
			assertEquals(true, result);
		}
	}

}
