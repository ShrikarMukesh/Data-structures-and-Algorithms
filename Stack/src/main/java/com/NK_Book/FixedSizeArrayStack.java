package com.NK_Book;

public class FixedSizeArrayStack {
	protected int capacity;
	public static final int CAPACITY = 10;
	protected int[] stackRep;
	protected int top = -1;
	public FixedSizeArrayStack() {
		this(CAPACITY);
	}
	public FixedSizeArrayStack(int cap) {
		capacity = cap;
		stackRep = new int[capacity];
	}
	public int size() {
		return (top+1);
	}
	public boolean isEmpty() {
		return(top<0);
	}
	public void push(int data) throws Exception {
		if(size()==capacity) {
			throw new Exception("stack is full");
		}
		stackRep[++top] = data;
	}
	public int top() throws Exception {
		if(top<0) {
		    throw new Exception("Stack is empty");
		}
		return stackRep[top];
	}
	public int pop() throws Exception {
		int data;
		if(isEmpty()) {
			throw new Exception("stack is empty");
		}
		data = stackRep[top];
		stackRep[top--] = Integer.MIN_VALUE;
		return data;
	}
	public void display() throws Exception {
		if(isEmpty()) {
			throw new Exception("stack is empty");
		}else {
			for(int i=0;i<size();i++) {
				System.out.println(stackRep[i]);
			}
		}
	}
	public static void main(String[] args) throws Exception {
	   FixedSizeArrayStack f = new FixedSizeArrayStack();
	   f.push(90);
	   f.push(89);
	   f.display();
	   f.push(9);
	   f.push(77);
	   System.out.println("top element in array "+f.top());
	   f.display();
	   System.out.println("popped element is = "+f.pop());
	   
	}

}
