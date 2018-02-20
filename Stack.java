public class Stack<E> {
	private Node<E> head;
	private int size;
	
	/*
	 * Stack constuctor
	 * @params node
	 */
	public Stack() {
		size = 0;
		head = null;
	}
	
	
	/*
	 * Returns the top of the stack
	 * @params none
	 * @return head;
	 */
	public Node<E> peek() {
		return head;
	}
	
	/*
	 * Check if stack is empty
	 * @parmas none
	 * @returns boolean
	 */
	public boolean empty() {
		return ( head == null );
	}
	
	/*
	 * Add an element to the top of stack
	 * @params element
	 * @return node of new element
	 */
	public Node<E> push(E element){
		Node<E> node = new Node<E>(element);
		if( head == null ) {
			head = node;
			++size;
		} else {
		    node.next = head;
		    head = node;
			++size;
			return node;
		}
		
		return null;
	}
	
	/*
	 * Pops the head off the stack
	 * @params none
	 * @returns head of stack
	 */
	public Node<E> pop(){
		if( empty() ) {
			return null;
		} else if (head.next == null) {
			Node<E> temp = head;
			head = null;
			--size;
			return temp;
		} else {
			Node<E> temp = head;
			head = head.next;
			--size;
			return temp;
		}
	}
	
	/*
	 * @params none
	 * @returns size of stack
	 */
	public int size() {
		return size;
	}
}