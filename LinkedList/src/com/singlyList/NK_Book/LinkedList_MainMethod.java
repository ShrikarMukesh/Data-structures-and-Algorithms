package com.singlyList.NK_Book;

public class LinkedList_MainMethod {

	public static void main(String[] args) {
		
		LinkedList linkedList  = new LinkedList();
		linkedList.insertAtBegin(new ListNode(90));
		linkedList.insertAtBegin(new ListNode(23));
		linkedList.traverse();
		
		System.out.println("Inserting at End");
		linkedList.insertAtEnd(new ListNode(67));
		linkedList.insertAtEnd(new ListNode(7));
		linkedList.traverse();
		linkedList.insertAtGivenPosition(12, 1);
		linkedList.insertAtGivenPosition(29, 0);
		linkedList.traverse();
		
		
	}

}
