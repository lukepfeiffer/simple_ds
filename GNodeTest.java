import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GNodeTest {

	@Test
	void addEdgeTest() {
		GNode nodeOne = new GNode( 5 );
		GNode nodeTwo = new GNode( 10 );
		GNode nodeThree = new GNode( 15 );
		GNode nodeFour = new GNode( 20 );
		GNode nodeFive = new GNode( 25 );

		nodeOne.addEdge( nodeTwo );
		nodeOne.addEdge( nodeThree );
		nodeOne.addEdge( nodeFour );
		nodeOne.addEdge( nodeFive );
		nodeOne.addEdge( null );

		assertEquals( nodeOne.getEdges()[0], nodeTwo );
		assertEquals( nodeOne.getEdges()[1], nodeThree );
		assertEquals( nodeOne.getEdges()[2], nodeFour );
		assertEquals( nodeOne.getEdges()[3], nodeFive );

	}
	
	@Test
	void manyEdgesTest() {
		GNode nodeOne = new GNode( 5 );

		nodeOne.addEdge( new GNode( 10 ) );
		nodeOne.addEdge( new GNode( 15 ) );
		nodeOne.addEdge( new GNode( 20 ) );
		nodeOne.addEdge( new GNode( 25 ) );
		nodeOne.addEdge( new GNode( 30 ) );
		nodeOne.addEdge( new GNode( 35 ) );
		nodeOne.addEdge( new GNode( 40 ) );
		nodeOne.addEdge( new GNode( 45 ) );
		nodeOne.addEdge( new GNode( 50 ) );
		nodeOne.addEdge( new GNode( 55 ) );
		
		GNode [] edges = nodeOne.getEdges();
		assertEquals( edges[0].getData(), 10 );
		assertEquals( edges[1].getData(), 15 );
		assertEquals( edges[2].getData(), 20 );
		assertEquals( edges[3].getData(), 25 );
		assertEquals( edges[4].getData(), 30 );
		assertEquals( edges[5].getData(), 35 );
		assertEquals( edges[6].getData(), 40 );
		assertEquals( edges[7].getData(), 45 );
		assertEquals( edges[8].getData(), 50 );
		assertEquals( edges[9].getData(), 55 );
	}
	
	@Test
	void removeEdgeTest() {
		GNode nodeOne = new GNode( 5 );
		GNode nodeTwo = new GNode( 10 );
		GNode nodeThree = new GNode( 15 );
		
		nodeOne.addEdge( nodeTwo );
		nodeOne.addEdge( nodeThree );
		
		assert( nodeOne.removeEdge( nodeTwo ) );
		assertEquals( nodeOne.getEdges()[0], null );
		assertEquals( nodeOne.getEdges()[1], nodeThree );
	}

	@Test
	void removeEdgeByDataTest() {
		GNode nodeOne = new GNode( 5 );
		GNode nodeTwo = new GNode( 10 );
		GNode nodeThree = new GNode( 15 );
		
		nodeOne.addEdge( nodeTwo );
		nodeOne.addEdge( nodeThree );
		
		assert( nodeOne.removeEdge( 10 ) );
		assertEquals( nodeOne.getEdges()[0], null );
		assertEquals( nodeOne.getEdges()[1], nodeThree );
	}
	
	@Test
	void breadthFirstSearch() {
		GNode nodeOne = new GNode( 5 );
		GNode nodeTwo = new GNode( 10 );
		GNode nodeThree = new GNode( 15 );
		GNode nodeFour = new GNode( 20 );
		GNode nodeFive = new GNode( 25 );
		GNode nodeSix = new GNode( 30 );
		GNode nodeSeven = new GNode( 35 );
		GNode nodeEight = new GNode( 40 );
		GNode nodeNine = new GNode( 45 );

		
		nodeOne.addEdge( nodeTwo );
		nodeOne.addEdge( nodeEight );
		nodeOne.addEdge( nodeNine );
		nodeTwo.addEdge( nodeThree );
		nodeTwo.addEdge( nodeFour );
		nodeTwo.addEdge( nodeFive );
		nodeThree.addEdge( nodeSix );
		nodeThree.addEdge( nodeSeven );
		String search = nodeOne.breadthFirst( nodeOne, "" );
		System.out.println( search );
	}
}
