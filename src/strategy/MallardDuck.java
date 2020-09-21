package strategy;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public String display() {
		String result = "Looks like a mallard duck";
		
		System.out.println(result);
		
		return result;
	}

}
