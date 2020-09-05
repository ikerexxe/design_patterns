package strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFlyBehavior {

	@Test
	void whenFlyBehaviorIsCreated_thenFlies() {
		String result;
		FlyBehavior flyBehavior = new FlyWithWings();
		
		result = flyBehavior.fly();
		
		assertEquals("Flying", result);
	}
	
	@Test
	void whenCantFlyBehaviorIsCreated_thenCantFly() {
		String result;
		FlyBehavior flyBehavior = new FlyNoWay();
		
		result = flyBehavior.fly();
		assertEquals("I can't fly", result);
	}

}
