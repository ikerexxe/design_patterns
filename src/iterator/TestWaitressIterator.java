package iterator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import component.Menu;
import component.MenuComponent;
import component.MenuItem;

class TestWaitressIterator {
	
	Waitress waitress;
	
	@BeforeEach
	void givenMenusAreFilled() {
		MenuComponent pancakeHouseMenu = new Menu("Pancake house menu", "Breakfast");
		MenuComponent dinerMenu = new Menu("Diner menu", "Dinner");
		MenuComponent allMenus = new Menu("All menus", "All menus");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		
		pancakeHouseMenu.add(new MenuItem("normal pancake", "Just pancake", true, 1.0));
		pancakeHouseMenu.add(new MenuItem("bacon pancake", "Best pancake", false, 2.5));
		pancakeHouseMenu.add(new MenuItem("blueberry pancake", "Blueberry pancake", true, 2.0));
		
		dinerMenu.add(new MenuItem("cheese pizza", "Just cheese pizza", true, 5.00));
		dinerMenu.add(new MenuItem("cheese burger", "Just cheese burger", false, 7.00));
		dinerMenu.add(new MenuItem("hotdog", "Just hotdog", false, 3.00));
		dinerMenu.add(new MenuItem("veggie burger", "Just veggie burger", true, 5.00));
		
		waitress = new Waitress(allMenus);
	}

	@Test
	void whenAllMenuAreAsked_thenAllMenuAreShown() {
		String actualResult = waitress.printMenu();
		String expectedResult = "All menus: "
				+ "Pancake house menu: normal pancake, bacon pancake, blueberry pancake, "
				+ "Diner menu: cheese pizza, cheese burger, hotdog, veggie burger";
		
		assertEquals(expectedResult, actualResult);
	}

}
