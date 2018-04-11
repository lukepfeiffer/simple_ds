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
		
		System.out.println("INORDER");
		tree.inOrderTraversal(tree.getRoot());
		System.out.println();
		
		System.out.println("PREORDER");
		tree.preOrderTraversal(tree.getRoot());
		System.out.println();

		System.out.println("POST2ORDER");
		tree.postOrderTraversal(tree.getRoot());
		System.out.println();

	}

}
