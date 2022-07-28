package com.sort;

public class BubbleSort {
	
	public void bubbleSort(int[] arr, int n) {	
		System.out.println();
		//For number of Passes
		for (int pass = n-1; pass >= 0; pass--) {
			// Number of comparison in each pass
			for(int i = 0; i <= pass-1 ; i++) {
				//Swap adjacent elements
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}	
		}		
	}
}
