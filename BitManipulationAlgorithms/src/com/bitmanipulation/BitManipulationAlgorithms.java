package com.bitmanipulation;

public class BitManipulationAlgorithms {

	//Count number of bits in the Integer 
		public static int bitCount(int num) {
		   int count = 0;
		   while(num>0) {
			    if(num%2 == 1) {
					count++;
				}
				num = num/ 2;
			}
			return count;
		}
		
		//Count the number of bits in the Integer (bit wise)
		// can be improved by checking if num != 0
		public static int bitCountBin(int num) {
			int count = 0;
			for (int i = 0; i < Integer.SIZE; i++) 
			//while(num!=0)
			{
				if((num&1)==1)
					count++;
				num=num>>1;
			}
			return count;
		}
		
		public static int add(int a, int b) {
			if(b==0)
				return a;
			int sum = a^b;
			int carry = (a&b)<<1;
			return add(sum,carry); 
		}
		
		public static int addInter(int a, int b) {
			
			while(b!=0) {
			int sum = a^b;
			int carry = (a&b)<<1;
			a=sum;
			b=carry;
			}
			
			return a; 
		}
		
		public static int subtract(int a, int b) {
			int twosCompOfb = ~(b)+1; 
			
			return add(a,twosCompOfb);
		}
		
		public static int mul(int a, int b) {
			int ans=0;
			int num1 = Math.abs(a);
			int num2 = Math.abs(b);
			int sign = ((a^b)>>31)&1;
			while(num2 !=0) {
				if((num2&1)==1)
					ans+=num1;
				num2 >>= 1;
				num1 <<= 1;
			}
			
			
			return (sign==1)?(~ans+1):ans;
		}
		
		// can be improved by checking if num != 0
		public static String intToBinString(int num) {
			StringBuilder strBin = new StringBuilder();
			for (int i = 0; i < Integer.SIZE; i++) {
				if((num&1)==1)
					strBin.append('1');
				else
					strBin.append('0');
				num=num>>1;
			}
			return strBin.reverse().toString();
		}

		
		//Divide bitwise
		public static int divide(int dividend, int divisor) 
		{
		     int quotient = 1;
		    int neg = 1;
		    if ((dividend>0 &&divisor<0)||(dividend<0 && divisor>0))
		            neg = -1;
		    //convert to positive
		     int tempdividend = (dividend < 0) ? -dividend : dividend;
		     int tempdivisor = (divisor < 0) ? -divisor : divisor;

		     if (tempdivisor == tempdividend) {
		        return 1*neg;
		     } 
		     else if (tempdividend < tempdivisor) {          
		              return 0;
		     }   
		    while (tempdivisor<<1 <= tempdividend)
		    {

		        tempdivisor = tempdivisor << 1;
		        quotient = quotient << 1;

		     } 
		    
		    // Call division recursively
		    if(dividend < 0)
		        quotient = quotient*neg + divide(-(tempdividend-tempdivisor)  , divisor);
		    else
		        quotient = quotient*neg + divide(tempdividend-tempdivisor  , divisor);
		     return quotient;
		 }
		
		public static int unsignedDivide(int dividend, int divisor){
			int quotient = 1;
			int tempdividend = dividend;
			int tempdivisor = divisor;
			if (tempdivisor == tempdividend) {
		        return 1;
		     } 
		     else if (tempdividend < tempdivisor) {          
		              return 0;
		     }   
		    while (tempdivisor<<1 <= tempdividend)
		    {
		    	tempdivisor = tempdivisor << 1;
		        quotient = quotient << 1;
		     }
		    
		    quotient = quotient+unsignedDivide(tempdividend-tempdivisor, divisor);
		     
		    return quotient;	
		}
	
}
