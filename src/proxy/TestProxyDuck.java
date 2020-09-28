package proxy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestProxyDuck {
	
	Duck proxyDuck;

	@BeforeEach
	void givenProxyDuckSupersedingRealDuck() {
		Duck realDuck = new RealDuck();
		proxyDuck = new ProxyDuck(realDuck);
	}
	
	@Test
	void whenProxyDuckQuacks_thenRealDuckQuacks() {
		String actualResult = proxyDuck.quack();
		String expectedResult = "This is a proxy, redirecting to real duck: Quack!";
		
		assertEquals(expectedResult, actualResult);
	}

}
