package strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestQuackBehavior {

	@Test
	void testQuack() {
		String result;
		QuackBehavior quackBehavior = new Quack();
		
		result = quackBehavior.quack();
		assertEquals("Quack", result);
	}
	
	@Test
	void testMuteQuack() {
		String result;
        QuackBehavior quackBehavior = new MuteQuack();
        
		result = quackBehavior.quack();
		assertEquals("SILENCE", result);
	}

}
