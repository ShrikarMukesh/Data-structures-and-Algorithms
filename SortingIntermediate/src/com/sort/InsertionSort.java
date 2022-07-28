package com.sort;

public class InsertionSort {
	
	public static void main(String[] args) {	
		
		int array[] = { 14,11,45,71,98,41,86,88,1,34};
		
		System.out.println("Before Insertion Sort");
		for (int i = 0; i < array.length; i++) {			
			System.out.print(" " +array[i]);
		}
		
		System.out.println();
		insertionSort(array, array.length);
		System.out.println("After sort?");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " +array[i]);
		}
	}
	
	public static void insertionSort(int[] arr, int n) {
		int j, v;
		//Fix the position for element to be sorted
		for(int i = 1; i <= n-1 ; i++) {
			v = arr[i];
			j = i-1;
			//Find the suitable pos for element(at i) to be inserted
			while(j >= 0 && arr[j] > v ) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = v;
		}
	}
}