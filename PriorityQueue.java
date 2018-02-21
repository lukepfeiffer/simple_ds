public class PriorityQueue<E> {
	private Node<E> tail;
	private Node<E> head;
	private int size;
	private int maxSize;
	
	/*
	 * PQueue Constructor
	 * @params none
	 * @returns void
	 */
	public PriorityQueue() {
		tail = null;
		head = null;
		size = 0;
		maxSize = Integer.MAX_VALUE;
	}
	
	/*
	 * Take in a maxSize for the PQueue
	 * @params maxSize
	 * @returns void
	 */
	public PriorityQueue(int maxSize) {
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
	public boolean add(E element, int priority) {
		if(priority < 1 ) {
			priority = 1;
		}
		
		if( size+1 <= maxSize ) {
			Node<E> newNode = new Node<E>(element, priority);
			int newPriority = priority;
			if( head == null) {
				head = newNode;
				tail = newNode;
			} else if( tail.getPriority() <= newPriority ){
				tail.next = newNode;
				tail = newNode;
			} else {
				Node<E> current = head;
				while(current != null) {
					if( current.getPriority() <= newPriority && current.next.getPriority() >= newPriority ) {
						Node<E> temp = current.next;
						current.next = newNode;
						newNode.next = temp;
						size++;
						return true;
					}
				}
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