package abstract_factory;

public abstract class Pizza {
	
	Sauce sauce;
	Cheese cheese;
	
	public abstract void prepare();
	public abstract String getSauce();
	public abstract String getCheese();

}
