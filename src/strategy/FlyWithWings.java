package strategy;

public class FlyWithWings implements FlyBehavior{

	@Override
	public String fly() {
		String result = "Flying";
		
		System.out.println(result);
		
		return result;
	}

}
