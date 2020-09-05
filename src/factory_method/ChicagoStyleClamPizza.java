package factory_method;

public class ChicagoStyleClamPizza extends Pizza{
	
	public ChicagoStyleClamPizza() {
		description = "ChicagoStyleClamPizza";
	}
	
	@Override
	public void preparePizza() {
		System.out.println("Prepare " + description);
	}

	@Override
	public String getDescription() {
		return "ChicagoStyleClamPizza";
	}

}
