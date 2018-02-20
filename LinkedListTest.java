import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class LinkedListTest {

	@Test
	void getFirstTest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(20);
		list.add(30);
		assertEquals(Integer.valueOf(20), list.getFirst().getData());
	}
	
	@Test
	void getLastTest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(50);
		list.add(60);
		assertEquals(Integer.valueOf(60), list.getLast().getData());
	}
	
	@Test
	void getTest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		
		assertEquals(Integer.valueOf(50), list.get(0).getData());
		assertEquals(Integer.valueOf(60), list.get(1).getData());
		assertEquals(Integer.valueOf(70), list.get(2).getData());
		assertEquals(Integer.valueOf(80), list.get(3).getData());
		assertEquals(Integer.valueOf(90), list.get(4).getData());
		assertEquals(Integer.valueOf(100), list.get(5).getData());
	}
	
	@Test
	void addIndexTest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(50);
		list.add(60);
		list.add(70);
		
		list.add(2, 30);
		assertEquals(Integer.valueOf(30), list.get(2).getData());
		list.add(1, 10);

		assertEquals(Integer.valueOf(10), list.get(1).getData());
		list.add(0, 5);
		assertEquals(Integer.valueOf(5), list.get(0).getData());


	}
	
	@Test
	void isEmptyTest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
        assertTrue(list.isEmpty());
        
        list.add(5);
        assertFalse(list.isEmpty());
	}
	
	@Test
	void removeTest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(50);
		list.add(60);
		list.add(70);	
		boolean removed = list.remove(70);
		assertTrue(removed);
		assertFalse(list.contains(70));
	}
	
	@Test
	void sizeTest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(1, 90);
		list.remove(90);
		assertEquals(3, list.size());
	}
}