package com.ArrayPrograms;

public class PositionOfEvenOdd {
	static void evenPosition(int[] arr) {
		for(int i=2; i<arr.length; i=i+2) {
			System.out.println("Index of even position is: " +i +" and Value is: "+arr[i]);
			
		}
	}
	static void oddPosition(int[] arr) {
		for(int i=1; i<arr.length; i=i+2) {
			System.out.println("Index of odd position is: " +i +" and Value is: "+arr[i]);
			
		}
	}
	public static void main(String[] args) {
		int[] arr= new int[] {1,2,3,4,5,6,7,8};
		System.out.println("Original Array");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		evenPosition(arr);
		System.out.println("-----------------------");
		
		oddPosition(arr);
		System.out.println("--------------------");
	}

}
