package com.NK_Book;
import java.util.EmptyStackException;
class ListNode {
	private int data;
	ListNode next;
	public ListNode(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListNode getNext() {
		return this.next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
}
public class LinkedStack {
	private int length;
	private ListNode top;
	public LinkedStack() {
		length =0;
		top = null;
	}
	public boolean isEmpty() {
		return(length ==0);
	}
	public int size() {
		return length;
	}
	public void push(int data) {
		ListNode temp = new ListNode(data);
		temp.setNext(top);
		top = temp;
		length++;
	}
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int result = top.getData();
		top = top.getNext();
		length--;
		return result;
	}
	public int peek() throws EmptyStackException{
		if(isEmpty()){
			throw new EmptyStackException();
		}
		return top.getData();
	}
	public synchronized void traverse() {
		if(length == 0) {
			return;
		}else {
			ListNode temp = top;
			while(temp != null) {
				System.out.print(" "+temp.getData());
				temp=temp.getNext();
			}
		}
		System.out.println();
	}
	public String toString() {
		String result = "";
		ListNode current = top;
		while(current != null) {
			result = result + current.toString() + "\n";
			current = current.getNext();
		}
		return result;
	}
	

	public static void main(String[] args) {
		LinkedStack f = new LinkedStack();
		   f.push(90);
		   f.push(89);
		   f.traverse();
		   f.push(9);
		   f.push(77);
		   System.out.println("top element in array "+f.peek());
		   f.traverse();
		   System.out.println("popped element is = "+f.pop());
	}
}
