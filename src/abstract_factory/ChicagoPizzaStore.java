package abstract_factory;

public class ChicagoPizzaStore extends PizzaStore{
	
	public ChicagoPizzaStore() {
		pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
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
