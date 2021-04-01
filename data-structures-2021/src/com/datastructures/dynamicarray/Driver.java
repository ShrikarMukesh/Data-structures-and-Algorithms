package com.datastructures.dynamicarray;

import java.util.Iterator;

public class Driver {
	public static void main(String[] args) {
		
       DynamicArray<Integer> dynamicArray = new DynamicArray<>();
       dynamicArray.add(12);
       dynamicArray.add(22);
       dynamicArray.add(32);
       dynamicArray.add(20);
       dynamicArray.add(76);
       dynamicArray.removeAt(3);
       Iterator<Integer> itr = dynamicArray.iterator();
       
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
	}
}
