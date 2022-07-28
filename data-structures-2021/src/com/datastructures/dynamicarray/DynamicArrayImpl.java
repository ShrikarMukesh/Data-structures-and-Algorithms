package com.datastructures.dynamicarray;
@SuppressWarnings("unchecked")
public class DynamicArrayImpl<T> {

	int capacity;
	T[] firstArr;
	int length = 0;
	
	public DynamicArrayImpl() {
		this(3);
	}
	
	public DynamicArrayImpl(int capacity) {
		
		if(capacity == 0) {
			throw new IllegalArgumentException("Please provide valid capacity "+ capacity);
		}
		this.capacity = capacity;
		firstArr = (T[]) new Object[capacity];
	}
	public int size() {
		return length;
	}
	public boolean isEmpty() {
		return size()==0;
	}
	public void clear() {
		for(int i=0;i<size();i++) {
			firstArr[i] = null;
		}
		length = 0;
	}
	public void add(T element) {

		if(length+1 >= capacity) {

			if (capacity == 0) {
				capacity = 1;
			}
			else {
				capacity =capacity * 2; // double the size
			}
		
			T[] finalArray = (T[]) new Object[capacity];
			for(int i=0;i<length;i++) {
				finalArray[i] = firstArr[i];
			}
			firstArr = finalArray;
		}
		firstArr[length++] =element;

	}
	public void display() {
		for(Object j: firstArr) {
			System.out.println(j+" ");
		}
	}
    public T removeAt(int remove_Index) {
    	
    	if(remove_Index >= length ||remove_Index < 0 ) {
    		throw new IllegalArgumentException("remove proper Index "+ remove_Index);
    	}
    	T removed = firstArr[remove_Index];
    	T[] new_arr = (T[]) new Object[length - 1];
    	for (int i = 0, j = 0; i < length; i++, j++) {
    		if(i == remove_Index) {
    			j--;
    		}
    		else {
    			new_arr[j] = firstArr[i];
    		}
    	}
    	firstArr = new_arr;
		capacity = --length;
    	return removed;
    	
    }
	public static void main(String[] args) {
		
		DynamicArrayImpl<String> dynamicArrayImpl = new DynamicArrayImpl<>();
		dynamicArrayImpl.add("Vijaylaxmi");
		dynamicArrayImpl.add("Shrikar");
		dynamicArrayImpl.add("Ashish");
		dynamicArrayImpl.add("Rohan");
		System.out.println("removed data = "+dynamicArrayImpl.removeAt(1));
		//dynamicArrayImpl.clear();
		dynamicArrayImpl.display();
	}
}
