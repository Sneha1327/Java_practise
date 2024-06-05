package com.ArrayPrograms;

public class RotateAnArray2 {
	static void reverse(int[] a, int start, int end) {
		if(start<end) {
		int temp = a[start];
		a[start] = a[end];
		a[end] = temp;
		start++;
		end--;
		}
	}
	static void rotate(int[] a, int k) {
		k =k%a.length;//for left rotate like 4%7=4
		if(k<0) {
			k=k+a.length;//for right rotate like -4+7=3
		}
		reverse(a, 0, k-1);
		reverse(a, k, a.length-1);
		reverse(a, 0, a.length-1);
		
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		System.out.println("Element of Original Array");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		rotate(a, 2);
		System.out.println("Element of Rotated Array");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
