package template_method;

public class DarkCoffee extends CaffeineBeverage{

	@Override
	public String brew() {
		return ", brewing coffee grinds";
	}

	@Override
	public String addCondiments() {
		return "";
	}

}
