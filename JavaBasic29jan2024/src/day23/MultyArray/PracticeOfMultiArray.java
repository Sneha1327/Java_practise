package day23.MultyArray;

import java.util.Arrays;

public class PracticeOfMultiArray {

	public static void main(String[] args) {
		int[][] marr = new int[][] {{2,3,4,6},{4,5,6,8},{1,2,4,6},{3,6,9,1}};
		System.out.println("lenght of array is: "+ marr.length);
		for(int i=0; i<marr.length; i++) {
			for(int j=0; j<marr[i].length; j++) {
				System.out.print(marr[i][j]+" ");
			}
			System.out.println();
		}
		int arr[]= {2,54,63,4,40};
		System.out.println("Element before sorting");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("Element after sorting");
		 Arrays.sort(arr);
		 for(int num:arr) {
				System.out.print(num+" ");
			}
		 System.out.println();
		 int[] ar=arr.clone();
		 for(int num:ar) {
			 System.out.print(num+" ");
		 }
		 System.out.println();
		 boolean result=Arrays.equals(arr, ar);//true
			System.out.println("Before sorting copyFrom array: "+result);
	}

}
