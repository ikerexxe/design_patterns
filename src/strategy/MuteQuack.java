package strategy;

public class MuteQuack implements QuackBehavior{

	@Override
	public String quack() {
		String result = "SILENCE";
		
		System.out.println(result);
		
		return result;
	}

}
