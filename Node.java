public class Node<E> {
	private E data;
	public Node<E> next;
	
	//Node constructor
	public Node( E data ){
		this.setData(data);
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
}