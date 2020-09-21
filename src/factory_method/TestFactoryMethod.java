package factory_method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFactoryMethod {

	@Test
	void whenNYStyleCheesePizzaIsOrdered_thenNYStyleCheesePizzaIsDelivered() {
		PizzaStore pizzaStore = new NYPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("cheese");
		
		assertEquals("NYStyleCheesePizza", pizza.getDescription());
	}
	
	@Test
	void whenNYStylePepperoniPizzaIsOrdered_thenNYStylePepperoniPizzaIsDelivered() {
		PizzaStore pizzaStore = new NYPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("pepperoni");
		
		assertEquals("NYStylePepperoniPizza", pizza.getDescription());
	}
	
	@Test
	void whenNYNonExistingPizzaIsOrdered_thenNYNoPizzaIsDelivered() {
		PizzaStore pizzaStore = new NYPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("NonExisting");
		
		assertNull(pizza);
	}
	
	@Test
	void whenChicagoStyleClamPizzaIsOrdered_thenChicagoStyleClamPizzaIsDelivered() {
		PizzaStore pizzaStore = new ChicagoPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("clam");
		
		assertEquals("ChicagoStyleClamPizza", pizza.getDescription());
	}
	
	@Test
	void whenChicagoNonExistingPizzaIsOrdered_thenChicagoNoPizzaIsDelivered() {
		PizzaStore pizzaStore = new ChicagoPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("NonExisting");
		
		assertNull(pizza);
	}

}
