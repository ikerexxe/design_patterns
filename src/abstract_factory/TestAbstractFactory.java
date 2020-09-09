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
	void whenChicagoStyleCheesePizzaIsOrdered_thenChicagoStyleCheesePizzaIsDelivered() {
		PizzaStore pizzaStore = new ChicagoPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("cheese");
		
		assertEquals("marinara", pizza.getSauce());
		assertEquals("mozzarella", pizza.getCheese());
	}

}
