package net.jasonblevins.academic.LinkedListOperator;

import net.jasonblevins.academic.LinkedList.LinkedList;

/**
 * @author Jason Blevins "Helper" or "operator class for a linked list" <br>
 *         Note that this could be slightly bad object oriented design, but is a
 *         convenient way to organize some more advanced linked list operations.
 *
 */
public class LinkedListOperator {

	/**
	 * Builds a sorted linked list from two linked lists that are already sorted.
	 * @param linkedListA
	 * @param linkedListB
	 * @return
	 */
	static <T extends Comparable<T>> LinkedList<T> mergeTwoSortedLists(LinkedList<T> linkedListA, LinkedList<T> linkedListB) {
		LinkedList<T> mergedList = new LinkedList<T>();
		
		
		if (linkedListA.isEmpty()){
			
			if (linkedListB.isEmpty()){
				
				return mergedList;
			} else{
				mergedList.addAll(linkedListB);
			}
			
			
			
		}
	
		return mergedList;

	}
}
