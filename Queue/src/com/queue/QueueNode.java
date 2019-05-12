package com.queue;

public class QueueNode {
	
	private int data;
	private QueueNode next = null;
	
	public QueueNode(int data) {
		super();
		this.data = data;
	}	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public QueueNode getNext() {
		return next;
	}
	public void setNext(QueueNode next) {
		this.next = next;
	}
}
