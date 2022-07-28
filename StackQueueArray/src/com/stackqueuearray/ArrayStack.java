package com.stackqueuearray;
public class ArrayStack {
	private int[] arr;
	private int top;
	public ArrayStack(int size) {
		super();
		arr = new int[size];
		top=-1;
	}
	public ArrayStack() {
		
	}
	public void push(int data) {
		if(isStackFull()){
			throw new StackIsFullException("Exception: Stack is Full");
		}
		else {
			top++;
			arr[top]=data;
		}
	}
	public int pop() {
		if(isStackEmpty()){
			throw new StackIsEmptyException("Exception: Stack is Empty");
		}else {
			int val=arr[top];
			arr[top]=0;
			top--;
			return val;
		}
	}
	void traverse(){
		for(int i=top;i>=0;i--){
			System.out.print(" " +arr[i]);
		}
		System.out.println();
	}
	public boolean isStackFull(){
		return (top==arr.length-1);
	}
	public boolean isStackEmpty() {
		return (top==-1);
	}	
}
	
