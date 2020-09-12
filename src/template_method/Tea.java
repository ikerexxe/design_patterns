package template_method;

public class Tea extends CaffeineBeverage{
	
	@Override
	public String brew() {
		return ", steeping tea bag";
	}
	
	@Override
	public String addCondiments() {
		return ", adding lemon";
	}

}
