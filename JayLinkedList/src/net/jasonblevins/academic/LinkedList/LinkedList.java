package net.jasonblevins.academic.LinkedList;

/**
 * @author Jason Blevins In this implementation of a linked list, the head node
 *         is a "dummy node", whose next contains the real data.
 *
 * @param <T>
 */
public class LinkedList<T> {
	private Node<T> head;
	private int size;

	public LinkedList() {
		head = new Node<T>(null);
		size = 0;
	}

	public LinkedList(T... values) {
		head = new Node<T>(null);
		for (T value : values) {
			this.add(value);
			size++;
		}
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * Adds a new node containing the passed in data to the end of the linked
	 * list.
	 * 
	 * @param data
	 */
	public void add(T data) {
		/** First, create a new node with the data passed in */
		Node<T> tempNode = new Node<T>(data);

		Node<T> endNode = getEndNode();

		/**
		 * We only reach this point once the above loop is finished
		 * (currentNode.next is null) therefore, we have reached the end of the
		 * list and add on the tempNode (containing the desired data) to the end
		 * of the list
		 */
		endNode.next = tempNode;

		/** update the size of the linked list */
		this.size++;

	}
	
	

	/**
	 * Adds a node at the beginning of the linked list.
	 * 
	 * @param data
	 */
	public void addAtBeginning(T data) {
		/** Create the */
		Node<T> newNode = new Node<T>(data);
		newNode.next = head.next;
		this.head.next = newNode;
	}

	/**
	 * Prints the current data in the linked list, the first node is on the top.
	 */
	public void print() {
		/**
		 * Since this implementation has the head as a dummy node, the first
		 * node to print is head.next
		 */
		Node<T> currentNode = head.next;

		String arrow = " -> ";
		System.out.print("Head");
		while (currentNode != null) {
			System.out.print(arrow);
			System.out.print(currentNode.toString());
			currentNode = currentNode.next;
		}
		System.out.println();

	}

	/**
	 * Checks to see if the list is empty by checking to see if the first node
	 * has data.
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return (head.next == null);
	}

	/**
	 * Returns the end node, if the list is empty, the end node is the head.
	 * 
	 * @return
	 */
	private Node<T> getEndNode() {
		/**
		 * First start off by setting the current node to the head node, this is
		 * a logical place to start
		 */
		Node<T> currentNode = head;

		/**
		 * Loop through all the nodes until a node whose next is null, this is
		 * the end node
		 */
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}

		/** return the end node */
		return currentNode;

	}

	public void addAll(LinkedList<T> otherLinkedList) {

		/** find the ending node of the this list */
		Node<T> endNode = getEndNode();

		endNode.next = otherLinkedList.head.next;
		this.size += otherLinkedList.size;

	}

}
