import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class HashMapTest {

	@Test
	void putTest() {
		HashMap<String> map = new HashMap<String>();
		map.put("Hey", "There");
		map.put("Stuff", "Value3");
		map.put("Key", "Value");
		
		assertEquals(map.get("Key"), "Value");
		assertEquals(map.get("Stuff"), "Value3");
		assertEquals(map.get("Hey"), "There");
	}
	
	@Test
	void isEmpty() {
		HashMap<String> map = new HashMap<String>();
		assertTrue(map.isEmpty());
		
		map.put("Hey", "There");
		assertFalse(map.isEmpty());
	}

}
