package com.ArrayPrograms;

public class SumAllItem {
	//static void sumOfArray(int[] arr, double sum) {

	public static void main(String[] args) {
	int[] arr = new int[] {32,45,16,7,48,1};
	System.out.println("Original Array");
	for(int num : arr) {
		System.out.print(num+" ");
		
	}
	System.out.println();
	 double sum=0;
	for (int number : arr) {
		sum +=  number; 
	}
	
	System.out.println("Sum = " + sum);

	}

}

