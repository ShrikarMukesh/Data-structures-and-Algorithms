package com.stackqueuearray;

public class ArrayQueue {
	
	private int[] arr;
	private int front, rear;
	private int size;

	public ArrayQueue(int size) {
		arr=new int[size];
		front=rear=-1;
		this.size=size; 
	}
	public boolean isQueueFull() {
		return((rear+1)%size==front);
	}
	public void enQueue(int data) {
		if(isQueueFull()){
			System.out.println("Queue is Full");
			return;
		}
		else {
			if(isQueueEmpty())
				front=(front+1)%size;
			rear=(rear+1)%size;
			arr[rear]=data;
		}
	}
	public int deQueue() {
		if(isQueueEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}
		else {
			int val=arr[front];
			if(front==rear)
				front=rear=-1;
			else 
				front=(front+1)%size;
			
			return val;
		}
	}
	public void traverse(){
		System.out.println();
		for(int i=front; i<=rear; i++)
			System.out.print(" "+arr[i]);
		System.out.println();
	}
	public boolean isQueueEmpty() {
		return (front==-1 && rear==-1);
	}
	public void reverse(ArrayQueue q) {
		ArrayStack st = new ArrayStack();
		while(!q.isQueueEmpty()) {
			st.push(q.deQueue());
		}
		while(!st.isStackEmpty()) {
			q.enQueue(st.pop());
		}
	}
	public void reverse() {
		ArrayQueue q = new ArrayQueue(size);
		reverse(q);
	}
}

