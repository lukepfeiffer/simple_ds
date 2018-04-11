public class GQueue {
	private GNode tail;
	private GNode head;
	private int size;
	private int maxSize;
	
	/*
	 * Queue Constructor
	 * @params none
	 * @returns void
	 */
	public GQueue() {
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
	public GQueue(int maxSize) {
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
	public boolean add( GNode element ) {
		if( size+1 <= maxSize ) {
			GNode newNode = element;
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
	public GNode peek(){
		return head;
	}
	
	/*
	 * Removes top of Queue and returns it
	 * @params none
	 * @returns head
	 */
	public GNode remove(){
		if( empty() ) {
			return null;
		} else if (head.next == null) {
			GNode temp = head;
			head = null;
			--size;
			return temp;
		} else {
			GNode temp = head;
			head = head.next;
			--size;
			return temp;
		}
	}
	
	public boolean empty() {
		return (head == null);
	}
}