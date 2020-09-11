package singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCacheSingleton {

	@Test
	void whenCacheIsCreated_thenNameIsNull() {
		Cache cache = Cache.getInstance();
		String name = cache.getName();
		
		assertEquals(null, name);
	}
	
	@Test
	void whenCacheNameIsChanged_thenReturnedNameHasChanged() {
		String expectedName = "myCache";
		String resultName;
		Cache cache = Cache.getInstance();
		
		cache.setName(expectedName);
		resultName = cache.getName();
		
		assertEquals(expectedName, resultName);
	}

}
