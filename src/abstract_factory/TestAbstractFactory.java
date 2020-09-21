package abstract_factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAbstractFactory {

	@Test
	void whenNYStyleCheesePizzaIsOrdered_thenNYStyleCheesePizzaIsDelivered() {
		PizzaStore pizzaStore = new NYPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("cheese");
		
		assertEquals("plum tomato", pizza.getSauce());
		assertEquals("cheddar", pizza.getCheese());
	}
	
	@Test
	void whenNYNonExistingPizzaIsOrdered_thenNYNoPizzaIsDelivered() {
		PizzaStore pizzaStore = new NYPizzaStore();
		NullPointerException e = assertThrows(NullPointerException.class,
				() -> pizzaStore.orderPizza("NonExisting"));
		
		assertTrue(e.getMessage().contains("Pizza doesn't exist"));
	}
	
	@Test
	void whenChicagoStyleCheesePizzaIsOrdered_thenChicagoStyleCheesePizzaIsDelivered() {
		PizzaStore pizzaStore = new ChicagoPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("cheese");
		
		assertEquals("marinara", pizza.getSauce());
		assertEquals("mozzarella", pizza.getCheese());
	}
	
	@Test
	void whenChicagoNonExistingPizzaIsOrdered_thenChicagoNoPizzaIsDelivered() {
		PizzaStore pizzaStore = new ChicagoPizzaStore();
		NullPointerException e = assertThrows(NullPointerException.class,
				() -> pizzaStore.orderPizza("NonExisting"));
		
		assertTrue(e.getMessage().contains("Pizza doesn't exist"));
	}

}
