package component;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMenuComponent {
	
	MenuComponent normalPancake;
	MenuComponent pancakeHouseMenu;
	
	@BeforeEach
	void givenBasicMenuIsFilled() {
		normalPancake = new MenuItem("normal pancake", "Just pancake", true, 1.0);
		pancakeHouseMenu = new Menu("Pancake house menu", "Breakfast");
		
		pancakeHouseMenu.add(normalPancake);
	}

	@Test
	void whenMenuItemIsAsked_thenMenuItemIsShown() {
		String actualResult = normalPancake.print();
		String expectedResult = "normal pancake";
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void whenMenuIsAsked_thenMenuIsShown() {
		String actualResult = pancakeHouseMenu.print();
		String expectedResult = "Pancake house menu: normal pancake";
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void whenNormalPancakeIsRemoved_thenMenuIsEmpty() {
		String actualResult = pancakeHouseMenu.print();
		String expectedResult = "Pancake house menu";
		
		pancakeHouseMenu.remove(normalPancake);
		actualResult = pancakeHouseMenu.print();
		
		assertEquals(expectedResult, actualResult);
	}

}
