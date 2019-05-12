package com.dp;

public class OptimalCutMain {

	public static void main(String[] args) {
		System.out.println("Rod Cut Started : ");
		int[] price = new int[]{0,1,5,8,9,10,17,17,20};
		OptimalCut oCut = new OptimalCut(price);
		System.out.println("Maximum Profit : "+oCut.getMaxProfit());
	}

}
