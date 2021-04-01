package com.datastructures.stack;

import java.util.Iterator;
import java.util.LinkedList;

public class MyStack<T> {
   
	LinkedList<T> linkedList = new LinkedList<>();
	public MyStack() {
		
	}
	public void push(T elem) {
		linkedList.addLast(elem);
	}
	public void pop() {
		linkedList.removeLast();
	}
	public Iterator<T> itr(){
		return linkedList.iterator();
	}
	public int size() {
		return linkedList.size();
	}
	public static void main(String[] args) {
		MyStack<String> myStack = new MyStack<>();
		myStack.push("Mango");
		myStack.push("Apple");
		myStack.push("Chikku");
		myStack.push("Mosambi");
		Iterator<String> itr = myStack.itr();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		myStack.pop();
		System.out.println("----------------Second iteration--------------");
		Iterator<String> itr2 = myStack.itr();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
	}
}
