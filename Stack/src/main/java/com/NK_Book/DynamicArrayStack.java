package com.NK_Book;

public class DynamicArrayStack {
	protected int capacity;
	public static final int CAPACITY = 16;
	public static final int MINCAPACITY = 1<<15;
	protected int[] stackRep;
	protected int top = -1;
	public DynamicArrayStack() {
		this(CAPACITY);
	}
	public DynamicArrayStack(int cap) {
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
			expand();
		}
		stackRep[++top] = data;
	}
	private void expand() {
		int length =size();
		int[] newstack = new int[length<<1];
		System.arraycopy(stackRep, 0, newstack, 0, length);
		stackRep = newstack;
		this.capacity = this.capacity<<1;
	}
	private void shrink() {
		int length = top+1;
		if(length <= MINCAPACITY || top <<2 >= length) {
			return;
		}
		length  = length +(top<<1);
		if(top<MINCAPACITY)length = MINCAPACITY;
		int[] newstack = new int[length];
		System.arraycopy(stackRep, 0, newstack, 0, top+1);
		stackRep = newstack;
		this.capacity = length;
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
		shrink();
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
		DynamicArrayStack f = new DynamicArrayStack();
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
