package com.dp;

public class StringRelatedDPMain {
	public static void main(String[] args) {
		StringRelatedDP strDP = new StringRelatedDP();
		int[] a=new int[]{5,6,3,8,9,2,3,4,1,15,9,9};
		int max = +strDP.longestIncreasingSequence(a);
		System.out.println("Length of Longest Increasing Sequence = "+max);
		strDP.printLISTable();
		System.out.println("Print LIS : ");
		strDP.printLIS(max, a);
		System.out.println("Print LIS Recursive : ");
		strDP.printLISRecursive(max, a, a.length+1);

	}

}
