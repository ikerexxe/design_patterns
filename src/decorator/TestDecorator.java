package decorator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDecorator {

	@Test
	void testHouseBlendDescription() {
		String description;
		Beverage houseBlend = new HouseBlend();
		
		description = houseBlend.getDescription();
		
		assertEquals("HouseBlend", description);
	}
	
	@Test
	void testDarkRoastDescription() {
		String description;
		Beverage darkRoast = new DarkRoast();
		
		description = darkRoast.getDescription();
		
		assertEquals("DarkRoast", description);
	}
	
	@Test
	void testEspressoPrice() {
		double price;
		Beverage espresso = new Espresso();
		
		price = espresso.cost();
		
		assertEquals(1.5, price);
	}
	
	@Test
	void testHouseBlendWithSoyDescription() {
		String description;
		Beverage houseBlend = new HouseBlend();
		Beverage houseBlendSoy = new Soy(houseBlend);
		
		description = houseBlendSoy.getDescription();
		
		assertEquals("HouseBlend, soy", description);
	}
	
	@Test
	void testDarkRoastWithMochaSoyCost() {
		double price;
		Beverage darkRoast = new DarkRoast();
		Beverage darkRoastMocha = new Mocha(darkRoast);
		Beverage darkRoastMochaSoy = new Soy(darkRoastMocha);
		
		price = darkRoastMochaSoy.cost();
		
		assertEquals(2.7, price);
	}

}
