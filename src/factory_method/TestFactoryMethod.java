package factory_method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFactoryMethod {

	@Test
	void testNYStyleCheesePizza() {
		PizzaStore pizzaStore = new NYPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("chesse");
		
		assertEquals("NYStyleCheesePizza", pizza.getDescription());
	}
	
	@Test
	void testNYStylePepperoniPizza() {
		PizzaStore pizzaStore = new NYPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("pepperoni");
		
		assertEquals("NYStylePepperoniPizza", pizza.getDescription());
	}
	
	@Test
	void testNonExistingPizza() {
		PizzaStore pizzaStore = new NYPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("NonExisting");
		
		assertNull(pizza);
	}
	
	@Test
	void testChicagoStyleClamPizza() {
		PizzaStore pizzaStore = new ChicagoPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("clam");
		
		assertEquals("ChicagoStyleClamPizza", pizza.getDescription());
	}

}
