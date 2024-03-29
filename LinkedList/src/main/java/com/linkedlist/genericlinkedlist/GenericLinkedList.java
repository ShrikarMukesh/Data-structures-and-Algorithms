package com.linkedlist.genericlinkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

class GenericLinkedList<T> implements Iterable<T> {
	private int size;
	private GenericNode<T> head;
	public boolean isEmpty() {
		return (null == head);
	}
	public int getSize() {
		return size;
	}
	public void append(T data) {
	   //Create a new node
		GenericNode<T> newNode = new GenericNode<T>(data);
		//If it is the head node
		if(null == head) {
			head = newNode;
		}
		else {
			//Traverse till the end
			GenericNode<T> temp = head;
			while(temp.getNext() != null) {
			  temp = temp.getNext();
			}
		   // Append new node to last node
			  temp.setNext( newNode);	   
		}
		size++;
	}
	@Override
	public Iterator<T> iterator() {
		return new ListIterator();
	}
	
	// an iterator, doesn't implement remove() since it's optional
    private class ListIterator implements Iterator<T> {
        private GenericNode<T> current = head;
        public boolean hasNext()  { 
        	return current != null;                     
        }
        public void remove()      { 
        	throw new UnsupportedOperationException();  
        }
        public T next() {
            if (!hasNext()) { 
            	throw new NoSuchElementException();
            }
            T data = current.getData();
            current = current.getNext(); 
            return data;
        }
    }
	
	public void delete(T data) {
		//If no nodes in linked list
		if(head == null) {
			System.out.println("No elements in the list");
			return;
		}
		//if node to be deleted is head node
		if(head.getData().equals(data)) {
			@SuppressWarnings("unused")
			GenericNode<T> temp = head;
			head = head.getNext();
			temp = null;
			size--;
			return;
		}
		
		else {
			GenericNode<T> previous = head;
			GenericNode<T> current = previous.getNext();
			//Traverse the list for node to be deleted
			while(current != null) {
			if(current.getData().equals(data)){
				//if found, set previous.next with current.next
				previous.setNext(current.getNext());
				current = null;
				return;
				}
			
			previous = current;
			current = current.getNext();
			
			}
			//if node to be deleted is not found
			if(null == current) {
				System.out.println("No Specified element in the list");
			}
		}
		size--;			
		}
	    
}
