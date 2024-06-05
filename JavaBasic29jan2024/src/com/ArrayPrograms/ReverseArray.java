package com.ArrayPrograms;

public class ReverseArray {
	//static reverse method
	/*static void reverseArray2(int[] ar) {
		int i = 0, j = ar.length - 1;
		while (i < j) {
			int temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
			i++;
			j--;
		}
	}*/
	//non- static reverse method
	void reverseArray(int[] ar) {
		int i = 0, j = ar.length - 1;
		while (i < j) {
			int temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
		ReverseArray ra = new ReverseArray();
		int[] ar = new int[] { 10, 20, 30, 40, 50 };
		System.out.println("original elements");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		ra.reverseArray(ar);
		//reverseArray2(ar);
		System.out.println();
		System.out.println("Reverse elements");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}
