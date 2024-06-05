package com.ArrayPrograms;

public class MaxNumMinNumArray {
	static void min(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i]; 
			}
		}
		System.out.println("Min number in array is: " + min);
	}

	static void max(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Max number in array is: " + max);
	}

	public static void main(String[] args) {
		int[] a= new int[] { 33, 66, 4, 90,15,3,76 };
		System.out.println("Element of array is");
		for(int num : a) {
			System.out.print(num+" ");
		}
			System.out.println();
			MaxNumMinNumArray.min(a);
			MaxNumMinNumArray.max(a);
		
			
		
	}

}
