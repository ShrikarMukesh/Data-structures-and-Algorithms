package com.sort;

public class SelectionSort {
	
	public void selectionSort(int[] arr, int n) {
		//Select the index of min at i
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			//Find the exact position of min element
			for(int j = i + 1 ; j < arr.length ; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			//If min and i are at different position then swap
				if(min != i) {
					int temp = arr[min];
					arr[min] = arr[i];
					arr[i] = temp;
				}		
		}
	}
}
