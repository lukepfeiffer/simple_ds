import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

	@Test
	void addTest() {
		BinarySearchTree tree = new BinarySearchTree();
		
		assertTrue( tree.add(20) );
		assertTrue( tree.add(30) );
		assertTrue( tree.add(10) );
		assertTrue( tree.add(10) );
		assertTrue( tree.add(30) );
		assertTrue( tree.add(25) );
	}

}
