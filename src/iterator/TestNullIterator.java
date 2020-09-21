package iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import component.MenuComponent;
import component.MenuItem;

public class TestNullIterator {
	
	MenuItem normalPancake;
	
	@BeforeEach
	void givenMenusAreFilled() {
		normalPancake = new MenuItem("normal pancake", "Just pancake", true, 1.0);
	}

	@Test
	void whenNormalPancakeIsForced_thenNormalPancakeReturnsNull() {
		Object theEnd;
		Iterator<MenuComponent> iterator = normalPancake.createIterator();
		
		theEnd = iterator.next();
		
		assertEquals(null, theEnd);
	}
	
	@Test
	void whenNormalPancakeIsRemoved_thenNormalPancakeThrowsException() {
		Iterator<MenuComponent> iterator = normalPancake.createIterator();
		
		UnsupportedOperationException e = assertThrows(UnsupportedOperationException.class,
				() -> iterator.remove());
		
		assertTrue(e.getMessage().contains("Cannot remove item from iterator"));
	}

}
