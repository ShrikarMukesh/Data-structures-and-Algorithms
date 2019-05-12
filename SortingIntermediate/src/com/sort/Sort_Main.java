package com.sort;
import java.util.Random;
public class Sort_Main {
	public static void main(String[] args) {
		
		BubbleSort bubble = new BubbleSort();
		int[] array = new int[10];
		Random rand = new Random();
		System.out.println("Before Bubble Sort");
		for (int i = 0; i < 10; i++) {
			array[i] = rand.nextInt(100);
			System.out.print(" " +array[i]);
		}
		System.out.println();
		bubble.bubbleSort(array, 10);
		System.out.println("After Bubble Sort");
		for (int i = 0; i < 10; i++) {
			System.out.print(" " +array[i]);
		}
		System.out.println();
		System.out.println("**********************************************");
			
		System.out.println("Before Selection Sort");
		for (int i = 0; i < 10; i++) {
			array[i] = rand.nextInt(100);
			System.out.print(" " +array[i]);
		}
		System.out.println();
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.selectionSort(array, 10);
			
		System.out.println("After Selection Sort");
		for (int i = 0; i < 10; i++) {
			System.out.print(" " +array[i]);
		}
		System.out.println();
			
		System.out.println("After Insertion Sort");
		for (int i = 0; i < 10; i++) {
			System.out.print(" " +array[i]);
		}
		System.out.println();
		System.out.println("**********************************************");
		
		System.out.println("Before Merge Sort");
		for (int i = 0; i < 10; i++) {
			array[i] = rand.nextInt(100);
			System.out.print(" " +array[i]);
		}
		System.out.println();
		MergeSort merge = new MergeSort();
		merge.mergeSort(array, 0, 9);
		
		System.out.println("After Merge Sort");
		for (int i = 0; i < 10; i++) {
			System.out.print(" " +array[i]);
		}
		System.out.println();
		System.out.println("**********************************************");
			
		System.out.println("Before Quick Sort");
		for (int i = 0; i < 10; i++) {
			array[i] = rand.nextInt(100);
			System.out.print(" " +array[i]);
		}
		System.out.println();
		QuickSort quick = new QuickSort();
		quick.quickSort(array, 0, 9);
			
		System.out.println("After Quick Sort");
		for (int i = 0; i < 10; i++) {	
			System.out.print(" " +array[i]);
		}
		System.out.println();
		System.out.println("**********************************************");
				
		System.out.println("Before Shell Sort");
		for (int i = 0; i < 10; i++) {
			array[i] = rand.nextInt(100);
			System.out.print(" " +array[i]);
		}
		System.out.println();
		ShellSort shell = new ShellSort();
		shell.shellSort(array, 10);
				
		System.out.println("After Shell Sort");
		for (int i = 0; i < 10; i++) {
			System.out.print(" " +array[i]);
		}
		System.out.println();
		System.out.println("**********************************************");
	}
}
