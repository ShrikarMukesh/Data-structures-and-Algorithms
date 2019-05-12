package com.sort;

public class QuickSort {

	public void  quickSort(int[]arr, int low, int high) {
		int pivot;
		if(low < high) {
			pivot = partition(arr,low,high);
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
		}
	}
	private int partition(int[] arr, int low, int high) {
		int i, j, temp, key;
		key = arr[low];
		i = low;
		j = high;
		while(i < j) {
			while(i <= high && key >= arr[i]) {
				i++;
			}
			while( key < arr[j]) {
				j--;
			}

			if(i < j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;

			return j;
	}
}
