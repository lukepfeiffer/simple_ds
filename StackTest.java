import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {

	@Test
	void peekTest() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(20);
		assertEquals(Integer.valueOf(20), stack.peek().getData());
		
		stack.push(30);
		assertEquals(Integer.valueOf(30), stack.peek().getData());
	}
	
	@Test
	void emptyTest() {
		Stack<Integer> stack = new Stack<Integer>();
		assertTrue( stack.empty());

		stack.push(20);
		assertFalse( stack.empty());
	}
	
	@Test
	void popTest() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(20);		
		stack.push(30);
		stack.push(40);
		Node<Integer> popped = stack.pop();
		assertEquals( popped.getData(), Integer.valueOf(40));
		
		popped = stack.pop();
		assertEquals(Integer.valueOf(30), popped.getData());
		
		popped = stack.pop();
		assertEquals(Integer.valueOf(20), popped.getData());

		popped = stack.pop();
		assertEquals(null, popped);
	}
	
	@Test
	void sizeTest() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(20);		
		stack.push(30);
		stack.push(40);
		assertEquals( stack.size(), 3);
		
		stack.pop();
		assertEquals( stack.size(), 2);
		stack.pop();
		assertEquals( stack.size(), 1);
		stack.pop();
		assertEquals( stack.size(), 0);

	}
}
