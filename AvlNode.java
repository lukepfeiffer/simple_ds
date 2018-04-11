
public class AvlNode {
	private int data;
	private int height;
	private AvlNode left;
	private AvlNode right;
	
	public AvlNode( int data ) {
		this.data = data;
		height = 1;
	}
	
	public int getData() {
		return data;
	}
	
	public int getHeight() {
		return height;
	}
	
	public AvlNode getLeft() {
		return left;
	}
	
	public AvlNode getRight() {
		return right;
	}
	
	public void setLeft( AvlNode node) {
		this.left = node;
	}
	
	public void setRight( AvlNode node ) {
		this.right = node;
	}
	
	public void setHeight( int height ) {
		this.height = height;
	}
}
