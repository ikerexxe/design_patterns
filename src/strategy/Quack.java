package strategy;

public class Quack implements QuackBehavior{

	@Override
	public String quack() {
		String result = "Quack";
		
		System.out.println(result);
		
		return result;
	}

}
