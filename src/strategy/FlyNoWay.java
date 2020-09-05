package strategy;

public class FlyNoWay implements FlyBehavior{

	@Override
	public String fly() {
		String result = "I can't fly";
		
		System.out.println(result);
		
		return result;
	}

}
