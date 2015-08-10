package net.jasonblevins.academic.JayLinkedList;

public class LinkedList<T> {
	public Node<T> head;
	public int size;

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

	public void add(T data) {
		/** First, create a new node with the data passed in */
		Node<T> tempNode = new Node<T>(data);

		/**
		 * Next, we need to find out where the end of the list is. We know we
		 * have reached the end of the list when the current node's next is
		 * null. We start out by creating a node called currentNode and
		 * assigning the head node to it.
		 */
		Node<T> currentNode = head;

		/**
		 * If the currentNode's next (the head's next on the first iteration) is
		 * set to null, we are at the end of the list, and the node is inserted
		 * there. If the currentNode's next is not null, we assign the
		 * currentNode to the next node. This effectively iterates through the
		 * linked list until we have reached the end.
		 * 
		 */
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}

		/**
		 * We only reach this point once the above loop is finished
		 * (currentNode.next is null) therefore, we have reached the end of the
		 * list and add on the tempNode (containing the desired data) to the end
		 * of the list
		 */
		currentNode.next = tempNode;

		/** update the size of the linked list */
		this.size++;

	}

	public void print() {
		Node<T> currentNode = head.next;

		System.out.println("List: ");
		while (currentNode != null) {
			System.out.println(currentNode.toString());
			currentNode = currentNode.next;
		}
		System.out.println();

	}
}
