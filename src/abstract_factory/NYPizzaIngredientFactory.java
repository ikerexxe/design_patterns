package abstract_factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}
	
	@Override
	public Cheese createCheese() {
		return new CheddarCheese();
	}

}
