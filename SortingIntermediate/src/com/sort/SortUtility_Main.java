package com.sort;

public class SortUtility_Main {
	
	public static void main(String[] args) {
		
		int[] arr = {5,10,15,25,8,13,3,2};
		System.out.println("Check for Duplicates : "+SortUtilities.checkDuplicates(arr));
		int[] array = {0,0,0,2,1,0,2,1,0,1,2,2,0,2};
		SortUtilities.separate012(array);
		System.out.println("Sorted Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" "+array[i]);
		}
		System.out.println();	
		int[] array_improved = {0,0,0,2,1,0,2,1,0,1,2,2,0,2};
		SortUtilities.separate012Improved(array_improved);
		for (int j = 0; j < array_improved.length; j++) {
			System.out.print(" "+array_improved[j]);
		}
	}

}
