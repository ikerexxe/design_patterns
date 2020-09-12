package template_method;

public class Coffee extends CaffeineBeverage{
	
	@Override
	public String brew() {
		return ", brewing coffee grinds";
	}
	
	@Override
	public String addCondiments() {
		return ", adding sugar and milk";
	}

}
