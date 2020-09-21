package iterator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import component.Menu;
import component.MenuComponent;
import component.MenuItem;

class TestCompositeIterator {

	MenuComponent pancakeHouseMenu;
	
	@BeforeEach
	void givenMenusAreFilled() {
		pancakeHouseMenu = new Menu("Pancake house menu", "Breakfast");
		
		pancakeHouseMenu.add(new MenuItem("normal pancake", "Just pancake", true, 1.0));
		pancakeHouseMenu.add(new MenuItem("bacon pancake", "Best pancake", false, 2.5));
		pancakeHouseMenu.add(new MenuItem("blueberry pancake", "Blueberry pancake", true, 2.0));
	}
	
	@Test
	void whenPancakeMenuIsIterated_thenPancakeMenuIsShown() {
		String actualResult = "";
		String expectedResult = "normal pancake bacon pancake blueberry pancake ";
		Iterator<MenuComponent> iterator = pancakeHouseMenu.createIterator();
		
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			
			actualResult += menuComponent.print() + " ";
		}
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void whenPancakeMenuIsForced_thenPancakeMenuReturnsNull() {
		Object theEnd;
		Iterator<MenuComponent> iterator = pancakeHouseMenu.createIterator();
		
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			
			menuComponent.print();
		}
		
		theEnd = iterator.next();
		
		assertEquals(null, theEnd);
	}

}
