public class Queue<E> {
	private Node<E> tail;
	private Node<E> head;
	private int size;
	private int maxSize;
	
	/*
	 * Queue Constructor
	 * @params none
	 * @returns void
	 */
	public Queue() {
		tail = null;
		head = null;
		size = 0;
		maxSize = Integer.MAX_VALUE;
	}
	
	/*
	 * Take in a maxSize for the Queue
	 * @params maxSize
	 * @returns void
	 */
	public Queue(int maxSize) {
		tail = null;
		head = null;
		size = 0;
		this.maxSize = maxSize;
	}
	
	/*
	 * Adds an element to tail of Queue
	 * @params element
	 * @returns true on success
	 */
	public boolean add(E element) {
		if( size+1 <= maxSize ) {
			Node<E> newNode = new Node<E>(element);
			if( head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			++size;
			return true;
		}
		return false;
	}
	
	/*
	 * Peeks the top of the Queue
	 * @params none
	 * @returns head
	 */
	public Node<E> peek(){
		return head;
	}
	
	/*
	 * Removes top of Queue and returns it
	 * @params none
	 * @returns head
	 */
	public Node<E> remove(){
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
	
	public boolean empty() {
		return (head == null);
	}
}