package com.ArrayPrograms;

import java.util.Arrays;

public class LargestNumUsingArrays {
	public static int getLargest(int[] a, int total) {
		//int total=a.length;
		if(total<2) {//{2}
			System.out.println("Invalid Inputs");
		}
		Arrays.sort(a);
		return a[total - 1];
	}
	public static int secondLargest(int[] a, int total) {
		Arrays.sort(a);
		return a[total - 2];
	}
	public static int thirdLargest(int[] a, int total) {
		Arrays.sort(a);
		return a[total - 3];
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Largest: " + getLargest(a, 6));
		System.out.println("Largest: " + getLargest(b, 7));
		
		System.out.println(" second Largest: " + secondLargest(a, 6));
		System.out.println("second Largest: " + secondLargest(b, 7));
		
		System.out.println("Third Largest: " + thirdLargest(a, 6));
		System.out.println("Third Largest: " + thirdLargest(b, 7));
	}
}