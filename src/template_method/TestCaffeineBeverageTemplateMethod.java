package template_method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCaffeineBeverageTemplateMethod {
	
	CaffeineBeverage beverage;

	@Test
	void whenCoffeeIsPrepared_thenCoffeeIsReturned() {
		String actualResult;
		String expectedResult = "Preparing coffee, brewing coffee grinds,"
				+ " boiling water, pouring in cup, adding sugar and milk";
		
		beverage = new Coffee();
		actualResult = beverage.prepareRecipe("coffee");
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void whenTeaIsPrepared_thenTeaIsReturned() {
		String actualResult;
		String expectedResult = "Preparing tea, steeping tea bag,"
				+ " boiling water, pouring in cup, adding lemon";
		
		beverage = new Tea();
		actualResult = beverage.prepareRecipe("tea");
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void whenDarkCoffeeIsPrepared_thenDarkCoffeeIsReturned() {
		String actualResult;
		String expectedResult = "Preparing coffee, brewing coffee grinds,"
				+ " boiling water, pouring in cup";
		
		beverage = new DarkCoffee();
		actualResult = beverage.prepareRecipe("coffee");
		
		assertEquals(expectedResult, actualResult);
	}

}
