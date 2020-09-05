package factory_method;

public abstract class PizzaStore {
	
	public abstract Pizza createPizza(String type);
	
	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		
		try {
			pizza = createPizza(type);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return pizza;
		}
		
		pizza.preparePizza();
		
		return pizza;
	}

}
