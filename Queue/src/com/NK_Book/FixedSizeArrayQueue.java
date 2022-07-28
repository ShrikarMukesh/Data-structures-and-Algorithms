package com.NK_Book;

public class FixedSizeArrayQueue {

	public static final int CAPACITY = 16;
	protected int[] queueRep;
	private int size,front,rear;
	public FixedSizeArrayQueue() {
		queueRep = new int[CAPACITY];
		size =0;front =0;rear=0;
	}
	public FixedSizeArrayQueue(int cap) {
		queueRep = new int[cap];
		size =0;front =0;rear=0;
	}
	public void enQueue(int data) throws NullPointerException,IllegalStateException {
		if(size==CAPACITY) {
			throw new IllegalStateException("Queue is full");
		}
		size++;
		queueRep[rear] = data;
		rear = (rear+1) % CAPACITY;
	}
	public boolean isEmpty() {
		return(size == 0);
	}
	public boolean isFull(){
		return (size==CAPACITY);
	}
	public int size() {
		return size;
	}
	public int deQueue() throws IllegalStateException {
		if(size == 0) {
			throw new IllegalStateException("queue is Empty : underflow");
		}else {
			size--;
			int data = queueRep[(front%CAPACITY)];
			queueRep[front] = Integer.MIN_VALUE;
			front = (front+1)%CAPACITY;
			return data;
		}
	}
	public void display() throws Exception {
		if(isEmpty()) {
			throw new Exception("stack is empty");
		}else {
			for(int i=0;i<=size;i++) {
				System.out.println(queueRep[i]);
			}
		}
	}
	public String toString() {
		String result ="[";
		for(int i=0;i<size;i++) {
			result = result+Integer.toString(queueRep[(front+i)%CAPACITY]);
			if(i<size-1) {
				result =result+",";
			}
		}
		result=result + "]";
		return result;
	}
	public static void main(String[] args) throws Exception {
		FixedSizeArrayQueue queue = new FixedSizeArrayQueue();
		queue.enQueue(90);
		queue.enQueue(78);
		queue.display();
		System.out.println("popped element in array "+queue.deQueue());
		queue.display();
		System.out.println("popped element is = "+queue.deQueue());
		System.out.println(queue.toString());
	}
}
