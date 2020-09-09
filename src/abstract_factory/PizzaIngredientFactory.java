package abstract_factory;

public interface PizzaIngredientFactory {
	
	public Sauce createSauce();
	public Cheese createCheese();

}
