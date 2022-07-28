package com.search;

import java.util.Arrays;

public class SearchUtilities {

	public static int numOddTimes(int[] array) {
		int num_Oddtimes = array[0];
		for (int i = 1; i < array.length; i++) {
			num_Oddtimes^=array[i];
		}
		return num_Oddtimes;
	}
    
	public static void searchSum(int[] array, int sum) {
		//Sort the elements.
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(" "+array[i]);
		}
		System.out.println();
		int i=0;
		int j = array.length-1;
		while(i<j)
		{
			if(array[i]+array[j] == sum) {
				System.out.println("Nums are "+array[i]+" and "+array[j]);
				i++;
				j--;
			}
			else if(array[i]+array[j] < sum) {
				i++;
			}
			else {
				j--;
			}
		}	
	}

	public static int bitonicSearch(int[] arr) {
		int high = arr.length;
		return bitonicSearch(arr, 0, high);
	}

	//Bitonic Search
	private  static int bitonicSearch(int[] arr,int low, int high) {
		while(low <= high) {
			if(low == high) {
				return arr[low];
			}
			else if(low+1==high) {
				return Math.max(arr[low], arr[high]);
			}
			else {
				int mid = low + (high-low)/2;
				if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]) { 
					return arr[mid];
				}
				else if(arr[mid-1] < arr[mid] && arr[mid] < arr[mid+1]) {
					low = mid + 1;
				}
				else if(arr[mid-1] > arr[mid] && arr[mid] > arr[mid+1]) {
					high = mid - 1;
				}
			}
		}
		return -1;	
	}

	//First Occurence of a number
	public static int firstOccurence(int[] array, int key) {
		int high = array.length-1;
		return firstOccurence(array,key,0,high);
	}

	//
	private static int firstOccurence(int[] arr, int value, int low, int high) {
		while(low <= high) {
			int mid = low + (high-low)/2;
			if((low == mid && arr[mid] == value) || (arr[mid] == value && arr[mid-1] < arr[mid])) 
				return mid;
			else if(arr[mid] >= value) 
				high = mid - 1;
			else 
				low = mid + 1;
		}
		return -1;	
	}

	//Last Occurence of a number
	public static int lastOccurence(int[] array,int key) {
		int high = array.length-1;
		return lastOccurence(array, key,0,high);		
	}

	private static int lastOccurence(int[] arr, int value, int low, int high) {
		while(low <= high) {
			int mid = low + (high-low)/2;
			if((high == mid && arr[mid] == value) || (arr[mid] == value && arr[mid] < arr[mid+1])) 
				return mid;
			else if(arr[mid] <= value) 
				low = mid + 1;
			else 
				high = mid - 1;
		}
		return -1;
	}

	//Median of two sorted arrays
	public static float medianOfTwoArrays(int[] arrayOne, int[] arrayTwo) {
		int highOne = arrayOne.length - 1;
		int highTwo = arrayTwo.length - 1;
		return medianOfTwoArrays(arrayOne, 0, highOne,arrayTwo, 0, highTwo);	
	}

	private static float medianOfTwoArrays(int[] arrayOne, int lowOne, int highOne,
			int[] arrayTwo, int lowTwo, int highTwo) {

		while((lowOne <= highOne) && (lowTwo <= highTwo)) {
			System.out.println("Low One : "+lowOne+" High One : "+highOne+ " Low Two : " +lowTwo +" High Two : "+highTwo);
			int midOne = (int) (lowOne + Math.ceil((highOne-lowOne)/(double)2.0));
			int midTwo = (int)(lowTwo + Math.ceil((highTwo - lowTwo)/(double)2.0));

			if((lowOne == highOne-1 || lowOne==highOne) && (lowTwo == highTwo-1 || lowTwo==highTwo)) {
				System.out.println(" "+arrayOne[lowOne]+" "+arrayTwo[lowTwo]+" "+arrayOne[highOne]+" "+arrayTwo[highTwo]);
				return (((Math.max(arrayOne[lowOne], arrayTwo[lowTwo])) + (Math.min(arrayOne[highOne], arrayTwo[highTwo])))/(float)2.0);
			}
			else if(arrayOne[midOne] == arrayTwo[midTwo]) {
				System.out.println(" "+arrayOne[midOne] +" "+arrayTwo[midTwo]);
				return (arrayOne[midOne]+arrayTwo[midTwo])/(float)2.0;
			}
			else if(arrayOne[midOne] < arrayTwo[midTwo]) {
				lowOne = midOne;
				highTwo = midTwo;
			}
			else {
				highOne = midOne;
				lowTwo = midTwo;
			}
		}
		return 0;
	}

	//Search for index where array[i]=i in a sorted array
	public static int searchForIndex(int[ ] array) {
		int high = array.length - 1;
		return searchForIndex(array, 0, high);
	}

	//Search for index where array[i]=i in a sorted array
	private static int searchForIndex(int[] array, int low, int high) {

		while(low <= high) {
			int mid = low + (high-low)/2;
			if(array[mid] == mid) 
				return mid;
			else if(array[mid] < mid) 
				low = mid + 1;
			else 
				high = mid - 1;
		}
		return -1;
	}

	//Find an element in a sorted array of unknown size
	public static int searchElement(int[] array, int key) {
		int index=1;
		while(array[index] != 999) {
			index = 2*index;
		}
		return binarySearch(array, key, 0, index);
	}

	private static int binarySearch(int[] arr, int value, int low, int high) {
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

	//Find the Pivot in the sorted rotated array
	public static int findPivot(int[] array, int low,int high) {
		if(high == low) {
			return low;
		}

		if(low == high-1) {
			return Math.max(array[low], array[high]);
		}
		int mid = low + (high-low)/2;
		if(array[low] < array[mid])
			return findPivot(array, mid, high);
		else
			return findPivot(array, low, mid);
	}

	//Find an element in  sorted rotated array
	public static int binSearchRotated(int[] array, int low, int high,int data) {
		if(low>high)
			return -1;
		int mid = low + (high-low)/2;
		if(data == array[mid])
			return mid;
		if(array[low] <= array[mid]) {
			if(data >= array[low] && data < array[mid])
				return binSearchRotated(array, low, mid-1,data);
			else
				return binSearchRotated(array, mid+1, high,data);
		}
		else {
			if(data > array[mid] && data <= array[high])
				return binSearchRotated(array, mid+1, high, data);
			else 
				return binSearchRotated(array, low, mid-1, data);
		}
	}

	//Find a string in array of strings with empty strings interspersed
	public static int searchString(String[] strings, String str) {
		if(strings == null || str == null || str=="")
			return -1;
		return searchString(strings, 0, strings.length-1, str);
	}

	private static int searchString(String[] strings, int low, int high, String str) {		
		int mid = low + (high-low)/2;
		//Find the non empty string closest to middle
		if (strings[mid].isEmpty()) { 
			int left = mid - 1;
			int right = mid + 1;
			while (true) {
				if (left < low && right > high) {
					return -1;
				} else if (right <= high && !strings[right].isEmpty()) {
					mid = right;
					break;
				} else if (left >= low && !strings[left].isEmpty()) {
					mid = left;
					break;
				}
				right++;
				left--;
			}
		}

		//binary search for the string
		if (str.equals(strings[mid])) { // Found it!
			return mid;
		} else if (strings[mid].compareTo(str) < 0) { // Search right
			return searchString(strings, mid + 1, high, str);
		} else { // Search left
			return searchString(strings, low, mid - 1, str);
		}
	}

	//Maximum sum sub sequence in an array.
	public static int maxSumSubSequence(int[] array, int low, int high) {
		int maxLeftSum =0, maxRightSum=0, leftSum=0, rightSum=0;
		int maxLeftBorderSum=0, maxRightBorderSum=0;
		if(high == low) {

			return (array[low]>0)?array[low]:0;
		}

		int mid = low + (high-low)/2;

		maxLeftSum = maxSumSubSequence(array, low, mid);
		maxRightSum = maxSumSubSequence(array, mid+1, high);
		for (int i = mid; i >= low; i--) {
			leftSum += array[i];
			if(leftSum > maxLeftBorderSum)
				maxLeftBorderSum = leftSum;
		}
		for (int i = mid+1; i <= high; i++) {
			rightSum += array[i];
			if(rightSum > maxRightBorderSum)
				maxRightBorderSum = rightSum;
		}
		int maxLeftOrRight = Math.max(maxLeftSum, maxRightSum);

		return Math.max(maxLeftOrRight, maxRightBorderSum+maxLeftBorderSum);
	}

	public static void shuffleArray(int[] array) {
		int midIndex=array.length/2;

		for(int i=0, fromSwapIndex=1, toSwapIndex=midIndex; i < midIndex; i++,fromSwapIndex++,toSwapIndex++) {
			for(int j=toSwapIndex; j>i+fromSwapIndex; j--) {
				int temp = array[j-1];
				array[j-1]=array[j];
				array[j] = temp;
			}	
		}
	}

	public static void shuffleArrayImproved(int[] array) {
		shuffleArrayImproved(array, 0, array.length-1);
	}

	private static void shuffleArrayImproved(int[] array, int low, int high) {
		if(low==high) {
			return;
		}

		int centreIndex = (high+low)/2;
		int swapIndex = (centreIndex+low)/2;


		for(int k=1,i=swapIndex+1;i<=centreIndex;i++,k++) {
			int temp = array[i];
			array[i] = array[centreIndex+k];
			array[centreIndex+k] = temp;
		}

		shuffleArrayImproved(array, low, centreIndex);
		shuffleArrayImproved(array, centreIndex+1, high);
	}

	private static Coordinate partitionAndSearch(int[][] matrix, Coordinate origin, Coordinate dest, Coordinate pivot, int elem) {
		Coordinate lowerLeftOrigin = new Coordinate(pivot.row, origin.column);
		Coordinate lowerLeftDest = new Coordinate(dest.row, pivot.column - 1);
		Coordinate upperRightOrigin = new Coordinate(origin.row, pivot.column);
		Coordinate upperRightDest = new Coordinate(pivot.row - 1, dest.column);

		Coordinate lowerLeft = findElement(matrix, lowerLeftOrigin, lowerLeftDest, elem);
		if (lowerLeft == null) {
			return findElement(matrix, upperRightOrigin, upperRightDest, elem);
		}
		return lowerLeft;
	}

	private static Coordinate findElement(int[][] matrix, Coordinate origin, Coordinate dest, int x) {
		if (!origin.inbounds(matrix) || !dest.inbounds(matrix)) {
			return null;
		}
		if (matrix[origin.row][origin.column] == x) {
			return origin;
		} else if (!origin.isBefore(dest)) {
			return null;
		}

		/* Set start to start of diagonal and end to the end of the diagonal. Since
		 * the grid may not be square, the end of the diagonal may not equal dest.
		 */
		Coordinate start = (Coordinate) origin.clone();
		int diagDist = Math.min(dest.row - origin.row, dest.column - origin.column);
		Coordinate end = new Coordinate(start.row + diagDist, start.column + diagDist);
		Coordinate p = new Coordinate(0, 0);

		/* Do binary search on the diagonal, looking for the first element greater than x */
		while (start.isBefore(end)) {
			p.setToAverage(start, end);
			if (x > matrix[p.row][p.column]) {
				start.row = p.row + 1;
				start.column = p.column + 1;
			} else {
				end.row = p.row - 1;
				end.column = p.column - 1;
			}
		}

		/* Split the grid into quadrants. Search the bottom left and the top right. */ 
		return partitionAndSearch(matrix, origin, dest, start, x);
	}

	public static Coordinate findElement(int[][] matrix, int x) {
		Coordinate origin = new Coordinate(0, 0);
		Coordinate dest = new Coordinate(matrix.length - 1, matrix[0].length - 1);
		return findElement(matrix, origin, dest, x);
	}

	public static ProfitDuration maxProfitStrategy(int[] stockPrices) {
		return maxProfitStrategy(stockPrices, 0, stockPrices.length-1);
	}

	private static ProfitDuration maxProfitStrategy(int[] stockPrices, int low,int high) {

		if(high == low+1) {
			if((stockPrices[high]-stockPrices[low]) > 0) {
				return new ProfitDuration((stockPrices[high]-stockPrices[low]), low, high);
			}
			else{
				return new ProfitDuration(0, low, high);
			}
		}

		int mid = low+(high-low)/2;

		ProfitDuration leftProfit = maxProfitStrategy(stockPrices, low, mid);
		ProfitDuration rightProfit = maxProfitStrategy(stockPrices, mid, high);
		int minLeft = minimum(stockPrices, low, mid);
		int maxRight = maximum(stockPrices, mid, high);

		int leftrightProfit = ((stockPrices[maxRight]-stockPrices[minLeft])>0)?(stockPrices[maxRight]-stockPrices[minLeft]):0;

		if(leftProfit.getProfit()>=Math.max(rightProfit.getProfit(), leftrightProfit))
			return leftProfit;
		else if(rightProfit.getProfit()>=Math.max(leftProfit.getProfit(), leftrightProfit))
			return rightProfit;
		else
			return new ProfitDuration(leftrightProfit, minLeft, maxRight);

	}

	private static int maximum(int[] stockPrices, int mid, int high) {

		int max = mid;
		for (int i = mid+1; i <= high; i++) {
			if(stockPrices[i]>stockPrices[max])
				max=i;
		}

		return max;
	}

	private static int minimum(int[] stockPrices, int low, int mid) {
		int min=low;
		for (int i = low+1; i <= mid; i++) {
			if(stockPrices[i]< stockPrices[min])
				min=i;
		}

		return min;
	}
}
