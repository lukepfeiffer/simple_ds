public class BinarySearchTree{
	private BNode root;
	private int depth;
	
	public BinarySearchTree() {
		this.root = null;
	}
	
	public boolean add(int data) {
		BNode newNode = new BNode(data);
		if( root == null ) {
			root = newNode;
			return true;
		} else {
			BNode current = root;
			
			//Iterate over tree to find spot for Bnode;
			while( current != null ) {
				//If BNode data <= current data, iterate left side
				if( newNode.getData() <= current.getData()) {
					//If left is null, set left to new node
					if( current.getLeft() == null ) {
						current.setLeft(newNode);
						++depth;
						return true;
					//Else continue iterating
					} else {
						current = current.getLeft();
					}
				//Else, new data > current data, iterate right
				} else {
					//If right is null, set right
					if( current.getRight() == null ) {
						current.setRight(newNode);
						++depth;
						return true;
					//Keep iterating else;
					} else {
						current = current.getRight();
					}
				}
			}
		}
		
		return false;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public String inOrderSearch() {
		String returnString = "";
		Stack<BNode> stack = new Stack<BNode>();
		return returnString;
	}
}