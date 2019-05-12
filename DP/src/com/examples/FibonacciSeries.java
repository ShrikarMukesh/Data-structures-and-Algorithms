package com.examples;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		//System.out.println(fib1(7));
        System.out.println(fib5(8));
	}
	// Method 1 ( Use recursion ) 
	static int fib1(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}else {
			return fib1(n-1)+fib1(n-2);
		}
	}
	// Method 2 ( Use Dynamic Programming )
	static int fib2(int n)
	{
		/* Declare an array to store Fibonacci numbers. */
		int f[] = new int[n+2]; // 1 extra to handle case, n = 0
		int i;
		/* 0th and 1st number of the series are 0 and 1*/
		f[0] = 0;
		f[1] = 1;

		for (i = 2; i <= n; i++)
		{
			/* Add the previous 2 numbers in the series
         and store it */
			f[i] = f[i-1] + f[i-2];
		}
		return f[n];
	}
	//Method 3 ( Space Optimized Method 2 )
	static int fib3(int n){
		int a = 0, b = 1, c;
		if (n == 0) {
			return a;
		}
		for (int i = 2; i <= n; i++){
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
	//Method 4 ( Using power of the matrix {{1,1},{1,0}} )
	static int fib4(int n)
	{
		int F[][] = new int[][]{{1,1},{1,0}};
		if (n == 0)
			return 0;
		power(F, n-1);

		return F[0][0];
	}

	/* Helper function that multiplies 2 matrices F and M of size 2*2, and
	     puts the multiplication result back to F[][] */
	static void multiply(int F[][], int M[][])
	{
		int x =  F[0][0]*M[0][0] + F[0][1]*M[1][0];
		int y =  F[0][0]*M[0][1] + F[0][1]*M[1][1];
		int z =  F[1][0]*M[0][0] + F[1][1]*M[1][0];
		int w =  F[1][0]*M[0][1] + F[1][1]*M[1][1];

		F[0][0] = x;
		F[0][1] = y;
		F[1][0] = z;
		F[1][1] = w;
	}
	/* Helper function that calculates F[][] raise to the power n and puts the
	    result in F[][]
	    Note that this function is designed only for fib() and won't work as general
	    power function */
	static void power(int F[][], int n){
		int i;
		int M[][] = new int[][]{{1,1},{1,0}};
		// n - 1 times multiply the matrix to {{1,0},{0,1}}
		for (i = 2; i <= n; i++)
			multiply(F, M);
	}
	static int fib5(int n) {
		
		  int[] f=new int[7];
		if(f[n] !=-1) {
			return f[n];
		}
		if(n==0) {
		   return f[n]=0;	
		}
		if(n==1) {
		   return f[n]=1;
		   
		}else {
			return f[n] = fib5(n-1)+fib5(n-2);
		}	
	}
}
