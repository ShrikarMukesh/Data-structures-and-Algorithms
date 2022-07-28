package com.search;

public class LinearSearch {
	public static void main(String[] args) {
		int[] array = new int[]{12,34,945,367,679,987,495,100,108,203};
		System.out.println("Before Linear Search");
		for (int i = 0; i < 10; i++) {
			System.out.print(" " +array[i]);
		}
	    System.out.println();
		System.out.println("**********************************************");
		
		System.out.println(" Linear Search for 203: " +linearSearch(array, 203));		
	}
	public static int linearSearch(int[] arr, int value) {
		
		for (int i = 0; i < arr.length; i++) {
			
			if(value == arr[i]) {
				return i;
			}	
		}	
		return -1;	
	}
}
