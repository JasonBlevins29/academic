package net.jasonblevins.academic.LinkedListOperator;

import net.jasonblevins.academic.LinkedList.LinkedList;
import net.jasonblevins.academic.LinkedList.LinkedListIterator;
import net.jasonblevins.academic.LinkedList.Node;

/**
 * @author Jason Blevins "Helper" or "operator class for a linked list" <br>
 *         Note that this could be slightly bad object oriented design, but is a
 *         convenient way to organize some more advanced linked list operations.
 *
 */
public class LinkedListOperator {

	/**
	 * Builds a sorted linked list from two linked lists that are already
	 * sorted.
	 * 
	 * @param linkedListA
	 * @param linkedListB
	 * @return
	 */
	public static <T extends Comparable<T>> LinkedList<T> mergeTwoSortedLists(LinkedList<T> linkedListA,
			LinkedList<T> linkedListB) {
		LinkedList<T> mergedList = new LinkedList<T>();

		if (linkedListA.isEmpty()) {

			if (linkedListB.isEmpty()) {
				// if linked list a and linked list b is empty, return the empty
				// merged list
				return mergedList;
			} else {
				// linked list a is empty, but b is not, so add list b to the
				// merge list
				mergedList.addAll(linkedListB);
				return mergedList;
			}
		}

		if (linkedListB.isEmpty()) {
			// do not need to check for linked list a being empty, would have
			// triggered before
			mergedList.addAll(linkedListA);
			return mergedList;
		}

		LinkedListIterator<T> linkedListIteratorA = new LinkedListIterator<T>(linkedListA.getHead());
		LinkedListIterator<T> linkedListIteratorB = new LinkedListIterator<T>(linkedListB.getHead());

		Node<T> nodeA = linkedListIteratorA.next();
		Node<T> nodeB = linkedListIteratorB.next();

		while (nodeA != null && nodeB != null) {

			System.out.println("Current node from A: " + nodeA.toString());
			System.out.println("Current node from B: " + nodeB.toString());

			if (nodeA.data.compareTo(nodeB.data) <= 0) {

				mergedList.add(nodeA.data);
				System.out.println("Adding node from A: " + nodeA.toString());
				nodeA = linkedListIteratorA.next();

			} else {
				mergedList.add(nodeB.data);
				System.out.println("Adding node from B: " + nodeB.toString());
				nodeB = linkedListIteratorB.next();

			}
			System.out.println("linked list iterator A has next: " + linkedListIteratorA.hasNext());
			System.out.println("linked list iterator B has next: " + linkedListIteratorB.hasNext());

		}
		
		if (nodeA == null){
			while (nodeB != null){
				
			}
			
		}

		return mergedList;

	}
}
