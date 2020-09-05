package strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDuck {

	@Test
	void whenMallardDuckIsCreated_thenFliesAndQuacks() {
		String flyResult, quackResult;
		Duck mallardDuck = new MallardDuck();
		
		flyResult = mallardDuck.performFly();
		quackResult = mallardDuck.performQuack();
		
		assertEquals("Flying", flyResult);
		assertEquals("Quack", quackResult);
	}
	
	@Test
	void whenModelDuckIsCreated_thenCantFlyAndQuacks() {
		String flyResult, quackResult;
		Duck modelDuck = new ModelDuck();
		
		flyResult = modelDuck.performFly();
		quackResult = modelDuck.performQuack();
		
		assertEquals("I can't fly", flyResult);
		assertEquals("Quack", quackResult);
	}
	
	@Test
	void whenModelDuckIsCreatedAndBehaviorChanges_thenCantFlyAndFlies() {
		String originalFlyResult, changedFlyResult;
		Duck modelDuck = new ModelDuck();
		
		originalFlyResult = modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyWithWings());
		changedFlyResult = modelDuck.performFly();
		
		assertEquals("I can't fly", originalFlyResult);
		assertEquals("Flying", changedFlyResult);
	}

}
