package net.jasonblevins.academic.LinkedList;

public class Node<T> {
	public T data;
	public Node<T> next;

	/**
	 * Creates a new node, assigning the argument as the data for the node.
	 * Notes:<br>
	 * A) When a node is created for the first time, it exists in a vacuum
	 * therefore the next should be set to null. <br>
	 * 
	 * 
	 * @param data
	 */
	public Node(T data) {
		this.data = data;
		this.next = null;
	}

	/**
	 * Returns a string representation of the data.
	 */
	public String toString() {
		if (this.data == null) {
			return "null data";
		} else {
			return this.data.toString();

		}

	}

}
