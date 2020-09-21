package observer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestConcreteObserver {
	
	Subject subject;
	List<Observer> observers;
	static int MAX_OBSERVERS = 2;
	
	@BeforeEach
	void givenSomeObserverAreRegistered() {
		subject = new ConcreteSubject();
		observers = new ArrayList<>();
		
		for(int i = 0; i <= MAX_OBSERVERS; i++) {
			observers.add(new ConcreteObserver(i));
			subject.registerObserver(observers.get(i));
		}
	}

	@Test
	void whenSubjectChanges_thenObserversAreNotified() {
		subject.notifyObservers();
		
		for(int i = 0; i <= MAX_OBSERVERS; i++) {
			boolean result = observers.get(i).isNotified();
			assertEquals(true, result);
		}
	}
	
	@Test
	void whenLastObserverIsRemovedAndSubjectChanges_thenObserversZeroAndOneAreNotified() {
		subject.removeObserver(observers.get(MAX_OBSERVERS));
		subject.notifyObservers();
		
		for(int i = 0; i <= MAX_OBSERVERS; i++) {
			boolean result = observers.get(i).isNotified();
			
			if (i != MAX_OBSERVERS) {
				assertEquals(true, result);
			} else {
				assertEquals(false, result);
			}
		}
	}

}
