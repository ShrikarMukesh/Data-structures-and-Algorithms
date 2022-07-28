package com.sort;

 public class ShellSort {
	
	public void  shellSort(int[] a, int n) {
		int temp = 0,j;
		for(int gap=n/2;gap>0;gap=gap/2){
			
			for(int i=0;i<n;i=i+gap){
				
				temp=a[i];
			for( j=i;j>0&&a[j-gap]>temp;j=j-gap){
				a[j]=a[j-gap];
			}
			a[j]=temp;
			}
		}
	
	}

}
