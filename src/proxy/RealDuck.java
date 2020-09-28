package proxy;

public class RealDuck implements Duck{

	@Override
	public String quack() {
		String result = "Quack!";
		
		return result;
	}

}
