package com.udemy.examples;
public class Main {

    public static void main(String[] args) {
        Heap heap = new Heap(10);

        heap.insert(1);
        heap.insert(2);
        heap.insert(4);
        heap.insert(5);
        heap.insert(6);
        heap.insert(13);
        heap.insert(17);
        //heap.insert(67);

        heap.printHeap();
        //System.out.println("peek element "+heap.peek());

        System.out.println(heap.delete(0));       
      //  heap.printHeap();
      //  System.out.println("peek element "+heap.peek());
       // heap.heapSort();
        heap.printHeap();
    }
}
