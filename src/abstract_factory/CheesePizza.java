package abstract_factory;

public class CheesePizza extends Pizza{
	
	PizzaIngredientFactory factory;

	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		factory = pizzaIngredientFactory;
	}

	public void prepare() {
		sauce = factory.createSauce();
		cheese = factory.createCheese();
	}

	@Override
	public String getSauce() {
		return sauce.getSauce();
	}

	@Override
	public String getCheese() {
		return cheese.getCheese();
	}

}
