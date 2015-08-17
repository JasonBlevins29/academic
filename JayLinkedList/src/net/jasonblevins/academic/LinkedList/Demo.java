package net.jasonblevins.academic.LinkedList;

import java.awt.print.Printable;

import net.jasonblevins.academic.LinkedListOperator.LinkedListOperator;

public class Demo {

	public static void main(String[] args) {

		LinkedList<Integer> linkedListA = new LinkedList<Integer>(1, 5, 9);
		linkedListA.print();

		LinkedList<Integer> linkedListB = new LinkedList<Integer>(2, 6, 20);
		linkedListB.print();

		LinkedList<Integer> mergedList = LinkedListOperator.mergeTwoSortedLists(linkedListA, linkedListB);

		mergedList.print();

	}

}
