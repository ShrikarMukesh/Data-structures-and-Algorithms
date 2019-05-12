package com.sort;
public class MergeSort {
	public static void main(String[] args) {
		
		int[] a = {22,1,90,4,14,12,9,19,2,3};
		MergeSort m = new MergeSort();
		int size = a.length-1;
		m.mergeSort(a, 0, size);
		System.out.println("After Merge Sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " +a[i]);
		}
	}
	public void mergeSort(int[] arr, int low, int high) {
		int mid;
		if(low != high) {
			mid = (low+high)/2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			merge(arr , low, mid, high);
		}
	}
	private void merge(int[] arr, int low, int mid, int high) {
		
		int[] temp = new int[10];
		int i = low;
		int j = mid+1;
		int k = low;		
		while(i <= mid && (j <= high)) {
			if(arr[i] <= arr[j]) {
				temp[k] = arr[i];
				k++;
				i++;
			}
			else {
				temp[k] = arr[j];
				k++;
				j++;
			}
		}
		while(i <= mid) {
			temp[k] = arr[i];
			k++;
			i++;
		}
		while(j <= high) {
			temp[k] = arr[j];
			k++;
			j++;
		}
		
		for(i = low; i <= high; i++) {
			arr[i] = temp[i];
		}	
	}
}
