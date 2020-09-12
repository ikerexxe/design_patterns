package template_method;

public abstract class CaffeineBeverage {
	
	public String prepareRecipe(String name) {
		String result;
		String resultBrew = brew();
		String resultBoil = boilWater();
		String resultPour = pourInCup();
		String resultAdd = addCondiments();
		
		result = "Preparing "+ name + resultBrew + resultBoil +
				 resultPour + resultAdd;
		
		System.out.println(result);
		
		return result;
	}
	
	public abstract String brew();
	public abstract String addCondiments();
	
	public String boilWater() {
		return ", boiling water";
	}
	
	public String pourInCup() {
		return ", pouring in cup";
	}

}
