package com.bitmanipulation;

public class TestBitManipulation {
	public static void main(String[] args) {
		
		System.out.println("Number of bits in : " +BitManipulationAlgorithms.bitCount(43));
		System.out.println("Integer Size =  " +Integer.SIZE);
		int num = 8;
				num = num <<1;
		System.out.println("Num Multiplied by 2 : " +num);
		num >>= 3;
		System.out.println("Num divided by 8 : " +num);
		System.out.println("Number of bits in 43: " +BitManipulationAlgorithms.bitCountBin(43));
		System.out.println("Number of bits in -43: " +BitManipulationAlgorithms.bitCountBin(-43));
		//Integer intnum;
		System.out.println(" " +Integer.bitCount(-43));
		
		System.out.println("Binary Addition = "+BitManipulationAlgorithms.addInter(57, 82));
		@SuppressWarnings("unused")
		int intsum = Integer.MAX_VALUE;
		//System.out.println("Binary Addition : " +BitManipulationAlgorithms.add(intsum, intsum));
		System.out.println("Int to Binary String : "+BitManipulationAlgorithms.intToBinString(567));
		System.out.println("Binary Multiplication : "+BitManipulationAlgorithms.mul(25, -7));
		System.out.println("Division by bit Manipulation " +BitManipulationAlgorithms.divide(180, -25));
		System.out.println("Unsigned Division by bit Manipulation " +BitManipulationAlgorithms.unsignedDivide(155,25));
		System.out.println("Binary Subtraction  : "+BitManipulationAlgorithms.subtract(25, 7));

	}

}
