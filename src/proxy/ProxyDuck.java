package proxy;

public class ProxyDuck implements Duck{
	
	Duck realDuck;
	
	public ProxyDuck(Duck realDuck) {
		this.realDuck = realDuck;
	}

	@Override
	public String quack() {
		String result = "This is a proxy, redirecting to real duck: ";
		
		result += realDuck.quack();
		System.out.println(result);
		
		return result;
	}

}
