package com.dp;

public class LongestPalindromeSubsequenceMain {
	public static void main(String[] args) {
		/*
		String str = new String("mcakyam");
		LongestPalindromeSubsequence lpSequence=new LongestPalindromeSubsequence();
		System.out.println("Length of Longest Palindrome Subsequence : "+lpSequence.lPSubsequence(str));
		lpSequence.printLPSequenceTable();
		System.out.println("LP Sequence : "+lpSequence.printLPSequence(str));
		
		StringBuffer strB = new StringBuffer();
		System.out.println("Length of LP Subsequence recursive : "+lpSequence.printLPSRecur(str, 0, str.length()-1, strB));
		
		LongestCommonSubstring lpSubstring = new LongestCommonSubstring();
		System.out.println("Longest Palindrome Substring :  "+lpSubstring.longPalinSubstring(str));*/
		
		//Making Change Problem
		MakingChange mk=new MakingChange(60);
		System.out.println("Num of Coins : "+mk.makingChange());
		System.out.println("Printing Table : " );
		mk.printMinTable();
		mk.printDenoms(60);
		
		//Matrix Multiplication
		MatrixMultiplication mp= new MatrixMultiplication();
		int[] a=new int[]{3,100,2,2,50,5};
		System.out.println(" Minimum Operations : "+mp.multiplyOrder(a));
		mp.printMulData();
		System.out.println("Break Matrix");
		mp.breakpointMatrix();
		System.out.println(" Print Matrix Multiplication Order  : ");
		mp.printMulOrder(1, 5);
		
		/*//Optimal BST
		OptimalBST optBST = new OptimalBST();
		double[] prob = new double[]{0.0,0.375,0.375,0.125,0.125};
		System.out.println(" Optimal Prob: "+optBST.optimalOrder(prob));
		optBST.printOptData();
		System.out.println("Break Martix for Opt BST : ");
		optBST.breakpointMatrix();*/

	}

}
