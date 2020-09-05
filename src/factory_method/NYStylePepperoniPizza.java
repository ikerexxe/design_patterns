package factory_method;

public class NYStylePepperoniPizza extends Pizza{
	
	public NYStylePepperoniPizza() {
		description = "NYStylePepperoniPizza";
	}
	
	@Override
	public void preparePizza() {
		System.out.println("Prepare " + description);
	}

	@Override
	public String getDescription() {
		return description;
	}

}
