package strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestQuackBehavior {

	@Test
	void whenQuackBehaviorIsCreated_thenQuacks() {
		String result;
		QuackBehavior quackBehavior = new Quack();
		
		result = quackBehavior.quack();
		assertEquals("Quack", result);
	}
	
	@Test
	void whenMuteBehaviorIsCreated_thenSilence() {
		String result;
        QuackBehavior quackBehavior = new MuteQuack();
        
		result = quackBehavior.quack();
		assertEquals("SILENCE", result);
	}

}
