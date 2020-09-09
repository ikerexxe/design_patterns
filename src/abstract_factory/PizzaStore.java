package abstract_factory;

public abstract class PizzaStore {
	
	PizzaIngredientFactory pizzaIngredientFactory;
	
	public abstract Pizza createPizza(String type);
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		
		return pizza;
	}

}
