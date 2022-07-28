package com.NK_Book.example;
public class Heap {
	
	public int[] array;
	public int heap_type;
	public int capacity;
	public int count;
	
    public Heap(int capacity) {
    //	this.heap_type = heap_type;
    	this.count = 0;
    	this.capacity = capacity;
    	this.array = new int[capacity];
    }
	public int parent(int i) {
    	if(i<=0 || i>=this.count) {
    		return -1;
    	}else {
    		return i-1/2;
    	}
    }
    public int leftChild(int i) {
    	int left = 2*i+1;
    	if(left >=this.count) {
    		return -1;
    	}else {
    		return left;
    	}
    }
    public int rightChild(int i) {
    	int right = 2*i+2;
    	if(right >=this.count) {
    		return -1;
    	}else {
    		return right;
    	}
    }
    public int getMaximum() {
    	if(this.count == 0) {
    		return -1;
    	}else {
    		return this.array[0];
    	}
    }
    public void percolateDown(int i) {
    	int left ,right , max, temp;
    	left = leftChild(i);
    	right = rightChild(i);
    	if(left != -1 && this.array[left] > this.array[i]) {
    		max = left;
    	}else {
    		max = i;
    	}
    	if(right != -1 && this.array[right] > this.array[max]) {
    		max = right;
    	}
    	if(max != i ) {
    		temp = this.array[i];
    		this.array[i] = this.array[max];
    		this.array[max] = temp;
    		percolateDown(max);
    	}
    }
    public int deleteMax() {
    	if(this.count == 0) {
    		return -1;
    	}
    	int data  = this.array[0];
    	this.array[0] = this.array[this.count-1];
    	this.count--;
    	percolateDown(0);
    	return data;
    }
    public void insert(int data) {
    	int i;
    	if(this.count == this.capacity) {
    		ResizeHeap();
    	}
    	this.count++;
    	i = this.count-1;
    	while(i > 0 && data > this.array[(i-1)/2]) {
    		this.array[i] = this.array[(i-1)/2];
    		i = i-1/2;
    	}
    	this.array[i] =data;
    }
	private void ResizeHeap() {
		int[] array_old = new int[this.capacity];
		System.arraycopy(this.array, 0, array_old, this.count-1, capacity);
		this.array = new int[this.capacity*2];
		if(this.array == null ) {
			System.out.println("memory error");
			return;
		}
		for(int i =0;i<this.capacity;i++) {
			this.array[i] = array_old[i];
		}
		this.capacity = this.capacity*2;
		array_old = null;
	}
    public void buildHeap(Heap h,int[] A,int n) {
    	if(h == null) {
    		return;
    	}
    	while(n>this.capacity) {
    		h.ResizeHeap();
    	}
    	for(int i=0;i<n;i++) {
    		h.array[i] = A[i];
    	}
    	this.count = n;
    	for(int i = (n-1)/2;i>=0;i--) {
    		h.percolateDown(i);
    	}
    }
    public void printHeap() {
        for (int i = 0; i < capacity; i++) {
        System.out.print(array[i]);
            System.out.print(", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
		Heap heap = new Heap(7);
		heap.insert(1);
		heap.insert(2);
		heap.insert(4);
		heap.printHeap();
	}
}
