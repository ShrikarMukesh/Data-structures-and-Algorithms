package com.sort;

public class SortUtilities {

	public static boolean checkDuplicates(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i] == array[j])
					return true;
			}
		}
		return false;
	}
	
	//Sort an array of 0s,1s,2s
	public static void separate012(int[] array) {
		int[] temp_array = new int[3];
		for (int i = 0; i < temp_array.length; i++) {
			temp_array[i] = 0;
		}
		
		for (int i = 0; i < array.length; i++) {
			temp_array[array[i]]++;
		}
		int index = 0;
		for (int i = 0; i < temp_array.length; i++) {
			for (int j = 0; j < temp_array[i]; j++) {
				array[index] = i;
				index++;
			}
		}
	}
	
	//Sort an array of 0s,1s,2s
	public static void separate012Improved(int[] array) {
		int i=0, pos0=0, pos2=array.length-1;
		while(i < (array.length-1)) {
			if(array[i] == 0) {
				array[i] = array[pos0];
				array[pos0] = 0;
				pos0++;
			}
			if(array[i] == 2 &&  i<pos2) {
				array[i] = array[pos2];
				array[pos2] = 2;
				pos2--;
				i--;
			}
			i++;
		}
	}
}
