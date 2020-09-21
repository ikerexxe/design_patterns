package strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDuck {

	@Test
	void whenMallardDuckIsCreated_thenFliesAndQuacks() {
		String displayResult, flyResult, quackResult;
		Duck mallardDuck = new MallardDuck();
		
		displayResult = mallardDuck.display();
		flyResult = mallardDuck.performFly();
		quackResult = mallardDuck.performQuack();
		
		assertEquals("Looks like a mallard duck", displayResult);
		assertEquals("Flying", flyResult);
		assertEquals("Quack", quackResult);
	}
	
	@Test
	void whenModelDuckIsCreated_thenCantFlyAndQuacks() {
		String displayResult, flyResult, quackResult;
		Duck modelDuck = new ModelDuck();
		
		displayResult = modelDuck.display();
		flyResult = modelDuck.performFly();
		quackResult = modelDuck.performQuack();
		
		assertEquals("Looks like a model duck", displayResult);
		assertEquals("I can't fly", flyResult);
		assertEquals("Quack", quackResult);
	}
	
	@Test
	void whenModelDuckIsCreatedAndBehaviorChanges_thenCantFlyAndFlies() {
		String originalFlyResult, changedFlyResult;
		String originalQuackResult, changedQuackResult;
		Duck modelDuck = new ModelDuck();
		
		originalFlyResult = modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyWithWings());
		changedFlyResult = modelDuck.performFly();
		
		originalQuackResult = modelDuck.performQuack();
		modelDuck.setQuackBehavior(new MuteQuack());
		changedQuackResult = modelDuck.performQuack();
		
		assertEquals("I can't fly", originalFlyResult);
		assertEquals("Flying", changedFlyResult);
		assertEquals("Quack", originalQuackResult);
		assertEquals("SILENCE", changedQuackResult);
	}

}
