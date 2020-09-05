package factory_method;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("clam")) {
			pizza = new ChicagoStyleClamPizza();
		}
		else {
			throw new NullPointerException("Pizza doesn't exist");
		}
		
		return pizza;
	}

}
