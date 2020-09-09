package abstract_factory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
	
	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

}
