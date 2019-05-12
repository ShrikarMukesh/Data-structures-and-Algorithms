package com.stackqueuearray;

public class TestQueue {
	
	public static void main(String[] args) {

		ArrayQueue queue = new ArrayQueue(10);
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		queue.enQueue(60);
		queue.enQueue(70);
		queue.enQueue(80);
		queue.enQueue(90);
		queue.enQueue(100);
		queue.enQueue(110);
		queue.traverse();
		//queue.reverse();
		while(!queue.isQueueEmpty()){
			System.out.print(" "+queue.deQueue());
			//queue.traverse();
		}
		System.out.println();
		System.out.print(" "+queue.deQueue());
		
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		queue.enQueue(60);
		queue.enQueue(70);
		queue.enQueue(80);
		
		queue.deQueue();
		queue.deQueue();
		queue.traverse();
	}

}
