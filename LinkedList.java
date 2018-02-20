public class LinkedList<E> {
	private Node<E> head;
	private Node<E> tail;
	private int size;
	
	public LinkedList() {
		size = 0;
		head = null;
		tail = null;
	}
	
	/*
	 * Returns the head of the linked list.
	 * @param none
	 * @return head of linkedlist
	 */
	public Node<E> getFirst() {
		return head;
	}
	
	/*
	 * Returns the head of the linked list.
	 * @param none
	 * @return head of linkedlist
	 */
	public Node<E> getLast(){
		return tail;
	}
	
	/*
	 * @return The node at a given index;
	 * @param int index
	 */
	public Node<E> get(int index){
		Node<E> current = head;
		for(int i = 0; i < index; ++i) {
			if( current != null ) {
				current = current.next;
			} else {
				return null;
			}
		}
		
		return current;
	}
	
	/*
	 * @return void
	 * @params data of added node
	 */
	public void add(E e) {
		Node<E> newNode = new Node<E>(e);
		//Check if list empty
		if(head == null) {
			head = newNode;
			tail = newNode;
			++size;
		} else {
			tail.next = newNode;
			tail = tail.next;
			++size;
		}
	}
	
	/*
	 * return void
	 * @params int index and data of new node
	 */
	public void add(int index, E e) {
		Node<E> newNode = new Node<E>(e);
		//Check if list empty
		if(head == null) {
			head = newNode;
			tail = newNode;
			++size;
		} else if(index == 0) {
			Node<E> temp = head;
			head = newNode;
			head.next = temp;
			++size;
		} else {
			int i = 0;
			Node<E> current = head.next;
			Node<E> slow = head;
			while(current != null) {
				if(i == index-1) {
					Node<E> temp = current;
					slow.next = newNode;
					newNode.next = temp;
					++size;
					return;
				}
				
				++i;
				current = current.next;
				slow = slow.next;
			}
			
			tail.next = newNode;
			tail = newNode;
			++size;
		}
	}
	
	/*
	 * @params none
	 * @returns whether linked list is empty or not.
	 */
	public boolean isEmpty() {
		return (head == null);
	}
	
	/*
	 * @params element
	 * @returns void
	 */
	
	public boolean remove(E e) {
		Node<E> current = head;
		Node<E> fastNode = head.next;
		while( fastNode != null) {
			if( fastNode.getData() == e) {
				current.next = fastNode;
				--size;
				return true; 
			}
			current = current.next;
			fastNode = fastNode.next;
		}
		
		return false;
	}
	/*
	 * @params element
	 * @returns whether a linked list contains a given element
	 */
	public boolean contains(E e) {
		Node<E> current = head;
		while( current != null ) {
			if( current.getData() == e) {
				return true;
			}
		}
		
		return false;
	}
	
	public int size() {
		return size;
	}
}