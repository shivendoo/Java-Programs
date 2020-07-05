package CollectionImplementation;

import java.util.LinkedList;

public class LinkedListRunner {



	public static void main(String[] args) {
//		LinkedList ls = new LinkedList<Integer>();
//	  ls.
		
		LinkListImpl  list = new LinkListImpl();
		list.insertAtLast(12);
		list.insertAtLast(16);
		list.insertAtLast(18);
		list.insertAtLast(22);
		list.insertAtLast(25);
		list.insertAtIndex(15, 1);
		list.insertAtIndex(10,0);
		System.out.println("Size of linked list is ->"+list.Size());
		list.PrintLinkedListElement();
		list.removeNodeAt(3);
		list.removeFirstNode();		
		list.removeLastNode();
		list.PrintLinkedListElement();
		System.out.println("Size of linked list is ->"+list.Size());
		
	}

}
