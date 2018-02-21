import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTest {

	@Test
	void addTest() {
		Queue<Integer> queue = new Queue<Integer>(3);
		assertTrue( queue.add(20) );
		assertTrue( queue.add(30) );
		assertTrue( queue.add(40) );
		assertFalse( queue.add(10) );
	}
	
	@Test
	void peekTest() {
		Queue<Integer> queue = new Queue<Integer>(3);
		
		queue.add(20);
		assertEquals(Integer.valueOf(20), queue.peek().getData());
		queue.add(30);
		assertEquals(Integer.valueOf(20), queue.peek().getData());
		
		queue.add(40);
		assertEquals(Integer.valueOf(20), queue.peek().getData());
		
		queue.add(50);
		assertEquals(Integer.valueOf(20), queue.peek().getData());

	}
	
	/*
	 * TODO Does not work on the last element being removed!!
	 */
	@Test
	void removeTest() {
		Queue<Integer> queue = new Queue<Integer>(3);
		
		queue.add(20);		
		queue.add(30);		
		queue.add(40);		
		queue.add(50);
		
		assertEquals(Integer.valueOf(20), queue.remove().getData());
		assertEquals(Integer.valueOf(30), queue.remove().getData());
		assertEquals(Integer.valueOf(40), queue.remove().getData());
	}
	
	@Test
	void emptyTest() {
		Queue<Integer> queue = new Queue<Integer>(3);
		
	}
}