package decorator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCondimentDecorator {

	@Test
	void whenHouseBlendIsCreated_thenHouseBlendIsDescribed() {
		String description;
		Beverage houseBlend = new HouseBlend();
		
		description = houseBlend.getDescription();
		
		assertEquals("HouseBlend", description);
	}
	
	@Test
	void whenDarkRoastWithMochaIsCreated_thenDarkRoastWithMochaIsDescribed() {
		String description;
		Beverage darkRoast = new DarkRoast();
		Beverage darkRoastMocha = new Mocha(darkRoast);
		
		description = darkRoastMocha.getDescription();
		
		assertEquals("DarkRoast, mocha", description);
	}
	
	@Test
	void whenEspressoIsCreated_thenEspressoIsCharged() {
		double price;
		Beverage espresso = new Espresso();
		
		price = espresso.cost();
		
		assertEquals(1.5, price);
	}
	
	@Test
	void whenHouseBlendWithSoyIsCreated_thenHouseBlendWithSoyIsDescribed() {
		String description;
		Beverage houseBlend = new HouseBlend();
		Beverage houseBlendSoy = new Soy(houseBlend);
		
		description = houseBlendSoy.getDescription();
		
		assertEquals("HouseBlend, soy", description);
	}
	
	@Test
	void whenHouseBlendIsCreated_thenHouseBlendIsCharged() {
		double price;
		Beverage houseBlend = new HouseBlend();
		
		price = houseBlend.cost();
		
		assertEquals(1.0, price);
	}
	
	@Test
	void whenDarkRoastMochaSoyIsCreated_thenDarkRoastMochaSoyIsCharged() {
		double price;
		Beverage darkRoast = new DarkRoast();
		Beverage darkRoastMocha = new Mocha(darkRoast);
		Beverage darkRoastMochaSoy = new Soy(darkRoastMocha);
		
		price = darkRoastMochaSoy.cost();
		
		assertEquals(2.7, price);
	}

}
