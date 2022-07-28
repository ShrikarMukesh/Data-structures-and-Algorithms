package com.linkedlist.uttara;

class List_Main {

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.insert(4);
		linkedList.insert(18);
		linkedList.insert(7);
		linkedList.insert(3);
		linkedList.insert(67);
		linkedList.insert(39);
		linkedList.insert(43);
		linkedList.traverse();
		System.out.println("Size of the LL : " +linkedList.getSize());
		linkedList.insertManual(18, 73);
		System.out.println("Inserting at specified position");
		linkedList.traverse();
		
		System.out.println(linkedList.getMiddleElement());
		
		System.out.println("After Deletion");
		linkedList.delete(4);
		linkedList.delete(43);
		linkedList.traverse();
		System.out.println("Is LL length Even :  " +linkedList.isLinkedListEvenLength());
		System.out.println("Get Middle Node : " +linkedList.getMiddle().getData());
		
		//Print the list in reverse order
		System.out.println("Print Reverse");
		linkedList.printReverse();
		System.out.println();
		linkedList.traverse();
		
		// Reverse Linked List
		System.out.println("Reversing Linked List");
		linkedList.reverse();
		linkedList.traverse(); 
		
		// Reverse Listed List recursively
		System.out.println("Recursive Reverse");
		linkedList.reverseRecursive();
		linkedList.traverse();
		
		linkedList.insert(78);
		System.out.println("IS given LL is evenlength  "+linkedList.isLinkedListEvenLength());
		
		System.out.println("Has Cycle First List: "+linkedList.hasCycle());
		 		
		// Has Cycle Example
		LinkedList llCycle = new LinkedList();
		Node tempStart = null;
		Node temp = null;
		Node tempEnd = null;
		for (int i = 0; i < 15; i++) {
			temp = llCycle.insertWithReturn(i);
			if(4==i){
				tempStart = temp;
			}
		}
		tempEnd=temp;
		tempEnd.setNext(tempStart);
		System.out.println("Has Cycle for Second List : " +llCycle.hasCycle()); 			
	}
}
