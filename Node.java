public class Node<E> {
	private E data;
	private int priority;

	public Node<E> next;
	
	//Node constructor
	public Node( E data ){
		this.data = data;
	}
	
	public Node(E data, int priority) {
		this.priority = priority;
		this.data = data;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
	
	public int getPriority() {
		return priority;
	}
}