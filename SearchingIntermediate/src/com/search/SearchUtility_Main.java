package com.search;

public class SearchUtility_Main {

	public static void main(String[] args) {
		int[] arr = {2,2,2,3,2,4,5,6,3,5,6};
		System.out.println("Number Occuring Odd number of times : "+SearchUtilities.numOddTimes(arr));
		System.out.println("**********************************************");
		int[] array = {1,2,3,8,7,5,4,2};
		System.out.println("Sum Search : ");
		SearchUtilities.searchSum(array, 4);
		
		System.out.println("**********************************************");
		int[] tri_array = {1,3,4,8,9,13,25,35,20,10,9,6,5,2,0};
		System.out.println("Peak number in Bitonic Search is : "+SearchUtilities.bitonicSearch(tri_array));
		
		System.out.println("***********************************************");
		int[] first_last_Occur = {1,3,8,15,23,25,34,34,34,34,57,68,72,72};
		System.out.println("First Occurence of number : "+SearchUtilities.firstOccurence(first_last_Occur, 34));
		
		System.out.println("Last Occurence of a number : "+SearchUtilities.lastOccurence(first_last_Occur, 34));
		
		int[] index_array = {-5,-3,-2,0,2,3,5,7,10,12,18,24,35};
		System.out.println("Index with array[i] = i : "+SearchUtilities.searchForIndex(index_array));
		
		int[] unknownSize_array = {3,5,6,9,13,15,18,20,25,33,37,43,86,97,145,332,333,400,999,999,999,999,999,999,999,999,
				999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,};
		System.out.println("Find element in Unknown size array : " +SearchUtilities.searchElement(unknownSize_array, 400));
		
		int[] sort_rotated_array = {25,33,37,43,86,97,145,332,333,3,5,6,9,13,15,18,20};
		System.out.println("Pivotal Point for the array : " +SearchUtilities.findPivot(sort_rotated_array, 0, sort_rotated_array.length-1));
		
		System.out.println("Search for an element in the sorted rotated array : " +SearchUtilities.binSearchRotated(sort_rotated_array, 0,
				sort_rotated_array.length-1, 332));
		
		String[] string_array = {"ganga", "", "", "godavari", "", "", "", "kaveri", "", "",  "", "narmada","saraswathi", "","","sindhu","","", "yamuna","",""};
		System.out.println("Search for a string in a string array : " +SearchUtilities.searchString(string_array, "sindhu"));
		
		int[] maxSumContinuousSubSequence = {-2,11,-4,13,-5,2};
		System.out.println("Max Sum Sub Sequence : "+SearchUtilities.maxSumSubSequence(maxSumContinuousSubSequence, 0, maxSumContinuousSubSequence.length-1));
		
		int[] shuffle_array = {4,8,12,16,20,3,7,11,15,19};
		SearchUtilities.shuffleArray(shuffle_array);
		System.out.println("Shuffle Array: ");
		for (int i = 0; i < shuffle_array.length; i++) {
			System.out.print(" "+shuffle_array[i]);
		}
		System.out.println();
		
		int[] shuffle_array_two = {4,8,12,16,3,7,11,15};
		SearchUtilities.shuffleArrayImproved(shuffle_array_two);
		for (int i = 0; i < shuffle_array_two.length; i++) {
			System.out.print(" "+shuffle_array_two[i]);
		}
		System.out.println();
		int[][] matrix = {{15, 30,  50,  70,  73}, 
		 	 	  {35, 40, 100, 102, 120},
		 	 	  {36, 42, 105, 110, 125},
		 	 	  {46, 51, 106, 111, 130},
		 	 	  {48, 55, 109, 140, 150}};
		
		Coordinate c = SearchUtilities.findElement(matrix, 125);
		if (c != null) {
			System.out.println(125 + " is at : (" + c.row + ", " + c.column + ")");
		}
		
		int[] stock_values = {6,4,6,5,8,11,3,11,10,4,12,19,15};
		ProfitDuration profitDuration = SearchUtilities.maxProfitStrategy(stock_values);
		System.out.println(profitDuration.toString());
		
		/*int[] sorted_aOne = {1,3,5,7,9,11,13,15,17,19,56};
		int[] sorted_aTwo = {2,8,14,16,19,21};
		
		System.out.println("Median of Two sorted arrays : "+SearchUtilities.medianOfTwoArrays(sorted_aOne, sorted_aTwo));
		System.out.println("End");*/
		
	}
}
