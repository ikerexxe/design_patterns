package strategy;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
	}
	
	abstract String display();
	
	public String performFly() {
		return flyBehavior.fly();
	}
	
	public String performQuack() {
		return quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

}
