package com.examples;
class MaxSum{
	int[] input;
	int[] meta;
	int max;
	public MaxSum(int[] in) {
		input = in;
		meta = new int[input.length];
		max =0;
	}
	public int maxCountSum(int[] a){

		if(a[0] >0) {
			meta[0] =a[0];
		}else {
			meta[0] =0;
		}
		for(int i=1;i<a.length;i++) {
			if(meta[i-1] +a[i] > 0) {
				meta[i] = meta[i-1] + a[i];
			}else {
				meta[i] =0;
			}
		}
		for(int i =0;i<meta.length;i++) {

			if(max<a[i]) {
				max =meta[i];
			}
		}
		return max;	
	}
}
public class Largest_Sum_Contiguous_Subarray {

	public static void main(String[] args) {
		int[] a = {5,-3,-1,-6,11,-4,13,-5,2};
		int size = a.length;

		MaxSum m = new MaxSum(a);
		System.out.println(m.maxCountSum(a));
		/*
		 * ***********************************
		 */
		maxSubArraySumWithIndexes(a);
		System.out.println(max_Count_Sum(a));
		System.out.println("Maximum contiguous sum is " +
				maxSubArraySum(a));
		System.out.println("Maximum contiguous sum is "
				+ maxSubArraySum(a, size));

	}
	//It Finds the Maximum sum and also prints start to end index
	static void maxSubArraySumWithIndexes(int a[]){
		
		int max_so_far = Integer.MIN_VALUE,
				max_ending_here = 0,start = 0,
				end = 0, s = 0;

		for (int i = 0; i < a.length; i++) 
		{
			max_ending_here += a[i];

			if (max_so_far < max_ending_here) 
			{
				max_so_far = max_ending_here;
				start = s;
				end = i;
			}

			if (max_ending_here < 0) 
			{
				max_ending_here = 0;
				s = i + 1;
			}
		}
		System.out.println("Maximum contiguous sum is "
				+ max_so_far);
		System.out.println("Starting index " + start);
		System.out.println("Ending index " + end);
	}
	public static int max_Count_Sum(int[] a) {
		int max_Sum = 0;
		int cur_Sum = 0;
		for(int i=0;i<a.length;i++) {
			cur_Sum=0;
			for(int j=i;j<a.length;j++) {

				cur_Sum = cur_Sum + a[j];
				if(cur_Sum > max_Sum) {
					max_Sum = cur_Sum;
				}
			}
		}
		return max_Sum;
	}
	static int maxSubArraySum(int a[])
	{
		int size = a.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < size; i++)
		{
			max_ending_here = max_ending_here + a[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}
	static int maxSubArraySum(int a[], int size)
	{
		int max_so_far = a[0];
		int curr_max = a[0];

		for (int i = 1; i < size; i++)
		{
			curr_max = Math.max(a[i], curr_max+a[i]);
			max_so_far = Math.max(max_so_far, curr_max);
		}
		return max_so_far;
	}

}
