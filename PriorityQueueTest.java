import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PriorityQueueTest {

	@Test
	void addTest() {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(3);
		assertTrue( queue.add(20, 1) );
		assertTrue( queue.add(30, 2) );
		assertTrue( queue.add(40, 3) );
		assertFalse( queue.add(10, 10) );	
	}
	
	@Test
	void addInOrderTest() {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		assertTrue( queue.add(20, 1) );
		assertTrue( queue.add(30, 3) );
		assertTrue( queue.add(40, 2) );
		assertTrue( queue.add(13, 1));
		assertTrue( queue.add(26, 3));
		assertTrue( queue.add(55,  4));
		
		assertEquals( queue.remove().getData(), Integer.valueOf(20) );
		assertEquals( queue.remove().getData(), Integer.valueOf(13) );
		assertEquals( queue.remove().getData(), Integer.valueOf(40) );
		assertEquals( queue.remove().getData(), Integer.valueOf(30) );
		assertEquals( queue.remove().getData(), Integer.valueOf(26) );
	}
}