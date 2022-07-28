package com.doublylinkedlist;

public class DoublyLinkedList {
	
	private DLLNode head = null;
	private DLLNode tail = null;
	
	public void insert(int data) {
		//Create a new node
		DLLNode newNode = new DLLNode(data);
		//if it is the first node
		if(null == head) {
			head = newNode;
			tail = newNode;
			return;
		}
		else {
			//append to the end adjust both next prev and next refs
			DLLNode temp = tail;
			tail.setNext(newNode);
			tail = newNode;
			tail.setPrev(temp);
			return;
		}	
	}
	
	public void delete(int data) {
		// If no nodes in the list
		if(null == head) {
			System.out.println("No Elements in the List");
			return;
		}
		// if node to be deleted is the first node
		if(head.getData() == data) {
			@SuppressWarnings("unused")
			DLLNode temp = head;
			head = head.getNext();
			head.setPrev(null);
			temp = null;
			return;
		}
		else {
			//if node to be deleted is in the middle
			DLLNode previous ;
			DLLNode current = head.getNext();
			DLLNode future;
			while(null != current.getNext()) {
				if(data == current.getData()) {
					previous = current.getPrev();
					future = current.getNext();
					previous.setNext(current.getNext());
					future.setPrev(current.getPrev());
					current.setPrev(null);
					current.setNext(null);
					current = null;
					return;
				}
				current = current.getNext();	
			}
			//if node to be deleted is the last node
			if(data == current.getData()) {
				previous = current.getPrev();
				previous.setNext(current.getNext());
				current.setPrev(null);
				current.setNext(null);
				current = null;
				tail = previous;
				return;
			}
			else {
				//node not found
				System.out.println("No Specified Element in the List");
			}
		}

	}
	
	public void traverse() {
		DLLNode temp = head;
		while(null != temp) {
			System.out.print(" " +temp.getData());
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	public void revTraverse() {
		DLLNode temp = tail;
		while(null != temp) {
			System.out.print(" " +temp.getData());
			temp = temp.getPrev();
		}
		System.out.println();
	}
}
