package abstract_factory;

public class NYPizzaStore extends PizzaStore{
	
	public NYPizzaStore() {
		pizzaIngredientFactory = new NYPizzaIngredientFactory();
	}

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new CheesePizza(pizzaIngredientFactory);
		}
		else {
			throw new NullPointerException("Pizza doesn't exist");
		}
		
		pizza.prepare();
		
		return pizza;
	}

}
