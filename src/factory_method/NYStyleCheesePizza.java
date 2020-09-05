package factory_method;

public class NYStyleCheesePizza extends Pizza{
	
	public NYStyleCheesePizza() {
		description = "NYStyleCheesePizza";
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
