package adapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDuckAdapter {

	@Test
	void test() {
		Duck duckAdapter = new DuckAdapter();
		String result = duckAdapter.request();
		
		assertEquals("Gobble", result);
	}

}
