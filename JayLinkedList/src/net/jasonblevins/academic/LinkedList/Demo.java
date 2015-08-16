package net.jasonblevins.academic.LinkedList;

public class Demo {

	public static void main(String[] args) {

		LinkedList<Integer> linkedListA = new LinkedList<Integer>(1,2,3);
		LinkedList<Integer> linkedListB = new LinkedList<Integer>(6,5,4);
		
		linkedListA.addAtBeginning(9);
		linkedListB.addAtBeginning(9);

		linkedListA.print();
		linkedListB.print();
		
		linkedListA.addAll(linkedListB);
		
		linkedListA.print();

	}

}
