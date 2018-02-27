public class BNode {
	private BNode left;
	private BNode right;
	private int data;
	
	public BNode(int data) {
		this.data = data;
		left = null;
		right = null;
	}
	
	public void setLeft(BNode node) {
		this.left = node;
	}
	
	public void setRight(BNode node) {
		this.right = node;
	}
	
	public int getData() {
		return data;
	}
	
	public BNode getLeft() {
		return left;
	}
	
	public BNode getRight() {
		return right;
	}
}