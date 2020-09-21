package strategy;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public String display() {		
		String result = "Looks like a model duck";
		
		System.out.println(result);
		
		return result;
	}

}
