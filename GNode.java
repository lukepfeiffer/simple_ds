import java.util.Queue;
public class GNode {
	private GNode [] edges;
	private int data;
	public boolean visited = false;
	public GNode next;
	
	public GNode( int data ) {
		this.edges = new GNode[5];
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public GNode[] getEdges() {
		return edges;
	}
	
	public boolean addEdge( GNode node ) {
		//Check if node is null
		if( node == null ) {
			return false;
		}
		
		//Find empty spot in edge list
		int index = 0;
		for(index = 0; index < edges.length; ++index ) {
			if( edges[index] == null ) {
				break;
			}
		}
		
		//If the spot we put the new edge is 75% or greater of the edge length,
		//create a new array and copy the contents over
		if( index >= (edges.length * 0.75) ) {
			increaseEdgeSize();
		}
		
		edges[index] = node;
		return true;
	}
	
	public boolean removeEdge( GNode node ) {
		//Check if node is null
		if( node == null ) {
			return false;
		}
		
		//Iterate over array and find node, remove it from edges
		//list.
		for(int i = 0; i < edges.length; ++i ) {
			if( edges[i] == node ) {
				edges[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeEdge( int data ) {
		//Iterate over array and find node, remove it from edges
		//list.
		for(int i = 0; i < edges.length; ++i ) {
			if( edges[i].getData() == data ) {
				edges[i] = null;
				return true;
			}
		}
		
		return false;
		
	}
	//Copies contents of edges into an array twice as big
	private void increaseEdgeSize() {
		GNode [] newEdges = new GNode[ edges.length*2 ];
		for(int i = 0; i < edges.length; ++i ) {
			newEdges[i] = edges[i];
		}
		
		this.edges = newEdges;
	}
	
	//Breadth first search....
	public String breadthFirst( GNode root, String string ) {
		GQueue queue = new GQueue();
		root.visited = true; //Set visited to true.
		queue.add( root ); //Add to the queue
		

		while( !queue.empty() ) {
			GNode temp = queue.remove();
			string += temp.getData() + " ";
			GNode [] tempEdges = temp.getEdges();
			for( int i = 0; i < tempEdges.length; ++i ) {
				if( tempEdges[i] != null && !tempEdges[i].visited ) {
					tempEdges[i].visited = true;
				    queue.add( tempEdges[i] );
				}
			}
		}
		
		return string;
	}
}