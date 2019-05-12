package com.search;

class BinarySearch {
	public static void main(String[] args) {
		
		System.out.println("Before Binary Search");
		int[ ] arr = new int[] {12,34,45,67,79,87,95,100,108,203};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " +arr[i]);
		}
		System.out.println();
		System.out.println("Searching for 87 : ");	
		System.out.println(" : " + binarySearch(arr, 87, 0, 9));
		System.out.println(" : " + binarySearchIterative(arr, 87, 0, 9));		
	}
	public static int binarySearch(int[] arr, int value, int low, int high) {
		
		if(low>high){	
			return -1;
		}
		int mid =low + (high-low)/2;
		if(arr[mid] == value) {
			return mid;
		}
		else if(arr[mid] < value) {
			return binarySearch(arr, value, mid+1, high);
		}
		else {
			return binarySearch(arr, value,low , mid-1);
		}
	}
	public static int binarySearchIterative(int[] arr, int value, int low, int high) {		
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(arr[mid] == value) 
				return mid;
			else if(arr[mid] < value) 
				low = mid + 1;
			else 
				high = mid - 1;
		}
		return -1;	
	}
}