package CollectionImplementation;

//import java.util.LinkedList;

public class LinkListImpl {

	private LinkedListNode rootElementReference;
	private int numberOfNodes;

	// size of linked list
	public int Size() {
		return numberOfNodes;
	}

	// Insert element at end of LinkedList
	public void insertAtLast(int intElement) {
		LinkedListNode newNode = new LinkedListNode();
		newNode.data = intElement;
		newNode.next = null;

		if (rootElementReference == null) {
			rootElementReference = newNode;
			numberOfNodes++;
		} else {
			LinkedListNode node = rootElementReference;
			while (node.next != null) {
				node = node.next;
			}
			node.next = newNode;
			numberOfNodes++;
		}
		System.out.println("New Element " + intElement + " Added at END of Linked List");
	}

	// Insert element at Start in LinkedList
	public void insertAtStart(int intElement) {

		LinkedListNode newNode = new LinkedListNode();
		newNode.data = intElement;
		newNode.next = rootElementReference;
		rootElementReference = newNode;
		numberOfNodes++;
		System.out.println("New Element " + intElement + " Added at Start of Linked List");
	}

	// Insert Element at specific index in linked list
	public boolean insertAtIndex(int intElement, int index) {

		if (index == 0) {
			insertAtStart(intElement);
			System.out.println("New Element " + intElement + " Added at Start of Linked List");
			return true;
		}

		if (numberOfNodes == index) {
			insertAtLast(intElement);
			System.out.println("New Element " + intElement + " Added at END of Linked List");
			return true;
		}

		LinkedListNode newNode = new LinkedListNode();
		newNode.data = intElement;

		if (numberOfNodes > index) {
			LinkedListNode node = rootElementReference;
			for (int nodeIndex = 0; nodeIndex < index - 1; nodeIndex++) {
				node = node.next;
			}
			newNode.next = node.next;
			node.next = newNode;
			numberOfNodes++;
			System.out.println("New Element " + intElement + " Added at index " + index + " of Linked List");
			return true;
		}
		return false;
	}

	// Iterate and print all element of linked list
	public void PrintLinkedListElement() {
		LinkedListNode node = rootElementReference;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	// remove element from linked list at specific index
	public int removeNodeAt(int index) {
		if (index == 0) {
			int removedItem = rootElementReference.data;
			rootElementReference = rootElementReference.next;
			numberOfNodes--;
			System.out.println("New Element " + removedItem + " Removed from index " + index + " of Linked List");
			return removedItem;
		} else {
			LinkedListNode node = rootElementReference;
			for (int nodeCount = 0; nodeCount < index - 1; nodeCount++) {
				node = node.next;
			}
			LinkedListNode nextNode = node.next;
			int removedItem = nextNode.data;
			node.next = nextNode.next;
			numberOfNodes--;
			System.out.println("Element " + removedItem + " Removed from index " + index + " of Linked List");
			return removedItem;

		}
	}

	// remove element from starting of linked list
	public int removeFirstNode() {
		int removedItem = rootElementReference.data;
		rootElementReference = rootElementReference.next;
		numberOfNodes--;
		System.out.println("Element " + removedItem + " Removed from staring of Linked List");
		return removedItem;

	}

	// remove element from starting of linked list
	public int removeLastNode() {
		if (numberOfNodes == 0) {
			System.out.println("Linked List is blank and can not delete item");
			return -1;
		} else if (numberOfNodes == 1) {
			return removeFirstNode();
		} else {
			LinkedListNode node = rootElementReference;
			for (int nodeCount = 1; nodeCount < numberOfNodes - 1; nodeCount++) {
				node = node.next;
			}
			LinkedListNode lastnode = node.next;
			node.next = null;
			numberOfNodes--;
			System.out.println("Element " + lastnode.data + " Removed from End of Linked List");
			return lastnode.data;
		}
	}
}
